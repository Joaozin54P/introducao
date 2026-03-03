package io.github.fatec.introducao.DTO;

public class PessoaRequestPut {

    private String id;
    private String nome;
    private String telefone;
    private String endereco;

    public PessoaRequestPut() {}

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }

    public void setId(String id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}