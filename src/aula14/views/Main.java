package aula14.views;

import aula14.dao.UsuarioDAO;
import aula14.entity.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usu = new Usuario(0, "fabio", "123");
        
        UsuarioDAO usuDao = new UsuarioDAO();
        usuDao.inserir(usu);
        
        
    }
}
