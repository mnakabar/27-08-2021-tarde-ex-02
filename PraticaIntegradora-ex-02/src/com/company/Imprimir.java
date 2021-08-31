package com.company;

public class Imprimir {

    public Imprimir(){

    }

    public static void ImprimirDocumento(Object documento) {
        if(documento.getClass() == Livros.class){
            var livro = (Livros) documento;
            System.out.println("\nIremos imprimir um livro");
            System.out.println("Autor:  " + livro.Autor);
            System.out.println("Titulo:  " + livro.Titulo);
            System.out.println("Genero:  " + livro.Genero);
            System.out.println("Numero de Páginas:  " + livro.NumPaginas);
        }
        else if(documento.getClass() == Pessoa.class) {
            var pessoa = (Pessoa) documento;
            System.out.println("\nIremos imprimir um curriculo");
            System.out.println("Nome:  " + pessoa.Nome);
            System.out.println("Idade:  " + pessoa.Idade);
            System.out.println("Habilidades: ");
            for(int i = 0; i < pessoa.Habilidades.size(); i++){
                System.out.println((i + 1) + " - " + pessoa.Habilidades.get(i));
            }
        }
        else if(documento.getClass() == Relatorio.class){
            var relatorio = (Relatorio) documento;
            System.out.println("\nIremos imprimir um relatorio");
            System.out.println("Autor:  " + relatorio.Autor);
            System.out.println("Revisor:  " + relatorio.Revisor);
            System.out.println("Numero de Páginas:  " + relatorio.NumPagina);
            System.out.println("Comprimento:  " + relatorio.Comprimento);
        }
    }

}
