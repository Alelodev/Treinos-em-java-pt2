import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoParaObjetoFlexivel {
    static void main() {
        String jsonpessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasilia\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonpessoa, Pessoa.class);

        System.out.println(pessoa);
    }
}
