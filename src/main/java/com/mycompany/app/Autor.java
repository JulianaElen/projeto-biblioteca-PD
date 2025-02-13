package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private List<Livro> obrasPublicadas;

    // Construtor com nome e nacionalidade
    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = new ArrayList<>();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        return obrasPublicadas.stream()
            .filter(livro -> livro.getGenero().equalsIgnoreCase(genero))
            .toList();
    }
}
