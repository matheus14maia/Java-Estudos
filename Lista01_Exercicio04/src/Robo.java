public class Robo {
    private int identifier;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private double reservatorio;
    private float porcentagem;

    public int getIdentifier() {
        return identifier;
    }
    public String getStatus() {
        return status;
    }
    public int getPosicaoX() {
        return posicaoX;
    }
    public int getPosicaoY() {
        return posicaoY;
    }
    public double getReservatorio() {
        return reservatorio;
    }
    public float getPorcentagem() {
        return porcentagem;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
    public void setReservatorio(double reservatorio) {
        this.reservatorio = reservatorio;
    }
    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    Robo(int id, double reserv){
        identifier = id;
        status = "desligado";
        posicaoX = 0;
        posicaoY = 0;
        porcentagem = 0.0F;
        reservatorio = reserv;
    }

    public String toString(){
        return "ID: "+this.identifier+ ", Status: " +this.status+ ", Posição X: " +this.posicaoX+
                ", Posição Y: " +this.posicaoY+ ", Reservatório: " +this.reservatorio+
                "cm³, Porcentagem: " +this.porcentagem+"%";
    }
}
