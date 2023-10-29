package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Vendas;

public class VendasDAO {

    private Connection con;

    public VendasDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrarVenda(Vendas obj) {

        try {
            String sql = "INSERT INTO tb_vendas (cliente_id,data_venda,total_venda,observacoes) VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, obj.getCliente().getId());
            ps.setString(2, obj.getDataVenda());
            ps.setDouble(3, obj.getTatalVenda());
            ps.setString(4, obj.getObs());

            ps.execute();
            ps.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro." + e);
        }

    }

    public int retornaUltimaVenda() {
        try {
            int idVenda = 0;

            String sql = "SELECT max(id) id FROM tb_vendas";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Vendas venda = new Vendas();
                venda.setId(rs.getInt("id"));
                idVenda = venda.getId();
            }
            return idVenda;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
