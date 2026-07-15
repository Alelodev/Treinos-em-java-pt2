import com.google.gson.Gson;

public class mainn {

    record Editora(String nome, String cidade) {}
    record Livro(String titulo, String autor, Editora editora) {}

    static void main() {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\"," +
                "\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\"," +
                "\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println("Objeto Livro: " + livro);
    }
}
