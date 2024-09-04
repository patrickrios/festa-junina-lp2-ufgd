package controle;

import entidade.Produto;
import interfaces.JanelaCadastroProduto;

public class ControladorCadastroProduto{

    public ControladorCadastroProduto() {
        new JanelaCadastroProduto(this).setVisible(true);
    }
    
    public String inserirProduto(Produto produto){
        Produto produto1 = Produto.buscarProduto(produto.getSequencial());
        if( produto1 == null)
            return Produto.inserirProduto(produto);
        else
            return "Produto já cadastrado";
    }
    
    public String alterarProduto(Produto produto){
        Produto produto1 = Produto.buscarProduto(produto.getSequencial());
        if( produto1 != null)
            return Produto.alterarProduto(produto);
        else
            return "Produto não cadastrado";
    }
    
    public String removerProduto(int sequencial){
        Produto produto1 = Produto.buscarProduto(sequencial);
        if( produto1 != null)
            return Produto.removerProduto(produto1);
        else
            return "Produto não cadastrado";
    }
}