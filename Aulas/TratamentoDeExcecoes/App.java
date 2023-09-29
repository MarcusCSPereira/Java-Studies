package Aulas.TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //java.lang.NullPointException: acessar algo com valor nulo;
        //java.lang.ArithmeticException: dividir valores por 0
        //java.sql.SQLException: erro de comunicação com o BD
        //java.io.FileNotFoundException: erro de comunicação com algum arquivo
        //try: tenta executar | catch: executa caso um erro ocorra | finally: executa independente de ocorrer um erro ou não.
        
        String nome;
        int idade;
        double altura;

        try{

            Scanner scan = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            nome=scan.nextLine();
            System.out.println("Digite sua idade:");
            idade=scan.nextInt();
            System.out.println("Digite sua altura:");
            altura=scan.nextDouble();
        }catch(InputMismatchException ex){
            System.out.println("Os campos de idade e altura devem ser númericos");
        }

    }

    static String formataCep(String cep) throws CepException{
        if(cep.length()!=8){
            throw new CepException();
        }else{
            return "23.765-064";
        }
    }
}
