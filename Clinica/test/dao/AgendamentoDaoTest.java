package dao;

import java.util.List;
import modelo.Agendamento;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgendamentoDaoTest {
    
    public AgendamentoDaoTest() {
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
        Agendamento agendamento = new Agendamento();
        agendamento.setCodigoPaciente(5);
        agendamento.setHorario("18h00");
        agendamento.setNome("Fernando");
        agendamento.setProcedimento("Consulta Oftalmo");
        agendamento.setData("21/08/2019");
        AgendamentoDao dao = new AgendamentoDao();
        dao.inserir(agendamento);
    }   
}