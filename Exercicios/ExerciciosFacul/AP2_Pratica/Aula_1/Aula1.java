package ExerciciosFacul.AP2_Pratica.Aula_1;

public class Aula1 {
    public static void main(String[] args) {
        
        /*UML = Linguagem de modelagem unificada
        basicamente é a organização para formação da classe,
        em atributos e métodos.
        no UML - = private
               + = public
        */

        //Tv tv_do_quarto = new Tv();
        Tv tv_da_sala = new Tv();
        System.out.println(tv_da_sala.getClass());



        tv_da_sala.ligada=false;
        tv_da_sala.canal= 3;
        tv_da_sala.volume = 4;
        tv_da_sala.aumentarVolume();
        tv_da_sala.infoTV();
        
        /*
        tv_do_quarto.ligada=false;
        tv_do_quarto.canal= 0;
        tv_do_quarto.volume = 0;
        System.out.println(tv_do_quarto.canal);*/
    }
}
