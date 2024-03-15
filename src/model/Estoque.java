package model;

import java.util.Scanner;

public class Estoque{
    private int id;
    private String descricao;
    private float preco;
    public Estoque() {
    }
    public Estoque(int id, String descricao, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void cadastrar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o id:");
        setId(entrada.nextInt());
        // igual ao anterior--> id = entrada.nextInt();
        System.out.println("Digite a descrição:");
        setDescricao(entrada.next());
        System.out.println("Digite o preço:");
        setPreco(entrada.nextFloat());
    }
}