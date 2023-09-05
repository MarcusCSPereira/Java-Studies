package Aulas.Funcoes_Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_Learning {
    public static void main(String[] args) {
        
        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> dobro = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();
        
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);
        
        Consumer<Integer> dobrar = (v)->{dobro.add(v*2);};
        
        Consumer<Integer> checharParidade = (v)->{
            if(v %2 ==0){
                par.add(v);
            }else{
                impar.add(v);
            }
            ;};
        
        valores.forEach(checharParidade);
            
        valores.forEach(dobrar);
        //valores.forEach((v)->{dobro.add(v*2);});
        
        System.out.println(valores);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);

    }
}
