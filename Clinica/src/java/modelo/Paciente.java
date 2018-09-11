package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "paciente")//nome da tabela;
public class Paciente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private Integer codigo;
    
    @Column(length =50, name="nome")
    private String nome;
    
    @Column(length =11, name="cpf_Paciente")
    private String cpf_Paciente;
    
    @Column(length =11, name="cpf_Responsavel")
    private String cpf_Responsavel;
    
    @Column(length =9, name="rg_Paciente")
    private String rg_Paciente;
    
    @Column(length =9, name="rg_Responsavel")
    private String rg_Responsavel;
    
    @Column(length =50, name="nomeResponsavel")
    private String nomeResponsavel; 
    
    @Column(length =50, name="endereco_Paciente")
    private String endereco_Paciente;
    
    @Column(length =50, name="endereco_Responsavel")
    private String endereco_Responsavel;
    
    @Column(length =15, name="telefone_Paciente")
    private String telefone_Paciente;
    
    @Column(length =15, name="telefone_Responsavel")
    private String telefone_Responsavel;
    
    @Column(length =50, name="email_Responsavel")
    private String email_Responsavel;
    
    @Column(length =50, name="email_Paciente")
    private String email_Paciente;
    
    @Column(length =50, name="convenio")
    private String convenio;
    
    @Column(length =20, name="senhaDeAcesso")
    private String senhaDeAcesso;
       
    public Paciente(){
        this.codigo = 0;
        this.nome = "";
        this.convenio = "";
        this.cpf_Paciente="";
        this.cpf_Responsavel="";
        this.email_Paciente="";
        this.email_Responsavel="";
        this.endereco_Paciente="";
        this.endereco_Responsavel="";
        this.nomeResponsavel="";
        this.rg_Paciente="";
        this.rg_Responsavel="";
        this.senhaDeAcesso="";
        this.telefone_Paciente="";
        this.telefone_Responsavel="";
    }
    
    //Get e Set
    public Integer getPaciente() {
        return getCodigo();
    }


    public void setPaciente(Integer paciente) {
        this.setCodigo(paciente);
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
        public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCpf_Paciente() {
        return cpf_Paciente;
    }

    public void setCpf_Paciente(String cpf_Paciente) {
        this.cpf_Paciente = cpf_Paciente;
    }
    
    public String getRg_Paciente() {
        return rg_Paciente;
    }

    public void setRg_Paciente(String rg_Paciente) {
        this.rg_Paciente = rg_Paciente;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCpf_Responsavel() {
        return cpf_Responsavel;
    }

    public void setCpf_Responsavel(String cpf_Responsavel) {
        this.cpf_Responsavel = cpf_Responsavel;
    }

    public String getRg_Responsavel() {
        return rg_Responsavel;
    }

    public void setRg_Responsavel(String rg_Responsavel) {
        this.rg_Responsavel = rg_Responsavel;
    }
    
    public String getEndereco_Paciente() {
        return endereco_Paciente;
    }

    public void setEndereco_Paciente(String endereco_Paciente) {
        this.endereco_Paciente = endereco_Paciente;
    }
    
    public String getEndereco_Responsavel() {
        return endereco_Responsavel;
    }

    public void setEndereco_Responsavel(String endereco_Responsavel) {
        this.endereco_Responsavel = endereco_Responsavel;
    }

    public String getTelefone_Paciente() {
        return telefone_Paciente;
    }

    public void setTelefone_Paciente(String telefone_Paciente) {
        this.telefone_Paciente = telefone_Paciente;
    }

    public String getTelefone_Responsavel() {
        return telefone_Responsavel;
    }

    public void setTelefone_Responsavel(String telefone_Responsavel) {
        this.telefone_Responsavel = telefone_Responsavel;
    }

    public String getEmail_Responsavel() {
        return email_Responsavel;
    }

    public void setEmail_Responsavel(String email_Responsavel) {
        this.email_Responsavel = email_Responsavel;
    }

    public String getEmail_Paciente() {
        return email_Paciente;
    }

    public void setEmail_Paciente(String email_Paciente) {
        this.email_Paciente = email_Paciente;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getSenhaDeAcesso() {
        return senhaDeAcesso;
    }

    public void setSenhaDeAcesso(String senhaDeAcesso) {
        this.senhaDeAcesso = senhaDeAcesso;
    }
       
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.getCodigo());
        hash = 31 * hash + Objects.hashCode(this.getNome());
        hash = 31 * hash + Objects.hashCode(this.getConvenio());
        hash = 31 * hash + Objects.hashCode(this.getCpf_Paciente());
        hash = 31 * hash + Objects.hashCode(this.getCpf_Responsavel());
        hash = 31 * hash + Objects.hashCode(this.getEmail_Paciente());
        hash = 31 * hash + Objects.hashCode(this.getEmail_Responsavel());
        hash = 31 * hash + Objects.hashCode(this.getEndereco_Paciente());
        hash = 31 * hash + Objects.hashCode(this.getEndereco_Responsavel());
        hash = 31 * hash + Objects.hashCode(this.getNomeResponsavel());
        hash = 31 * hash + Objects.hashCode(this.getRg_Paciente());
        hash = 31 * hash + Objects.hashCode(this.getRg_Responsavel());
        hash = 31 * hash + Objects.hashCode(this.getSenhaDeAcesso());
        hash = 31 * hash + Objects.hashCode(this.getTelefone_Paciente());
        hash = 31 * hash + Objects.hashCode(this.getTelefone_Responsavel());
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
        final Paciente other = (Paciente) obj;
               
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.convenio, other.convenio)) {
            return false;
        }
        if (!Objects.equals(this.cpf_Paciente, other.cpf_Paciente)) {
            return false;
        }
        if (!Objects.equals(this.cpf_Responsavel, other.cpf_Responsavel)) {
            return false;
        }
        if (!Objects.equals(this.email_Paciente, other.email_Paciente)) {
            return false;
        }
        if (!Objects.equals(this.email_Responsavel, other.email_Responsavel)) {
            return false;
        }
        if (!Objects.equals(this.endereco_Paciente, other.endereco_Paciente)) {
            return false;
        }
        if (!Objects.equals(this.endereco_Responsavel, other.endereco_Responsavel)) {
            return false;
        }
        if (!Objects.equals(this.nomeResponsavel, other.nomeResponsavel)) {
            return false;
        }
        if (!Objects.equals(this.rg_Paciente, other.rg_Paciente)) {
            return false;
        }
        if (!Objects.equals(this.rg_Responsavel, other.rg_Responsavel)) {
            return false;
        }
        if (!Objects.equals(this.senhaDeAcesso, other.senhaDeAcesso)) {
            return false;
        }
        if (!Objects.equals(this.telefone_Paciente, other.telefone_Paciente)) {
            return false;
        }
        if (!Objects.equals(this.telefone_Responsavel, other.telefone_Responsavel)) {
            return false;
        }
        return true;
    }
}