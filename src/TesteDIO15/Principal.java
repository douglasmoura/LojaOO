package TesteDIO15;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro("Harry Potter", 40.0, 50, "J. K. Rowling", "fantasia", 300);
        Livro l2 = new Livro("Harry Potter", 60.0, 30, "J. R. R. Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20.0, 50, "GFT", "educativo", 500);

        VideoGame ps4 = new VideoGame("PS4", 1800.0, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000.0, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500.0, 500, "Microsoft", "One", false);

        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
       
        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);
        
        Loja americanas = new Loja("Americanas","12345678", livros, games);

        System.out.println("R$ " +l2.calculaImposto()+" de imposto sobre o livro "+ l2.getNome()); 
        System.out.println("R$ " +l3.calculaImposto()+" de imposto sobre o livro "+ l3.getNome()); 

        System.out.println("R$ " + ps4Usado.calculaImposto()+" de imposto sobre o "+ ps4Usado.getNome()+ " "+ ps4Usado.getModelo()+" Usado: "+ ps4Usado.isUsado());
        System.out.println("R$ " + ps4.calculaImposto()+" de imposto sobre o "+ ps4.getNome()+ " "+ ps4.getModelo()+" Usado: "+ ps4.isUsado());

        americanas.listaLivros();
        americanas.listaVideoGame();
        System.out.println("O patrimonio da loja: "+ americanas.getNome()+" é de " + americanas.calculaPatrimonio());

    }
}
