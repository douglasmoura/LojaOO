package TesteDIO15;

public class Livro extends Produto implements Imposto{
    
    private String autor;
    private String tema;
    private Integer quantidadePagina;

    public Livro(String nome, Double preco, Integer quantidade, String autor, String tema, Integer quantidadePagina) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.tema = tema;
        this.quantidadePagina = quantidadePagina;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Integer getQuantidadePagina() {
        return quantidadePagina;
    }

    public void setQuantidadePagina(Integer quantidadePagina) {
        this.quantidadePagina = quantidadePagina;
    }
 
    
    @Override
    public Double calculaImposto() {
         
        if ( getTema() == "educativo") {
   
            return 0.0;
        }else
            return getPreco() * 0.10;
    } 
}
