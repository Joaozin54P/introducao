package io.github.fatec.introducao.DTO;

public class PessoaRequestPost {

    private String nome;
    private String telefone;
    private String endereco;

    public PessoaRequestPost() {}

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }

    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}