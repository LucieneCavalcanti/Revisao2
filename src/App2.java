import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import model.Estoque;
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
                "\n5 - Procurar por descrição"+
                "\n6 - Mostrar os 3 perecíveis mais baratos"+
                "\n7 - Mostrar os 3 produtos mais baratos (entre Perecíveis e não perecíveis)"+
                "\n10 - Sair");
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
                            //ou System.out.println(np); //toString()
                        }
                        break; 
                    case 5:
                        System.out.println("Digite a descrição do produto");
                        String descricao = entrada.next();
                        for (NaoPerecivel np : listaNaoPereciveis) {
                            if(np.getDescricao().equalsIgnoreCase(descricao))
                                np.mostrar();
                        }
                        for (Perecivel p : listaPereciveis) {
                            if(p.getDescricao().equalsIgnoreCase(descricao))
                                p.mostrar();
                        }
                        break;
                    case 6:
                        int contador=0;
                        /* para não ter que digitar ao fazer os testes 
                        listaNaoPereciveis.add(new NaoPerecivel(1, "Bolo1", 9.99f, "prateira 1"));
                        listaNaoPereciveis.add(new NaoPerecivel(2, "Bolo2", 7.99f, "prateira 1"));
                        listaNaoPereciveis.add(new NaoPerecivel(3, "Bolo3", 5.99f, "prateira 1"));
                        listaPereciveis.add(new Perecivel(4, "Bolo4", 4.99f, "10/10/2024"));
                        listaPereciveis.add(new Perecivel(5, "Bolo5", 2.99f, "10/10/2024"));
                        listaPereciveis.add(new Perecivel(6, "Bolo6", 14.99f, "10/10/2024"));
                        listaPereciveis.add(new Perecivel(7, "Bolo7", 13.99f, "10/10/2024"));
                        listaPereciveis.add(new Perecivel(8, "Bolo8", 6.99f, "10/10/2024"));
                        listaPereciveis.add(new Perecivel(9, "Bolo9", 90.99f, "10/10/2024"));
                        */
                        for(int i=0;i<listaPereciveis.size();i++){
                        contador=0;
                        for(int j=0;j<listaPereciveis.size();j++){
                            if(listaPereciveis.get(i).getPreco()<listaPereciveis.get(j).getPreco()){
                             contador++;   
                            }
                        }
                        //System.out.println("------->"+ contador);
                        if(contador==5)
                            listaPereciveis.get(i).mostrar();
                        if(contador==4)
                            listaPereciveis.get(i).mostrar();
                        if(contador==3)
                            listaPereciveis.get(i).mostrar();
                        }
                                
                        /*   -----------   ou   ---------------
                        Perecivel menor1 = null;
                        Perecivel menor2 = null;
                        Perecivel menor3 = null;
                        for (Perecivel p : listaPereciveis) {
                            if(menor1==null || menor1.getPreco()>p.getPreco()){
                                menor3=menor2;
                                menor2=menor1;
                                menor1=p;
                            }else if(menor2==null || (menor2.getPreco()>p.getPreco() && menor1.getPreco()<p.getPreco())){
                                menor3=menor2;
                                menor2=p;
                            } else if(menor3==null || (menor3.getPreco()>p.getPreco() && menor2.getPreco()<p.getPreco())){
                                menor3=p;
                            }
                        }
                        menor1.mostrar();
                        menor2.mostrar();
                        menor3.mostrar();
                        */
                        break;

                    case 10: break;                       
                    default:
                        System.out.println("Opção inválida...");
                        break;
                }
            }catch(Exception erro){
                System.out.println("Erro:" + erro.getMessage());
                entrada.next();
            }
        } while (opcao!=10);

    }
}
