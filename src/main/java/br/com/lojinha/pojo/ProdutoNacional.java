package br.com.lojinha.pojo;

import br.com.lojinha.Interfaces.Favorito;
import br.com.lojinha.enums.Tamanho;

    //public class ProdutoNacional extends Produto { vai assinar contrato interface abaixo...
    public class ProdutoNacional extends Produto implements Favorito{
    //para encapsular tornei  privado e crio 2 metodos
    private double impostoNacional;

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }
    // 1ro metodo para o encapsulamento
    public double getImpostoNacional() {
        return this.impostoNacional;
    }
    // 2do metodo para o encapsulamento
    public  void setImpostoNacional(double novoImpostoNacional) {
        this.impostoNacional = novoImpostoNacional;
    }
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    } // PS4, Sony e 30

}
