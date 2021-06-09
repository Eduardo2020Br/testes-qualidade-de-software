package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {

    private String nome;  // ATRIBUTO encapsulado
    private String marca;
    //private double valor; // quero definir que seja != 0
    protected double valor; // tive que mudar devido ProdutoInternacional ter HERDADO e ser diferente
    private Tamanho tamanho;

    // private List<String> itensInclusos; era String e passa para ItemIncluso
    private List<ItemIncluso> itensInclusos;
    // Construtor , estrutura: modificador Classe() {} funciona = metodo (passa param)
    // não tem return , não tem tipo
    public Produto(String marcaInicial, Tamanho tamanhoInicial) {
        this.marca = marcaInicial; // quem for dar new Produto tem que informar!!!
        this.tamanho = tamanhoInicial;
     }

    // METODO para definir valor
    public double getValor() {   // crio METODO para quem for usar "valor"
        return this.valor;
    }
    // valor tem que positivo
    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("VALOR INVÁLIDO!");
        }
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }
    public void setTamanho(Tamanho novoTamanho) {
           this.tamanho = novoTamanho;
    }

    public List<ItemIncluso> getItensInclusos() {
        return this.itensInclusos;
    }
    public void setItensInclusos(List<ItemIncluso> novoIten) {
        this.itensInclusos = novoIten;
    }
}