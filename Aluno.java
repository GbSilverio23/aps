
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabigol
 */
public class Aluno {
    
private String nome,cpf;
    private ArrayList<Float> listanotas = new ArrayList();

    
    public Aluno(String nome){
        this.nome=nome;  
    }
    
    public Aluno(String nome,String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ArrayList<Float> getListanotas() {
        return listanotas;
    }

    public void setListanotas(ArrayList<Float> listanotas) {
        this.listanotas = listanotas;
    }
   
    public void InsereNota(float notas){
            this.listanotas.add(notas);
    }
    
    float calculaNotas(){
       float somatorio=0;
       for (int i=0; i<this.getListanotas().size(); i++){
         somatorio+=this.getListanotas().get(i);
       }
       return somatorio; 
    }
    
    public void Listar(){
        System.out.println("Nome:"+this.getNome());
        System.out.println("CPF:"+this.getCpf());
        for (int i=0; i<this.getListanotas().size(); i++){
        System.out.println("Nota "+(i+1)+" :"+this.getListanotas().get(i)); 
       }    
    }
}
    

