
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
@Table(name="atendimento")
public class Atendimento implements Serializable{
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
    
    @Column(length=50, name="causaTratamento")
    private String causaTratamento;
    
    @Column(length=50, name="anotacoes")
    private String anotacoes;
    
    @Column(length=50, name="dataRetorno")
    private String dataRetorno;
   
    @ManyToOne 
    @JoinColumn (name = "atendimento", referencedColumnName = "codigo")
    private Atendimento atendimento; 
    
    public Atendimento(){
        this.codigo = 0;
        this.nome = "";
        this.data = "";
        this.codigoPaciente=0;
        this.horario="";
        this.nome="";
        this.procedimento="";
        this.anotacoes="";
        this.causaTratamento="";
        this.dataRetorno="";
    }    
    
    //Get e Set
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCausaTratamento() {
        return causaTratamento;
    }

    public void setCausaTratamento(String causaTratamento) {
        this.causaTratamento = causaTratamento;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
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
        hash = 29 * hash + Objects.hashCode(this.getAnotacoes());
        hash = 29 * hash + Objects.hashCode(this.getCausaTratamento());
        hash = 29 * hash + Objects.hashCode(this.getDataRetorno());
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
        final Atendimento other = (Atendimento) obj;
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
        if (!Objects.equals(this.dataRetorno, other.dataRetorno)) {
            return false;
        }
        if (!Objects.equals(this.anotacoes, other.anotacoes)) {
            return false;
        }
        if (!Objects.equals(this.causaTratamento, other.causaTratamento)) {
            return false;
        }
        return true;
    }
}