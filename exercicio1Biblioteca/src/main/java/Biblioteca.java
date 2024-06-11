import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionaLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros(){
        System.out.println("Livros disponíneis na Biblioteca:\n");
        for (int i = 0; i < livros.size() ; i++) {
            Livro livro = livros.get(i);
            System.out.println(livro);
            System.out.println();
        }
    }
}
