import java.util.ArrayList;
import java.util.Scanner;

import model.NaoPerecivel;
import model.Perecivel;

public class App2 {
    public static void main(String[] args) {
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
                        obj.cadastrar();
                        listaPereciveis.add(obj);
                        break;
                    case 2: 
                        NaoPerecivel obj2 = new NaoPerecivel();
                        obj2.cadastrar();
                        listaNaoPereciveis.add(obj2);
                        break;
                    case 3:
                        System.out.println("------ Perecíveis -----");
                        for (Perecivel p : listaPereciveis) {
                            p.mostrar();
                            System.out.println(p);
                        }
                        break;
                    case 4:
                        System.out.println("------ Não Perecíveis -----");
                        for (NaoPerecivel np : listaNaoPereciveis) {
                            np.mostrar();
                            System.out.println(np);
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
