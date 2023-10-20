package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Funcionario;
import br.com.projeto.view.Frmmenu;

public class FuncionariosDAO {

    private Connection con;

    public FuncionariosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrarFuncionarios(Funcionario obj) {
        try {
            String sql = "INSERT INTO tb_funcionarios (nome, rg, cpf, email, senha, cargo, nivel_acesso, telefone, celular, cep, endereco,"
                    +
                    " numero, complemento, bairro, cidade, estado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getRg());
            ps.setString(3, obj.getCpf());
            ps.setString(4, obj.getEmail());
            ps.setString(5, obj.getSenha());
            ps.setString(6, obj.getCargo());
            ps.setString(7, obj.getNivelAcesso());
            ps.setString(8, obj.getTelefone());
            ps.setString(9, obj.getCelular());
            ps.setString(10, obj.getCep());
            ps.setString(11, obj.getEndereco());
            ps.setInt(12, obj.getNumero());
            ps.setString(13, obj.getComplemento());
            ps.setString(14, obj.getBairro());
            ps.setString(15, obj.getCidade());
            ps.setString(16, obj.getEstado());
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());
        }
    }

    public void alterarFuncionario(Funcionario obj) {
        try {
            String sql = "UPDATE tb_funcionarios SET nome=?, rg=?, cpf=?, email=?, senha=?, cargo=?, nivel_acesso=?, telefone=?, celular=?, cep=?, endereco=?,"
                    +
                    " numero=?, complemento=?, bairro=?, cidade=?, estado=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.setString(2, obj.getRg());
            ps.setString(3, obj.getCpf());
            ps.setString(4, obj.getEmail());
            ps.setString(5, obj.getSenha());
            ps.setString(6, obj.getCargo());
            ps.setString(7, obj.getNivelAcesso());
            ps.setString(8, obj.getTelefone());
            ps.setString(9, obj.getCelular());
            ps.setString(10, obj.getCep());
            ps.setString(11, obj.getEndereco());
            ps.setInt(12, obj.getNumero());
            ps.setString(13, obj.getComplemento());
            ps.setString(14, obj.getBairro());
            ps.setString(15, obj.getCidade());
            ps.setString(16, obj.getEstado());

            ps.setInt(17, obj.getId());
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());
        }
    }

    public void excluirFuncionario(Funcionario obj) {
        try {
            String sql = "DELETE FROM tb_funcionarios WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getId());
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());
        }
    }

    public List<Funcionario> listarFuncionarios() {

        try {

            List<Funcionario> lista = new ArrayList<>();

            String sql = "SELECT * FROM tb_funcionarios";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Funcionario obj = new Funcionario();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivelAcesso(rs.getString("nivel_acesso"));
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

    public Funcionario consultaPorNome(String nome) {
        try {
            String sql = "SELECT * FROM tb_funcionarios WHERE nome = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            Funcionario obj = new Funcionario();

            if (rs.next()) {
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivelAcesso(rs.getString("nivel_acesso"));
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

    public List<Funcionario> listaFuncionarioPorNome(String nome) {

        try {

            List<Funcionario> lista = new ArrayList<>();

            String sql = "SELECT * FROM tb_funcionarios WHERE nome LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Funcionario obj = new Funcionario();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivelAcesso(rs.getString("nivel_acesso"));
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

    public void efeturaLogin(String email, String senha) {
        try {

            String sql = "SELECT * FROM tb_funcionarios WHERE email = ? and senha = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Seja bem vindo");
                Frmmenu tela = new Frmmenu();
                tela.usuarioLogado = rs.getString("nome");
                tela.setVisible(true);


            } else {
                JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
        }
    }

}
