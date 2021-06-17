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

    //Buscar um produto pelo código --> R (READ)
    public Produto buscarPorCodigo(int codigo){
        for(Produto produto : produtos){
            if(produto.getCodigo() == codigo){
                return produto;
            }
        }
        //Cuidado com os retornos vazios!
        return null;
    }

    //Atualizar a descrição de um produto a partir do código --> U (Update)
    public boolean atualizarDescricao(int codigo, String novaDescricao){
        for(int i=0; i<produtos.size(); i++){
            Produto p = produtos.get(i);
            if(p.getCodigo() == codigo){
                p.setDescricao(novaDescricao);
                produtos.set(i, p);
                return true;
            }
        }
        return false;
    }

    //Atualizar o preço de um produto a partir do código --> U (Update)
    public boolean atualizarPreco(int codigo, float novoPreco){
        for(int i=0; i<produtos.size(); i++){
            Produto p = produtos.get(i);
            if(p.getCodigo() == codigo){
                p.setPreco(novoPreco);
                produtos.set(i, p);
                return true;
            }
        }
        return false;
    }

    //Remover um produto --> D (DELETE)
    public boolean deletar(Produto produto){
        return produtos.remove(produto);
    }

}