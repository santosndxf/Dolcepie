package dolcepie.com.dolcepie.models;

public class admModels {
    private int id_administrador;
    private String nome_administrador;
    private String email_administrador;
    private String senha_administrador;

    public admModels() {}

    public admModels(int id_administrador, String nome_administrador, String email_administrador, String senha_administrador) {
        this.id_administrador = id_administrador;
        this.nome_administrador = nome_administrador;
        this.email_administrador = email_administrador;
        this.senha_administrador = senha_administrador;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getNome_administrador() {
        return nome_administrador;
    }

    public void setNome_administrador(String nome_administrador) {
        this.nome_administrador = nome_administrador;
    }

    public String getEmail_administrador() {
        return email_administrador;
    }

    public void setEmail_administrador(String email_administrador) {
        this.email_administrador = email_administrador;
    }

    public String getSenha_administrador() {
        return senha_administrador;
    }

    public void setSenha_administrador(String senha_administrador) {
        this.senha_administrador = senha_administrador;
    }
}