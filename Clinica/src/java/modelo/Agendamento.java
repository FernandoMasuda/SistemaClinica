
package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="agendamento")
public class Agendamento implements Serializable{

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;
    
    @Column(length=50, name="nome")
    private String nome;
    
    @Column(length=50, name="codigoPaciente")
    private Integer codigoPaciente;
    
    @Column(length=50, name="procedimento")
    private String procedimento;
    
    @Column(length=50, name="data")
    private String data;
    
    @Column(length=50, name="horario")
    private String horario;
    
    @ManyToOne 
    @JoinColumn (name = "agendamento", referencedColumnName = "codigo")
    private Agendamento agendamento; 
    
    public Agendamento(){
        this.codigo = 0;
        this.nome = "";
        this.data = "";
        this.codigoPaciente=0;
        this.horario="";
        this.nome="";
        this.procedimento="";
    }
    
    //Get e Set
    public Integer getAgendamento() {
        return getCodigo();
    }

    public void setAgendamento(Integer agendamento) {
        this.setCodigo(agendamento);
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(Integer codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.getCodigo());
        hash = 29 * hash + Objects.hashCode(this.getNome());
        hash = 29 * hash + Objects.hashCode(this.getCodigoPaciente());
        hash = 29 * hash + Objects.hashCode(this.getHorario());
        hash = 29 * hash + Objects.hashCode(this.getProcedimento());
        hash = 29 * hash + Objects.hashCode(this.getData());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agendamento other = (Agendamento) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.codigoPaciente, other.codigoPaciente)) {
            return false;
        }
        if (!Objects.equals(this.procedimento, other.procedimento)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }

        return true;
    }
}