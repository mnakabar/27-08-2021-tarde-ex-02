package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Livros livro = new Livros();

        livro.Autor = "TESTE, autor";
        livro.Titulo = "Livro para teste";
        livro.Genero = "Terror";
        livro.NumPaginas = 10;

        Pessoa pessoa = new Pessoa();
        pessoa.Nome = "Maria";
        pessoa.Idade = 25;
        pessoa.Habilidades.add("Escrever");
        pessoa.Habilidades.add("Contabil");

        Relatorio relatorio = new Relatorio();
        relatorio.Comprimento = 10;
        relatorio.NumPagina = 10;
        relatorio.Autor = "TESTE, Autor";
        relatorio.Revisor = "TESTE, Revisor";

        Imprimir.ImprimirDocumento(livro);
        Imprimir.ImprimirDocumento(pessoa);
        Imprimir.ImprimirDocumento(relatorio);
    }
}
