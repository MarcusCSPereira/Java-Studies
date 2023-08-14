package Exercicios.JogoDaVelha;

public class Marcar {
    
    String nome;

    Marcar(String nome){
        this.nome=nome;
    }
    
    public Boolean Jogar(String[][] mtz,int posicao){
        switch(posicao){
            case 1:
            if(mtz[0][0]==" "){
                mtz[0][0]=nome;
                return true;
            }else{
                System.out.println("Local preenchido, tente outro");
                return false;
            }
            case 2:
            if(mtz[0][1]==" "){
                mtz[0][1]=nome;
                return true;
            }else{
                System.out.println("Local preenchido, tente outro");
                return false;
            }
            case 3:
            if(mtz[0][2]==" "){
                mtz[0][2]=nome;
                return true;
            }else{
                System.out.println("Local preenchido, tente outro");
                return false;
            }
            case 4:
            if(mtz[1][0]==" "){
                mtz[1][0]=nome;
                return true;
            }else{
                System.out.println("Local preenchido, tente outro");
                return false;
            }
            case 5:
            if(mtz[1][1]==" "){
                mtz[1][1]=nome;
                return true;
            }else{
                System.out.println("Local preenchido, tente outro");
                return false;
            }
            case 6:
            if(mtz[1][2]==" "){
                mtz[1][2]=nome;
                return true;
            }else{
                System.out.println("Local preenchido, tente outro");
                return false;
            }
            case 7:
            if(mtz[2][0]==" "){
                mtz[2][0]=nome;
                return true;
            }else{
                System.out.println("Local preenchido, tente outro");
                return false;
            }
            case 8:
            if(mtz[2][1]==" "){
                mtz[2][1]=nome;
                return true;
            }else{
                System.out.println("Local preenchido, tente outro");
                return false;
            }
            case 9:
            if(mtz[2][2]==" "){
                mtz[2][2]=nome;
                return true;
            }else{
                System.out.println("Local preenchido, tente outro");
                return false;
            }
            default:
            System.out.println("Posicao digitada incorreta, tente um numero entre 0 e 9");
            return false;
        }
    }

}
