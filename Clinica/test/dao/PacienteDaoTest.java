package dao;

import java.util.List;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PacienteDaoTest {
    
    public PacienteDaoTest() {
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
        /*PacienteDao dao = new PacienteDao();
        dao.listarTodos();
        List<Paciente> lista = dao.listarTodos();
        for(Paciente p:lista){
            System.out.println(p.getNome());
        }*/
        Paciente paciente = new Paciente();
        paciente.setConvenio("Unimed");
        paciente.setCpf_Paciente("11111111111");
        paciente.setCpf_Responsavel("11111111111");
        paciente.setEmail_Paciente("joao@gmail.com");
        paciente.setEmail_Responsavel("mario@hot.com");
        paciente.setEndereco_Paciente("Rua da manguaça");
        paciente.setEndereco_Responsavel("Rua das pinga");
        paciente.setNome("Mario da Pinga");
        paciente.setNomeResponsavel("Mario da cachaça");
        paciente.setRg_Paciente("123456789");
        paciente.setRg_Responsavel("987654321");
        paciente.setSenhaDeAcesso("senha123");
        paciente.setTelefone_Paciente("11111111");
        paciente.setTelefone_Responsavel("22222222");
        PacienteDao dao = new PacienteDao();
        dao.inserir(paciente);
    
    }
}