package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Fornecedores;
import br.com.projeto.model.Produtos;

public class ProdutosDAO {

    private Connection con;

    public ProdutosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrar(Produtos obj) {
        try {
            String sql = "INSERT INTO tb_produtos (descricao, preco, qtd_estoque, for_id) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getDescricao());
            ps.setDouble(2, obj.getPreco());
            ps.setInt(3, obj.getQtdEsoque());
            ps.setInt(4, obj.getFornecedor().getId());
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro" + e.getMessage());

        }
    }

    public List<Produtos> listaProdutos() {
        try {
            List<Produtos> lista = new ArrayList<>();

            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos AS p INNER JOIN tb_fornecedores as f ON(p.for_id = f.id)";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtdEsoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString("f.nome"));

                obj.setFornecedor(f);

                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro" + e.getMessage());
            return null;
        }
    }

    public void alterarProduto(Produtos obj) {

        try {
            String sql = "UPDATE tb_produtos SET descricao=?, preco=?, qtd_estoque=?,for_id=? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getDescricao());
            ps.setDouble(2, obj.getPreco());
            ps.setInt(3, obj.getQtdEsoque());

            ps.setInt(4, obj.getFornecedor().getId());

            ps.setInt(5, obj.getId());

            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro" + e);
        }

    }

    public void excluirProduto(Produtos obj) {
        try {
            String sql = "DELETE FROM tb_produtos where id=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getId());
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro" + e);
        }
    }

    public List<Produtos> listarProdutosPorNome(String nome) {
        try {
            List<Produtos> lista = new ArrayList<>();

            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos AS p INNER JOIN tb_fornecedores as f ON(p.for_id = f.id) WHERE p.descricao like ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtdEsoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString("f.nome"));

                obj.setFornecedor(f);

                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro" + e.getMessage());
            return null;
        }
    }

    public Produtos consultaPorNome(String nome) {
        try {

            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos AS p INNER JOIN tb_fornecedores as f ON(p.for_id = f.id) WHERE p.descricao = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();

            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();

            if (rs.next()) {

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtdEsoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString("f.nome"));

                obj.setFornecedor(f);

            }

            return obj;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro" + e.getMessage());
            return null;
        }
    }

}
