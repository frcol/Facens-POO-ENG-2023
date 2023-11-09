package aula14.views;

import aula14.dao.UsuarioDAO;
import aula14.entity.Usuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // CRUD (Create, Read, Updade e Delete)
        // Create
        Usuario usu = new Usuario(0, "fabio", "123");
        
        UsuarioDAO usuDao = new UsuarioDAO();
        usuDao.inserir(usu);
        
        // Editar (Edit)
        Usuario usu1 = new Usuario(2, "fabio", "123");
        usuDao.editar(usu1);
        
        // EXcluir (Delete)
        usuDao.excluir(2);
        
        // Mostrar todos (Read)
        ArrayList<Usuario> lstusuarios = usuDao.getAllUsuarios();
    }
}
