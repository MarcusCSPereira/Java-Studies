package Aulas.POO;

public class A_SupAndSubClass {
    public static void main(String[] args) {
        
        C_SubClass_Aviao v1 = new C_SubClass_Aviao("Bimotor", 2);
        B_SupClass_Veiculo v2 = new B_SupClass_Veiculo("Carro", 1);
        
        v1.info();
        v2.info();



    }
}
