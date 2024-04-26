package listas;

public class Nome {

    private String titulo; // Título (Sr., Sra., Dr., etc)
    private String nomePrincipal; 
    private String nomeMeio; 
    private String sobrenome; 


    public Nome(String titulo, String nomePrincipal, String nomeMeio, String sobrenome) {
        this.titulo = titulo;
        this.nomePrincipal = nomePrincipal;
        this.nomeMeio = nomeMeio;
        this.sobrenome = sobrenome;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomePrincipal() {
        return nomePrincipal;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNomePrincipal(String nomePrincipal) {
        this.nomePrincipal = nomePrincipal;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Método para obter o nome completo da pessoa
    public String obterNomeCompleto() {
        String nomeCompleto = titulo + " " + nomePrincipal;

        if (nomeMeio != null) {
            nomeCompleto += " " + nomeMeio;
        }

        nomeCompleto += " " + sobrenome;
        return nomeCompleto;
    }

}


