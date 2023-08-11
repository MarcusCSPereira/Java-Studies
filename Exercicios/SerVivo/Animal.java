package Exercicios.SerVivo;

abstract class Animal implements SerVivo{
    
    private boolean vivo=true;
    private int massa;
    private int x,y;
    private int velocidade;
    private int forca;

    
    //construtor de animal
    public Animal(int velocidade, int massa, int forca){
        this.vivo=true;
        this.velocidade=velocidade;
        this.massa=massa;
        this.forca=forca;
    }

    //metodos da classe Animal:
    public void setMorto(){
        this.vivo=false;
    }
    public Boolean getVivo(){
        return this.vivo;
    }
    public void setForca(int forca){
        this.forca=forca;
    }
    public int getForca(){
        return this.forca;
    }
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void setMassa(int massa){
        this.massa=massa;
    }
    public int getMassa(){
        return this.massa;
    }
    public String getLocal(){
        return "Posicao x: " + this.x + " / Posicao y: " + this.y;
    }
    public String getNome(){
        return this.getClass().getSimpleName();
    }

    //metodos obrigatorios da interface que a classe implementou
    public void mover(){
        if(this.vivo){
            this.x+=this.velocidade;
            this.y+=this.velocidade;
        }else{
            System.out.println("---------------------------------------------");
            System.out.printf("%s está morto, nao podendo atacar%n", this.getClass().toGenericString());
            System.out.println("---------------------------------------------");
        }
    }
    
    public void atacar(Animal defensor){
        if(this.vivo){
             System.out.printf("%nO Animal: %s atacou o Animal: %s%n ", this.getClass().getSimpleName(), defensor.getNome());
            if(this.forca > defensor.forca){
                this.forca+=defensor.getMassa();
                defensor.setMorto();
                System.out.printf("O Animal: %s ganhou e matou o Animal: %s, obtendo os seus atributos!%n ",this.getClass().getSimpleName(), defensor.getNome());
                this.info();
            }else{
                defensor.setForca(this.massa+defensor.getForca());
                this.vivo=false;
                System.out.printf("O Animal: %s perdeu e morreu para o Animal: %s, que obteve assim os seus atributos!%n ",this.getClass().getSimpleName(), defensor.getNome());
                defensor.info();
            }
        }else{
            System.out.println("---------------------------------------------");
            System.out.printf("%s está morto, nao podendo atacar%n", this.getClass().toGenericString());
            System.out.println("---------------------------------------------");
        }
    }

    public void comer(Vegetal vegetal,int massa, int peso){
        if(this.vivo){
            this.forca+=massa;
            this.massa+=peso;
            System.out.printf("%nAnimal: %s, comeu o Vegetal: %s, ganhando +%d de força e +%d de massa%n", this.getClass().getSimpleName(), vegetal.getNome(),massa,peso);
            this.info();
        }else{
            System.out.println("---------------------------------------------");
            System.out.printf("%s está morto, nao podendo atacar%n", this.getClass().getSimpleName());
            System.out.println("---------------------------------------------");
        }
    }

    public void info() {
        System.out.println("---------------------------------------------");
        System.out.printf("Nome: %s%n", getClass().getSimpleName());
        System.out.printf("Vivo: %s%n", this.vivo ? "Sim" : "Não");
        System.out.printf("Forca: %d%n", this.forca);
        System.out.printf("Massa: %d%n", this.massa);
        System.out.printf("Velocidade: %d%n", this.velocidade);
        System.out.println("---------------------------------------------");

    }

    
}
