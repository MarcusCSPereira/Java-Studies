package Aulas.Aulas_basicas.ArraysAdvanced;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        
        ArrayList <Integer> numeros = new ArrayList<>(100);
        ArrayList <String> carros = new ArrayList<>();


        carros.add("Ferrari");
        carros.add("cruze");
        carros.add("polo");
        carros.add(1,"celta");
        numeros.trimToSize();

        System.out.println(carros.get(2));
        carros.indexOf("polo");
        numeros.clear();

        /*numeros.add(11);
        numeros.add(22);
        numeros.add(33);

        for(int n:numeros){
            System.out.println(n);
        }
        for(String c:carros){
            System.out.println(c);
        }
        */
    }
}
