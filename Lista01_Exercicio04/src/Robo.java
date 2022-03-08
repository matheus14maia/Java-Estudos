public class Robo {
    private int identifier;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private double reservatorio;
    private float porcentagem;

    Robo(int id, double reserv){
        identifier = id;
        status = "desligado";
        posicaoX = 0;
        posicaoY = 0;
        porcentagem = 0.0F;
        reservatorio = reserv;
    }

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


    public void setStatus(String status) {
        if (this.status.equalsIgnoreCase("desligado")){
            System.out.println("O robô está desligado, primeiro ligue ele");
            if (status.equalsIgnoreCase("ligar")) {
                this.status = "ligado";
            } else if (status.equalsIgnoreCase("parar")) {
                this.status = "parado";
            }
        } else if (status.equalsIgnoreCase("desligar")) {
            this.status = "desligado";
        }
    }
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
        if (this.posicaoX != 0) this.status = "andando";
    }
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
        if (this.posicaoY != 0) this.status = "andando";
    }
    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }
    public String toString(){
        return "ID: " +identifier+ ", Status: " +status+ ", Posição X: " +posicaoX+
                ", Posição Y: " +posicaoY+ ", Reservatório: " +reservatorio+
                "cm³, Porcentagem: " +porcentagem+ "%";
    }
}
