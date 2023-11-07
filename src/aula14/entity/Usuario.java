
package aula14.entity;

public class Usuario {
    private int id_usuario;
    private String login;
    private String senha;

    public Usuario(int id_usuario, String login, String senha) {
        this.id_usuario = id_usuario;
        this.login = login;
        this.senha = senha;
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
}
