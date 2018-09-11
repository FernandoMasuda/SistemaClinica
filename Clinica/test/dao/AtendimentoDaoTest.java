package dao;

import java.util.List;
import modelo.Atendimento;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AtendimentoDaoTest {
    
    public AtendimentoDaoTest() {
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
        Atendimento atendimento = new Atendimento();
        atendimento.setCodigoPaciente(888);
        atendimento.setHorario("08h00");
        atendimento.setNome("Mario");
        atendimento.setProcedimento("Consulta Psicológica");
        atendimento.setData("29/08/2019");
        atendimento.setAnotacoes("Precisa fazer exame de token");
        atendimento.setCausaTratamento("Queixas no dor no nariz");
        atendimento.setDataRetorno("29/08/2020");
        AtendimentoDao dao = new AtendimentoDao();
        dao.inserir(atendimento);
    }   
}