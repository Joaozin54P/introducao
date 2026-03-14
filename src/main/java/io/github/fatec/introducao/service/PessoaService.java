package io.github.fatec.introducao.service;

import io.github.fatec.introducao.DTO.PessoaRequestPost;
import io.github.fatec.introducao.DTO.PessoaRequestPut;
import io.github.fatec.introducao.model.Pessoa;
import io.github.fatec.introducao.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> listar() {
        return repository.findAll();
    }

    public Pessoa criar(PessoaRequestPost request) {

        Pessoa pessoa = new Pessoa(
                request.getNome(),
                request.getTelefone(),
                request.getEndereco()
        );

        return repository.save(pessoa);
    }

    public Pessoa atualizar(String id, PessoaRequestPut request) {

        Pessoa pessoa = repository.findById(id)
                .orElseThrow();

        pessoa.setNome(request.getNome());
        pessoa.setTelefone(request.getTelefone());
        pessoa.setEndereco(request.getEndereco());

        return repository.save(pessoa);
    }

    public String deletar(String id) {
        repository.deleteById(id);
        return "Pessoa deletada";
    }
}