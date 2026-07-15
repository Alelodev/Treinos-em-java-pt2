import com.google.gson.Gson;

public class ConversaoParaObjeto {
    static void main() {
        String jsonpessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasilia\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonpessoa, Pessoa.class);

        System.out.println(pessoa);
    }
}
