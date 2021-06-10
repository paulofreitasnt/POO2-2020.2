package aula3;

import java.time.LocalDate;

//Visão
public class App {

    public static void main(String[] args) {

        //Cria objetos do tipo produto
        Produto produto1 = new Produto(1, "Arroz",
                5, LocalDate.of(2021,12,1));
        Produto produto2 = new Produto(2, "Feijão",
                8, LocalDate.of(2022,2,18));

        //Inicializa o cadastro de produtos
        CadastroProduto cadastroProduto = new CadastroProduto();


        //Salva alguns produtos
        if(cadastroProduto.salvar(produto1)){
            System.out.println("Salvo");
        }else{
            System.out.println("Falha ao salvar!");
        }

        if(cadastroProduto.salvar(produto2)){
            System.out.println("Salvo");
        }else{
            System.out.println("Falha ao salvar!");
        }

        //Imprime todos os produtos
        System.out.println(cadastroProduto.getProdutos());

        //Remove um produto
        System.out.println(cadastroProduto.deletar(new Produto(1, "Arroz",
                5, LocalDate.of(2021,12,1))));

        //Imprime todos os produtos
        System.out.println(cadastroProduto.getProdutos());

    }

}
