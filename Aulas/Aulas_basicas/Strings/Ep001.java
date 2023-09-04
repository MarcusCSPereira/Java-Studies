package Aulas.Aulas_basicas.Strings;

public class Ep001 {
    public static void main(String[] args) {
        char[] texto ={'a','b','c','d','e','f','g'};
        String s="Cesinha";
        String s2="cesinha";
        String resp;
        String s3="CESInha";
        String s5="          Cesinha espacado";
        String s6="Curso de Java";

        //split:
        String [] s7 =s6.split(" ");
        for(String controle : s7){
            System.out.println(controle);
        }
        
        //toCharArray:
        char [] c=s.toCharArray();
        System.out.println(c[0]);

        //trim:
        System.out.println(s5);
        System.out.println(s5.trim());

        //toLowerCase e toUpperCase:
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());

        //replace
        String s4 = s.replace("inha", "udo");
        System.out.println(s4);
        
        //concat
        System.out.println(s.concat(s2));

        //substring:
        System.out.printf("%s%n",s.substring(2, 7));

        //startsWith e endsWith;
        System.out.printf("%s%n", s.startsWith("Ces") ? "Sim" : "Não");
        System.out.printf("%s%n", s2.endsWith("nha") ? "Sim" : "Não");

        //indexOf:
        System.out.println(s.indexOf("s"));
        System.out.println(s.indexOf("s",1));

        //.regionMatches:
        resp=s.regionMatches(false, 1, s2, 1, 4) ? "Sim" : "Não";
        System.out.println(resp);
        
        //.getChars:
        s.getChars(0, 6, texto, 0);
        for(char n: texto){
            System.out.println(n);
        }

        //.equals:
        resp = s.equals(s2) ? "Sim" : "Não";
        System.out.println(resp);

        //.equalsIgnoreCase
        resp = s.equalsIgnoreCase(s2) ? "Sim" : "Não";
        System.out.println(resp);

        //.compareTo: return 0, 1 , -1;
        System.out.printf("%s", s.compareTo(s2));

    }
}
