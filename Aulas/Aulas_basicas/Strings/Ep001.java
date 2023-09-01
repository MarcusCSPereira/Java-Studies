package Aulas.Aulas_basicas.Strings;

public class Ep001 {
    public static void main(String[] args) {
        char[] texto ={'a','b','c','d','e','f','g'};
        String s="Cesinha";
        String s2="cesinha";
        String resp;

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
