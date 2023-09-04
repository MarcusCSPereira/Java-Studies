package Aulas.Stack_e_Queue;

import java.util.*;


public class Stack_Estudos {
    public static void main(String[] args) {
        
        Stack <String> carros = new Stack<>();

        carros.push("Ferrari");
        carros.push("Polo");
        carros.push("Camaro");
        carros.push("Jaguar");
        carros.push("Fusca");

        /*
        O primeiro elemento se torna o ultimo da pilha
        Fusca
        Jaguar
        Camaro
        Polo
        Ferrari 
        */

        System.out.println("Elemento do topo da pilha " + carros.peek());
        System.out.println("Elemento do topo da pilha sendo removido " + carros.pop());
        
        System.out.printf("A pilha %s vazia%n", carros.empty() ? "está" : "não está");

        System.out.println(carros);
        for(String c:carros){
            System.out.println(c);
        }

    }
}
