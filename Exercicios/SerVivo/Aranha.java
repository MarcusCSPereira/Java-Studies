package SerVivo;

public class Aranha extends Animal {

    private int veneno;

    public Aranha(int velocidade, int massa, int forca, int veneno) {
        super(velocidade, massa, forca);
        this.veneno = veneno;
    }

    @Override
    public void info(){
        System.out.println("---------------------------------------------");
        System.out.printf("Nome: %s%n", getClass().getSimpleName());
        System.out.printf("Vivo: %s%n", this.getVivo() ? "Sim" : "Não");
        System.out.printf("Forca: %d%n", this.getForca());
        System.out.printf("Massa: %d%n", this.getMassa());
        System.out.printf("Velocidade: %d%n", this.getVelocidade());
        System.out.printf("Veneno: %d%n", this.veneno);
        System.out.println("---------------------------------------------");
    }

    @Override
    public void atacar(Animal defensor) {
        if (this.getVivo()) {
            System.out.printf("%nO Animal: %s atacou o Animal: %s%n", this.getClass().getSimpleName(), defensor.getNome());
            if (this.getForca() < defensor.getForca()){

                if ((this.getForca() + this.veneno) > defensor.getForca()) {
                    this.setForca(this.getForca() + defensor.getMassa());
                    defensor.setMorto();
                    System.out.printf("O Animal: %s ganhou e matou o Animal: %s por conta do seu veneno, obtendo os seus atributos!%n ",this.getClass().getSimpleName(), defensor.getNome());
                    this.info();
                } else {
                    this.setMorto();
                    System.out.printf("O Animal: %s perdeu e morreu para o Animal: %s, que obteve assim os seus atributos!%n ",this.getClass().getSimpleName(), defensor.getNome());
                    defensor.setForca(defensor.getForca() + this.getMassa());
                    defensor.info();
                }
            }else{
                this.setForca(defensor.getMassa() + this.getForca());
                defensor.setMorto();
                System.out.printf("O Animal: %s ganhou e matou o Animal: %s, obtendo os seus atributos!%n ",this.getClass().getSimpleName(), defensor.getNome());
                this.info();
            }
        } else {
            System.out.println("---------------------------------------------");
            System.out.printf("%s está morto, nao podendo atacar%n", this.getClass().toGenericString());
            System.out.println("---------------------------------------------");
        }
    }
}
