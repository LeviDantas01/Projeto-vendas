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

public class FornecedoresDAO {

    private Connection con;

    public FornecedoresDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrarFornecedor(Fornecedores obj) {
        try {
            String sql = "INSERT INTO tb_fornecedores (nome, cnpj, email, telefone, celular, cep, endereco," +
                    " numero, complemento, bairro, cidade, estado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getCnpj());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getTelefone());
            ps.setString(5, obj.getCelular());
            ps.setString(6, obj.getCep());
            ps.setString(7, obj.getEndereco());
            ps.setInt(8, obj.getNumero());
            ps.setString(9, obj.getComplemento());
            ps.setString(10, obj.getBairro());
            ps.setString(11, obj.getCidade());
            ps.setString(12, obj.getEstado());
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());
        }
    }

    public void alterarFornecedor(Fornecedores obj) {
        try {
            String sql = "UPDATE tb_fornecedores SET nome=?, cnpj=?, email=?, telefone=?, celular=?, cep=?, endereco=?,"
                    +
                    " numero=?, complemento=?, bairro=?, cidade=?, estado=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getCnpj());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getTelefone());
            ps.setString(5, obj.getCelular());
            ps.setString(6, obj.getCep());
            ps.setString(7, obj.getEndereco());
            ps.setInt(8, obj.getNumero());
            ps.setString(9, obj.getComplemento());
            ps.setString(10, obj.getBairro());
            ps.setString(11, obj.getCidade());
            ps.setString(12, obj.getEstado());
            ps.setInt(13, obj.getId());
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());
        }
    }

    public void excluirFornecedor(Fornecedores obj) {
        try {
            String sql = "DELETE FROM tb_fornecedores WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getId());
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());
        }
    }

    public List<Fornecedores> listarFornecedor() {

        try {

            List<Fornecedores> lista = new ArrayList<>();

            String sql = "SELECT * FROM tb_fornecedores";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Fornecedores obj = new Fornecedores();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setEstado(rs.getString("estado"));

                lista.add(obj);
            }

            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());
            return null;
        }

    }

    public Fornecedores consultaPorNome(String nome) {
        try {
            String sql = "SELECT * FROM tb_fornecedores WHERE nome = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            Fornecedores obj = new Fornecedores();

            if (rs.next()) {
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setEstado(rs.getString("estado"));

            }
            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            return null;
        }
    }

    public List<Fornecedores> buscaFornecedorPorNome(String nome) {

        try {

            List<Fornecedores> lista = new ArrayList<>();

            String sql = "SELECT * FROM tb_fornecedores WHERE nome LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Fornecedores obj = new Fornecedores();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setEstado(rs.getString("estado"));

                lista.add(obj);
            }

            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());
            return null;
        }

    }

}
