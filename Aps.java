
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabigol
 */
public class Aps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        Sala aula = new Sala();
        ArrayList<Sala> sal = new ArrayList<>();
        int opc,qntnotas;
        String nome,cpf;
        
        do{
           System.out.println("1- Inserir");
           System.out.println("2- Listar");           
           System.out.println("3- Situações");
           System.out.println("4- Sair");
           System.out.println("Opção: "); 
           opc = teclado.nextInt();
           teclado.nextLine(); 
           switch(opc){
                case 1:
                      System.out.println("Digite o Nome do aluno:");
                      nome = teclado.nextLine();
                      System.out.println("Digite o Cpf do aluno:");
                      cpf = teclado.nextLine();
                      System.out.println("Digite Quantas notas deseja inserir a esse aluno aluno:");
                      qntnotas = teclado.nextInt();
                      float notas[] = new float[qntnotas];
                      for (int i = 0; i < qntnotas; i++) {
                          System.out.println("Nota "+(i+1)+ ":");
                          notas[i] = teclado.nextFloat();
                    }
                      Aluno al = new Aluno (nome,cpf);
                      for (int i = 0; i < qntnotas; i++) {
                        al.InsereNota(notas[i]);
                    }
                      aula.insereAluno(al);
                   break;
                case 2:
                    aula.listartodos();
                   break;
                case 3:
                     aula.verSituacoes(); 
                   break;
                case 4:
                    System.out.println("Saindo...");
                   break;
                default:
                    System.out.println("Valor digitado está incorrento, tente outro");
                    break;
            }
        }while(opc!=4);
    }
    
}

    

