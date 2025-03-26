package edu.matheus.anatomiadasclasses;
public class BoletimEstudantil {

    public static void main(String[] args){

        float mediaFinal = 5;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("RECUPERAÇÃO");
        else
            System.out.println("APROVADO");
        

    }

}
