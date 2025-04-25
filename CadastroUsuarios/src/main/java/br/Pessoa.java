package br;

import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class Pessoa {
    
    private String nome;
    private ArrayList<String> nomes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void adicionarNome() {
        nomes.add(nome);
        nome = ""; // limpa o campo após adicionar
    }
}
