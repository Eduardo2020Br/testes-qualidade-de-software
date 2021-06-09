package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony & EJMco", Tamanho.GRANDE);

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(349.99);
        //meuProduto.setProduto("Nintendo"); // Pode ser mudado o vlr inicial CONSTRUTOR
        //meuProduto.setTamanho(Tamanho.PEQUENO);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle",2);
        itensInclusos.add(primeiroItemIncluso); //0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo",3);
        itensInclusos.add(segundoItemIncluso); //1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de Energia",2);
        itensInclusos.add(terceiroItemIncluso); //2

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getItensInclusos().get(2) + " é o iten 2 ");
        System.out.println(meuProduto.getMarca()); //  pega do CONSTRUTOR
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        // laços para acessar listas
        System.out.println("/////////// começou o laço //////////////");
        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
        System.out.println("/////////// acabou o laço //////////////");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional ("BRData", Tamanho.GRANDE );
        System.out.println(meuProdutoNacional.getMarca());
        System.out.println(meuProdutoNacional.getTamanho());

        meuProdutoNacional.setImpostoNacional(0.5564);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Nintendo",Tamanho.MEDIO);
        meuProdutoInternacional.setTaxaDeImportaçao(0.7765);
        System.out.println(meuProdutoInternacional.getTaxaDeImportaçao());

        meuProdutoNacional.setValor(1);
        meuProdutoInternacional.setValor(-90);

    }
}
