package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        Livro livro1 = new Livro("os 3 porquinhos",150);

        System.out.println(gato);
        System.out.println(livro1);
        /* int a = 5;
        int b = 3;
        System.out.println("Hello World!! "+ (a+b));*/

    }
}

class Livro{
    private String Nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        Nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Nome='" + Nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}