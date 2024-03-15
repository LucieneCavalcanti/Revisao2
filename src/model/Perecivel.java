package model;

import java.util.Scanner;

public class Perecivel extends Estoque{
    private String dataValidade;

    public Perecivel() {
    }

    public Perecivel(int id, String descricao, float preco, String dataValidade) {
        super(id, descricao, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public void cadastrar(){
        Scanner entrada = new Scanner(System.in);
        super.cadastrar();
        System.out.println("Digite a data de validade:");
        setDataValidade(entrada.next());
    }
    public void mostrar(){
        System.out.println("Id:"+getId());
        System.out.println("Descrição:"+getDescricao());
        System.out.println("Preço:" + getPreco());
        System.out.println("Data validade:"+dataValidade+"\n\n");
    }
}
