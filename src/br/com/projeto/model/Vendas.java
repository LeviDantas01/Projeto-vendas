package br.com.projeto.model;

public class Vendas {

    private int id;
    private Clientes cliente;
    private String dataVenda;
    private double tatalVenda;
    private String obs;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes clientesId) {
        this.cliente = clientesId;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getTatalVenda() {
        return tatalVenda;
    }

    public void setTatalVenda(double tatalVenda) {
        this.tatalVenda = tatalVenda;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}
