package model;

import java.util.Scanner;

public class NaoPerecivel extends Estoque{
    private String localArmazenamento;

    public NaoPerecivel() {
    }

    public NaoPerecivel(int id, String descricao, float preco, String localArmazenamento) {
        super(id, descricao, preco);
        this.localArmazenamento = localArmazenamento;
    }

    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    public void setLocalArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
    }
    public void cadastrar(){
        Scanner entrada = new Scanner(System.in);
        super.cadastrar();
        System.out.println("Digite o local de armazenamento:");
        setLocalArmazenamento(entrada.next());
                        
    }
    public void mostrar(){
        System.out.println("Id:"+getId());
        System.out.println("Descrição:"+getDescricao());
        System.out.println("Preço:" + getPreco());
        System.out.println("Armazenamento:"+localArmazenamento+"\n\n");
    }
    public String toString(){
        return "Id:"+getId()+
        "\nDescrição:"+getDescricao()+
        "\nPreço:" + getPreco()+
        "\nArmazenamento:"+localArmazenamento+"\n\n";
    }
}
