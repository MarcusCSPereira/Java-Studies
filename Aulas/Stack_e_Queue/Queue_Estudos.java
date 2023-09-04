package Aulas.Stack_e_Queue;

import java.util.*;

public class Queue_Estudos {
    public static void main(String[] args) {
        
        Queue <String> carros = new LinkedList<>();

        carros.add("Ferrari");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Jaguar");
        carros.add("Fusca");

        /*
        O primeiro elemento se torna o primeiro da fila
        Ferrari
        Polo
        Camaro
        Jaguar
        Fusca
        */

        System.out.println("Elemento do topo da fila " + carros.peek());
        System.out.println("Elemento do topo da fila sendo removido " + carros.poll());
        
        System.out.printf("A filha %s vazia%n", carros.isEmpty()? "está" : "não está");

        System.out.println(carros);

        for(String c:carros){
            System.out.println(c);
        }
    }
}
