package ExerciciosFacul.AP2_Pratica.Aula_1;

public class Tv {
    // Atributos
    int canal = 0;
    int volume = 0;
    boolean ligada = false;

    // Métodos:
    void aumentarVolume() {
        if (ligada) {
            if (volume == 10) {
                System.out.println("A TV já está no máximo de volume");
            } else {
                volume++;
            }
        }else{
            System.out.println("Ligue a TV primeiro");
        }
    }

    void diminuirVolume() {
        if(ligada){
            if (volume == 0) {
                System.out.println("A TV já está no mudo");
            } else {
                volume--;
            }
        }else{
            System.out.println("Ligue a TV primeiro");
        }
    }

    void setMudo() {
        if(ligada){
            volume = 0;
        }else{
            System.out.println("Ligue a TV primeiro");
        }
    }

    void ligarTV() {
        ligada = true;
    }

    void infoTV() {
        System.out.println(ligada);
        System.out.println(volume);
        System.out.println(canal);
    }

}
