package dolcepie.com.dolcepie.models;

public class userModels {
    private int id_usuarios;
    private String nome_usuarios;
    private String email_usuarios;
    private String senha_usuarios;

    public userModels() {}

    public userModels(int id_usuarios, String nome_usuarios, String email_usuarios, String senha_usuarios) {
        this.id_usuarios = id_usuarios;
        this.nome_usuarios = nome_usuarios;
        this.email_usuarios = email_usuarios;
        this.senha_usuarios = senha_usuarios;
    }

    public int getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public String getNome_usuarios() {
        return nome_usuarios;
    }

    public void setNome_usuarios(String nome_usuarios) {
        this.nome_usuarios = nome_usuarios;
    }

    public String getEmail_usuarios() {
        return email_usuarios;
    }

    public void setEmail_usuarios(String email_usuarios) {
        this.email_usuarios = email_usuarios;
    }

    public String getSenha_usuarios() {
        return senha_usuarios;
    }

    public void setSenha_usuarios(String senha_usuarios) {
        this.senha_usuarios = senha_usuarios;
    }
}