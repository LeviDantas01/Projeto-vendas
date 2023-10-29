package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.ItemVenda;

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

}
