package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(349.99);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho(Tamanho.PEQUENO);

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 controles");
        itensInclusos.add("3 Jogos");
        itensInclusos.add("1 Cabo de Energia");
        itensInclusos.add("1 cabo de dados");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getItensInclusos().get(2) + " é o iten 2 ");
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());

        System.out.println(meuProduto.getValor());
    }
}
