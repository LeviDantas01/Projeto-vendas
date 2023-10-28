package br.com.projeto.model;

public class Vendas {

    private int id;
    private Clientes clientesId;
    private String dataVenda;
    private int tatalVenda;
    private String obs;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clientes getClientesId() {
        return clientesId;
    }

    public void setClientesId(Clientes clientesId) {
        this.clientesId = clientesId;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getTatalVenda() {
        return tatalVenda;
    }

    public void setTatalVenda(int tatalVenda) {
        this.tatalVenda = tatalVenda;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}
