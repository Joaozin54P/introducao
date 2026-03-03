package io.github.fatec.introducao.DTO;

public class PessoaResponse {

    private long id;
    private String nome;

    public PessoaResponse() {}

    public PessoaResponse(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }

    public void setId(long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
}