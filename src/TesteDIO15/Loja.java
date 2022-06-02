package TesteDIO15;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    
    private String nome;
    private String cnpj;
    private List<Livro> livros = new ArrayList<Livro>();
    private List<VideoGame> videoGames = new ArrayList<VideoGame>();

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGame) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGame;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    public List<VideoGame> getVideoGame() {
        return videoGames;
    }
    public void setVideoGame(List<VideoGame> videoGame) {
        this.videoGames = videoGame;
    }
  
    public void listaLivros(){
        for (int i = 0; i < getLivros().size(); i++) {  
            if (getLivros().get(i) == null) {
                System.out.println("A loja não tem livros no seu estoque.");
            } else
            System.out.println("Título: "+getLivros().get(i).getNome()+", preço "+ getLivros().get(i).getPreco()+", quantidade: "+ getLivros().get(i).getQuantidade());
        }
    };

    public void listaVideoGame(){
        for (int i = 0; i < getVideoGame().size(); i++) {  
            if (getVideoGame().get(i) == null) {
                System.out.println("A loja não tem vídeo-games no seu estoque.");
            } else
            System.out.println("Video-game: "+ getVideoGame().get(i).getModelo()+", preço "+getVideoGame().get(i).getPreco()+", quantidade: "+ getVideoGame().get(i).getQuantidade());
           
        }
    };

    public Double calculaPatrimonio(){
        Double soma = 0.0;
    
        for (Livro livro : livros) {
            soma += livro.getPreco() * livro.getQuantidade();
        }   
        for (VideoGame videogame : videoGames) {
            soma += videogame.getPreco() * videogame.getQuantidade();
        }

        return soma;
    }

}
