package com.company;

public class Main {

    public static void main(String[] args) {
	Livro livro = new Livro();
    livro.nome = "Java 8 prático";
    livro.descricao = "Novos recursos da linguagem";
    livro.valor = 59.90;
    livro.isbn = "978-85-66250-46-6";

    livro.mostrarDetalhes();

    Livro outroLivro = new Livro();
    outroLivro.nome = "Lógica de Programação";
    outroLivro.descricao = "Crie seus Primeiros Programas";
    outroLivro.valor = 59.90;
    outroLivro.isbn = "978-85-66250-22-0";

    outroLivro.mostrarDetalhes();

    }
}
