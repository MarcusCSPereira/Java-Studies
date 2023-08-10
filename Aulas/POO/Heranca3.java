package Aulas.POO;
//Heranca3 = carrocombate;
public class Heranca3 extends Heranca2{
    
    //atributos da classe filho = Heranca3
    private final int max_Armamento=100;
    private final int min_Armamento=0;
    private int qtDeArmamento;
    
    //construtor da classe filho = Heranca3
    public Heranca3(String nome, int blindagem, int qtDeArmamento){
        /* O super(requisito do contrutor base da classe pai), ele chama o contrutor base da classe pai, para passar o parametro que ele espera na classe pai */
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.qtDeArmamento=qtDeArmamento;
    }
    //metodos da classe filho;
    public void setQtDeArmamento(int qtDeArmamento){
        this.qtDeArmamento+= qtDeArmamento;
        if(this.qtDeArmamento >= max_Armamento){
            this.qtDeArmamento = max_Armamento;
        }
        if(this.qtDeArmamento <= min_Armamento){
            this.qtDeArmamento = min_Armamento;
        }
    }
    public int getQtDeArmamento(){
        return this.qtDeArmamento;
    }
    public void atirar(){
        if(this.qtDeArmamento > min_Armamento){
            setQtDeArmamento(-1);
        }else{
            System.out.println("\nSem armamento\n");
        }
    }

    public void info(){
        super.info();
        System.out.printf("Quantidade de balas: %d%n", this.qtDeArmamento);
    }
}