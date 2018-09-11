package dao;

import java.util.List;
import modelo.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioDaoTest {
    
    public UsuarioDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInserir() {
        Usuario usuario = new Usuario();
        usuario.setCpf_Usuario("11111111111");
        usuario.setNome("9");
        usuario.setSenhaDeAcesso("fernando");
        UsuarioDao dao = new UsuarioDao();
        dao.inserir(usuario);
    }
}