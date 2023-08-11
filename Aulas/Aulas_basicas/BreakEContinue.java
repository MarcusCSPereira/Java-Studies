package Aulas.Aulas_basicas;

public class BreakEContinue {
    public static void main(String[] args) {
        int cont=100;
        for(int i=0;i<cont;i++){
            
            if(i>=10 && i<=20){
                continue;//pausa a iteração imediatamente e começa a proxima iteração do loop.
            }

            System.out.printf("%d - ", i);

            if(i >90){
                break;//pausa imediatamente o loop.
            }
        }
    }
}
