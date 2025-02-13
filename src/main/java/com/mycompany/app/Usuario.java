package com.mycompany.app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario extends Pessoa {
    protected int idade;
    protected List<Emprestimo> emprestimos;

    public Usuario(String nome, int idade) {
        super(nome);
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
        this.idade = idade;
        this.emprestimos = new ArrayList<>();
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    public List<Emprestimo> getEmprestimos() {
        return Collections.unmodifiableList(emprestimos);
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        if (emprestimos == null) {
            throw new IllegalArgumentException("A lista de empréstimos não pode ser nula.");
        }
        this.emprestimos.clear();
        this.emprestimos.addAll(emprestimos);
    }
}
