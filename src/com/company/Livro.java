package com.company;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    String nomeDoAutor;
    String emailDoAutor;
    String cpfDoAutor;

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro ";
        System.out.println("\n" + mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("\n--");
    }
}
