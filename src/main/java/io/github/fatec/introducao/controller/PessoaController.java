package io.github.fatec.introducao.controller;

import io.github.fatec.introducao.DTO.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private Map<String, String> banco = new HashMap<>();

    // GET - listar todas
    @GetMapping
    public Map<String, String> listar() {
        return banco;
    }

    // GET por id
    @GetMapping("/{id}")
    public String buscar(@PathVariable String id) {
        return banco.get(id);
    }

    // POST - adicionar
    @PostMapping
    public String criar(@RequestBody PessoaRequestPost request) {

        String id = UUID.randomUUID().toString();
        banco.put(id, request.getNome());

        return "Pessoa criada com id: " + id;
    }

    // PUT - atualizar
    @PutMapping("/{id}")
    public String atualizar(@PathVariable String id,
                            @RequestBody PessoaRequestPut request) {

        banco.put(id, request.getNome());
        return "Pessoa atualizada com sucesso";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable String id) {

        banco.remove(id);
        return "Pessoa deletada com sucesso";
    }
}