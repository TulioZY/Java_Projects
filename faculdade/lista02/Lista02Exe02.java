package faculdade.lista02;

import java.util.ArrayList;

public class Lista02Exe02 {

    private ArrayList<Livro> livros;

    public Lista02Exe02() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int quantidadeDisponivel) {
        livros.add(new Livro(titulo, autor, quantidadeDisponivel));
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivro(String titulo) throws LivroNaoEncontradoException, LivroNaoDisponivelException {
        Livro livro = buscarLivro(titulo);
        if (livro == null) {
            throw new LivroNaoEncontradoException("Livro não encontrado: " + titulo);
        }
        livro.emprestar();
    }

    public class Livro {

        private String titulo;
        private String autor;
        private int quantidadeDisponivel;

        public Livro(String titulo, String autor, int quantidadeDisponivel) {
            this.titulo = titulo;
            this.autor = autor;
            this.quantidadeDisponivel = quantidadeDisponivel;
        }

        public String getTitulo() {
            return titulo;
        }

        public void emprestar() {
            if (quantidadeDisponivel > 0) {
                quantidadeDisponivel--;
            } else {
                throw new LivroNaoDisponivelException("Livro não disponível para empréstimo: " + titulo);
            }
        }
    }

    public class LivroNaoEncontradoException extends RuntimeException {

        public LivroNaoEncontradoException(String mensagem) {
            super(mensagem);
        }
    }

    public class LivroNaoDisponivelException extends RuntimeException {

        public LivroNaoDisponivelException(String mensagem) {
            super(mensagem);
        }
    }

    
    public static void main(String[] args) {
        Lista02Exe02 biblioteca = new Lista02Exe02();

        biblioteca.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 2);
        biblioteca.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1);

        try {
            biblioteca.emprestarLivro("O Senhor dos Anéis");
            System.out.println("Livro 'O Senhor dos Anéis' emprestado com sucesso!");
        } catch (LivroNaoEncontradoException | LivroNaoDisponivelException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            biblioteca.emprestarLivro("O Pequeno Príncipe");
            System.out.println("Livro 'O Pequeno Príncipe' emprestado com sucesso!");
        } catch (LivroNaoEncontradoException | LivroNaoDisponivelException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            biblioteca.emprestarLivro("O Senhor dos Anéis");
            System.out.println("Livro 'O Senhor dos Anéis' emprestado com sucesso!");
        } catch (LivroNaoEncontradoException | LivroNaoDisponivelException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
