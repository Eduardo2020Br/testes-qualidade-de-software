package br.com.lojinha.pojo;

public class ItemIncluso {
    /*public String nome;
     *public int quantidade;*/
    // para encapsular vou ter que mudar os modificadores dos atributos
    private String nome;
    private int quantidade;

    // Construtor para ItemIncluso
    public ItemIncluso(String nomeInicial, int quantidadeInicial) {
        this.nome = nomeInicial;
        this.quantidade = quantidadeInicial;
    }

    //tenho que criar um METODO GET pra ele
    public String getNome() {
        return this.nome; // nesse objeto(this) devolvo o nome (o this n é necessário).
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
