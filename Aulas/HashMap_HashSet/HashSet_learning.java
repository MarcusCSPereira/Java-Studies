package Aulas.HashMap_HashSet;

import java.util.*;

public class HashSet_learning {
    public static void main(String[] args) {
        
        HashSet<String> carros = new HashSet<String>();
        ArrayList <String> carros2 = new ArrayList<String>();

        carros.add("Ferrari");
        carros.add("Fusca");
        carros.add("Hilux");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Porsche");
        carros.add("Polo");

        carros2.add("Ferrari");
        carros2.add("Fusca");
        carros2.add("Hilux");
        carros2.add("Polo");
        carros2.add("Camaro");
        carros2.add("Porsche");
        carros2.add("Polo");

        System.out.println(carros);
        System.out.println(carros2);

        Iterator<String> it = carros2.iterator();

        while(it.hasNext()){
            String c=it.next();
            if(c == "Hilux"){
                it.remove();
            }
        }
        System.out.println(carros2);

    }
}
