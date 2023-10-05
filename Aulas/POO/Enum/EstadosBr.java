package Aulas.POO.Enum;
//O Enum é uma lista de Objetos já definidos para serem usados.
//Possuem atributos e metódos.
public enum EstadosBr {
    SAO_PAULO ("SP","São Paulo"),
    BAHIA ("BA","Bahia"),
    RIO_DE_JANEIRO ("RJ","Rio de Janeiro");

    private String nome;
    private String sigla;

    private EstadosBr(String sigla, String nome){
        this.nome=nome;
        this.sigla=sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
