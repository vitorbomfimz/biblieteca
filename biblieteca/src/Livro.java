public class Livro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    // Construtor que recebe titulo, autor e anoPublicacao
    // Por padrão, o atributo disponivel será true
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;  // Padrão de disponibilidade
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Método toString para exibir os dados do livro
    @Override
    public String toString() {
        return "Livro [Título=" + titulo + ", Autor=" + autor + ", Ano de Publicação=" + anoPublicacao + ", Disponível=" + disponivel + "]";
    }
}
