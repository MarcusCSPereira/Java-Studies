package Aulas.HashMap_HashSet;

import java.util.HashMap;

public class HashMap_learning{
    public static void main(String[] args) {
        
        HashMap<Integer,String> carros = new HashMap<Integer,String>();
        
        carros.put(1, "Ferrari");
        carros.put(2, "Fusca");
        carros.put(3, "Mercedez");
        carros.put(4, "Golf");
        carros.put(5, "Hilux");
        carros.put(6, "Cruze");
        carros.remove(5);

        System.out.println(carros);
        for(int i=1; i<=carros.size();i++){
            System.out.println(carros.get(i)); 
        }

        for(String c:carros.values()){
            System.out.println(c);
        }

    }
}