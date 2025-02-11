package introduction.pacotes.com.rasmoo.curso.banco.model;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private double salario;

    // construtor
    public Cliente ( String nome, String cpf ) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // getters e setters
    // nome
    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    // cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf( String cpf ) {
        this.cpf = cpf;
    }
    // profissao
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao( String profissao ) {
        this.profissao = profissao;
    }

    // salario
    public double getSalario() {
        return salario;
    }

    public void setSalario( double salario ) {
        this.salario = salario;
    }

    // toString
    @Override
    public String toString() {
        return "Cliente{" +
                "nome = '" + nome + '\'' +
                ", cpf = '" + cpf + '\'' +
                '}';
    }
}
