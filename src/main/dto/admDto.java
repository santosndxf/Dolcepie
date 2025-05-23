package dolcepie.com.dolcepie.dto;

public class admDto {
    private Long idAdministrador;
    private String nomeAdministrador;
    private String emailAdministrador;
    private String senhaAdministrador;

    public admDto() {}

    public admDto(Long idAdministrador, String nomeAdministrador, String emailAdministrador, String senhaAdministrador) {
        this.idAdministrador = idAdministrador;
        this.nomeAdministrador = nomeAdministrador;
        this.emailAdministrador = emailAdministrador;
        this.senhaAdministrador = senhaAdministrador;
    }

    public Long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNomeAdministrador() {
        return nomeAdministrador;
    }

    public void setNomeAdministrador(String nomeAdministrador) {
        this.nomeAdministrador = nomeAdministrador;
    }

    public String getEmailAdministrador() {
        return emailAdministrador;
    }

    public void setEmailAdministrador(String emailAdministrador) {
        this.emailAdministrador = emailAdministrador;
    }

    public String getSenhaAdministrador() {
        return senhaAdministrador;
    }

    public void setSenhaAdministrador(String senhaAdministrador) {
        this.senhaAdministrador = senhaAdministrador;
    }
}