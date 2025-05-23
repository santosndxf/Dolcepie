package dolcepie.com.dolcepie.models;

public class favoritosModels {
    private int id_favorito;
    private int id_usuario;
    private int id_produto;

    public favoritosModels() {}

    public favoritosModels(int id_favorito, int id_usuario, int id_produto) {
        this.id_favorito = id_favorito;
        this.id_usuario = id_usuario;
        this.id_produto = id_produto;
    }

    public int getId_favorito() {
        return id_favorito;
    }

    public void setId_favorito(int id_favorito) {
        this.id_favorito = id_favorito;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }
}