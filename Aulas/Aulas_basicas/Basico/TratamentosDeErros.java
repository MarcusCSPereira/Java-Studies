package Aulas.Aulas_basicas.Basico;

import java.util.ArrayList;

public class TratamentosDeErros {
    public static void main(String[] args) {
        
        int cont=0;
        int nota1=60,nota2=20;

        if(nota1>50){
            throw new IllegalArgumentException("Valor da nota inválida");
        }
        if(nota2>50){
            throw new IllegalArgumentException("Valor da nota inválida");
        }

        ArrayList <String> carros = new ArrayList<>();

        carros.add("Ferrari");
        carros.add("cruze");
        carros.add("polo");
        
        while(cont<3){
            try {
            carros.get(10);//ocorre um erro, por isso trato a exceção
            } catch (Exception e) {
            cont++;
            System.out.println(cont);
            }finally{
                System.out.println("Fim do try");
            }
        }

    }
}
