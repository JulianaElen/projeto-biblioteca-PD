package com.mycompany.app;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class PessoaTest {

    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa("Jessica Felix");
        pessoa.setNome("Jess");
        assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testSetNome() {
        Pessoa pessoa = new Pessoa("Jess");
        pessoa.setNome("Jessica");
        assertEquals("Jessica", pessoa.getNome());
    }

    @Test
    public void testGetLivros() {
        // Cria uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("Jessica");
        Autor autor = new Autor("Jess", "Brasileira");

        // Define uma lista de livros para a pessoa
        List<Livro> livros = Arrays.asList(
                new Livro("Java Basico", autor, "tecnologia", true),
                new Livro("Java Avançado", autor, "tecnologia", true)
        );

        pessoa.setLivros(livros);

        // Verifica se a lista de livros retornada é a mesma que foi definida
        assertEquals(livros, pessoa.getLivros());
    }

  @Test
    public void testSetLivros() {
        // Cria uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("Jessica");

        // Define uma lista de livros para a pessoa
        List<Livro> livros = Arrays.asList(
            new Livro(null, null, null, false),
            new Livro(null, null, null, false)
        );

        pessoa.setLivros(livros); // Agora aceita um array, pois o método foi ajustado

        // Verifica se a lista de livros retornada é a mesma que foi setada
        assertEquals(livros, pessoa.getLivros());
    }
}        