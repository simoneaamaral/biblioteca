import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro();
        livro1.setTitulo("Quem me roubou de mim");
        livro1.setAutor("Fábio de Melo");
        livro1.setAnoPublicacao(2008);
        biblioteca.adicionaLivro(livro1);
        Livro livro2 = new Livro("Filosofia para corajosos","Luiz Felipe Pondé",2016);
        biblioteca.adicionaLivro(livro2);
        Livro livro3 = new Livro("Talvez você deva Conversar com alguém", "Lori Gottlieb", 2020);
        biblioteca.adicionaLivro(livro3);
        Livro livro4 = new Livro("Inteligência do carisma","Heni Ozi Cukier",2019);
        biblioteca.adicionaLivro(livro4);
        biblioteca.listarLivros();

    }
}
