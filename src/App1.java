import java.util.ArrayList;
import java.util.Scanner;

import model.NaoPerecivel;
import model.Perecivel;

public class App1 {
    public static void main(String[] args) throws Exception {
        int opcao=0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Perecivel> listaPereciveis = new ArrayList<>();
        ArrayList<NaoPerecivel> listaNaoPereciveis = new ArrayList<>();
        do {
            try{
                System.out.println("Digite uma opção:"+
                "\n1 - Cadastrar Perecível"+
                "\n2 - Cadastrar não perecível"+
                "\n3 - Listar Perecíveis"+
                "\n4 - Listar não perecíveis"+
                "\n5 - Sair");
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 1:
                        Perecivel obj = new Perecivel();
                        System.out.println("Digite o id:");
                        obj.setId(entrada.nextInt());
                        System.out.println("Digite a descrição:");
                        obj.setDescricao(entrada.next());
                        System.out.println("Digite o preço:");
                        obj.setPreco(entrada.nextFloat());
                        System.out.println("Digite a data de validade:");
                        obj.setDataValidade(entrada.next());
                        listaPereciveis.add(obj);
                        break;
                    case 2:
                        NaoPerecivel obj2 = new NaoPerecivel();
                        System.out.println("Digite o id:");
                        obj2.setId(entrada.nextInt());
                        System.out.println("Digite a descrição:");
                        obj2.setDescricao(entrada.next());
                        System.out.println("Digite o preço:");
                        obj2.setPreco(entrada.nextFloat());
                        System.out.println("Digite o local de armazenamento:");
                        obj2.setLocalArmazenamento(entrada.next());
                        listaNaoPereciveis.add(obj2);
                        break;
                    case 3:
                        System.out.println("------ Perecíveis -----");
                        for (Perecivel p : listaPereciveis) {
                            System.out.println("Id:"+p.getId());
                            System.out.println("Descrição:"+p.getDescricao());
                            System.out.println("Preço:" + p.getPreco());
                            System.out.println("Data Validade:"+p.getDataValidade()+"\n\n");
                        }
                        break;
                    case 4:
                        System.out.println("------ Não Perecíveis -----");
                        for (NaoPerecivel np : listaNaoPereciveis) {
                            System.out.println("Id:"+np.getId());
                            System.out.println("Descrição:"+np.getDescricao());
                            System.out.println("Preço:" + np.getPreco());
                            System.out.println("Armazenamento:"+np.getLocalArmazenamento()+"\n\n");
                        }
                        break; 
                    case 5: break;                       
                    default:
                        System.out.println("Opção inválida...");
                        break;
                }
            }catch(Exception erro){
                System.out.println("Valor inválido!");
                entrada.next();
            }
        } while (opcao!=5);

    }
}
