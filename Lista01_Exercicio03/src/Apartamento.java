public class Apartamento {
    private char bloco;
    private int andar;
    private int numero;
    private double metragem;
    private String situacao;
    private Moradores morador;


    public char getBloco() {
        return bloco;
    }
    public int getAndar() {
        return andar;
    }
    public int getNumero() {
        return numero;
    }
    public double getMetragem() {
        return metragem;
    }
    public String getSituacao() {
        return situacao;
    }
    public Moradores getMorador() {
        return morador;
    }
    public void setBloco(char bloco) {
        this.bloco = bloco;
    }
    public void setAndarNumero(int andar, int numero) {
        this.andar = andar;
        if (numero >= andar*100 & numero < andar*100+100){
            this.numero = numero;
        } else {
            System.out.println("Andar ou numero está incorreto");
            System.out.println("Refaça o cadastro");
            this.andar = 0;
            this.numero = 0;
        }
    }
    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public void setMorador(Moradores morador) {
        this.morador = morador;
    }
}
