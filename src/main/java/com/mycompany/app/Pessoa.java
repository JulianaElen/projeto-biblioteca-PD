package com.mycompany.app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa {
    protected String nome;
    protected List<Livro> livros;

    public Pessoa(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return Collections.unmodifiableList(livros);
    }

    public void setLivros(List<Livro> livros) {
        this.livros.clear();
        this.livros.addAll(livros);
    }
}
