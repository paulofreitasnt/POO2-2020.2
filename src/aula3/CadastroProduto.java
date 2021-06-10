package aula3;

import java.util.ArrayList;
import java.util.List;

//Controller
public class CadastroProduto {

    private List<Produto> produtos;

    public CadastroProduto() {
        produtos = new ArrayList<>();
    }

    //Salvar um produto --> adicionar --> C (CREATE)
    public boolean salvar(Produto produto){
        return produtos.add(produto);
    }

    //Retornar todos os produtos --> R (READ)
    public List<Produto> getProdutos(){
        return produtos;
    }

    //UPDATE - fica para próxima semana

    //Remover um produto --> D (DELETE)
    public boolean deletar(Produto produto){
        return produtos.remove(produto);
    }

}