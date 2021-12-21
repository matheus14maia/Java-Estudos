import java.util.Date;

public class Moradores {
    private static int ID = 0;
    private String nome;
    private String cpf;
    private String telefone;
    private Date dataNascimento;
    private char sexo;
    private String codigoAcesso;

    public static int getID() {
        ID++;
        return ID;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public char getSexo() {
        return sexo;
    }
    public String getCodigoAcesso() {
        return codigoAcesso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }
}
