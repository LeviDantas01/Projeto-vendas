package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.ItemVenda;
import br.com.projeto.model.Produtos;

public class ItemVendaDAO {
    private Connection con;

    public ItemVendaDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastraItem(ItemVenda itemVenda) {
        try {
            String sql = "INSERT INTO tb_itensvendas (venda_id, produto_id, qtd, subtotal) VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, itemVenda.getVendas().getId());
            ps.setInt(2, itemVenda.getProdutos().getId());
            ps.setInt(3, itemVenda.getQtd());
            ps.setDouble(4, itemVenda.getSubTotal());

            ps.execute();
            ps.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro." + e);
        }
    }

    public List<ItemVenda> listaItemPorVenda(int vendaId) {

        List<ItemVenda> lista = new ArrayList<>();

        try {
            String sql = "SELECT i.id, p.descricao, i.qtd, p.preco, i.subtotal FROM " +
                    " tb_itensvendas AS i INNER JOIN tb_produtos AS p ON(i.produto_id = p.id) WHERE i.venda_id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vendaId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ItemVenda item = new ItemVenda();
                Produtos produtos = new Produtos();

                item.setId(rs.getInt("i.id"));
                produtos.setDescricao(rs.getString("p.descricao"));
                item.setQtd(rs.getInt("i.qtd"));
                produtos.setPreco(rs.getDouble("p.preco"));
                item.setSubTotal(rs.getDouble("i.subtotal"));

                item.setProdutos(produtos);

                lista.add(item);
            }

            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
