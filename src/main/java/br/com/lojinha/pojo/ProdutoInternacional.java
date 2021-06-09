package br.com.lojinha.pojo;

import br.com.lojinha.Interfaces.Favorito;
import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaDeImportaçao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super (marcaInicial, tamanhoInicial);
    }
    // copiado de produto e aparece a marca oÎ ao lado esquerdo (sobre escrendo metodo)
    public void setValor(double novoValor) {
        // sobre escrito pq mais de um HERDA e nesse caso é diferente ou seja POLIMORFISMO
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("VALOR deve ser > -R$100");
        }
    }

    public double getTaxaDeImportaçao() {
        return this.taxaDeImportaçao;
    }
    public  void setTaxaDeImportaçao(double novaTaxaDeImportaçao) {
        this.taxaDeImportaçao = novaTaxaDeImportaçao;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
