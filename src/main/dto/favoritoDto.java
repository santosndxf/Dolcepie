package dolcepie.com.dolcepie.dto;

public class favoritoDto {
    private Long idFavorito;
    private Long idUsuario;
    private Long idProduto;

    public favoritoDto() {}

    public favoritoDto(Long idFavorito, Long idUsuario, Long idProduto) {
        this.idFavorito = idFavorito;
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
    }

    public Long getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(Long idFavorito) {
        this.idFavorito = idFavorito;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }
}