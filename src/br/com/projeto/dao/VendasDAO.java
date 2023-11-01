package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
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

    public List<Vendas> listarVendasPorPeriodo(LocalDate dataInicio, LocalDate dataFim) {
        try {
            List<Vendas> lista = new ArrayList<>();

            String sql = "SELECT v.id, date_format(v.data_venda, '%d/%m/%Y') AS data_formatada, c.nome, v.total_venda, v.observacoes " +
                    "FROM tb_vendas AS v INNER JOIN tb_clientes AS c ON(v.cliente_id = c.id) WHERE v.data_venda BETWEEN ? AND ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dataInicio.toString());
            ps.setString(2, dataFim.toString());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Vendas vendas = new Vendas();
                Clientes clientes = new Clientes();

                vendas.setId(rs.getInt("v.id"));
                vendas.setDataVenda(rs.getString("data_formatada"));
                clientes.setNome(rs.getString("c.nome"));
                vendas.setTatalVenda(rs.getDouble("v.total_venda"));
                vendas.setObs(rs.getString("v.observacoes"));

                vendas.setCliente(clientes);
                lista.add(vendas);
            }

            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro" + e);
            return null;
        }
    }

}
