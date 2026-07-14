import java.util.ArrayList;

public class Main {

    static void main() {

        var primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Angelo Roberto Da Silva Medeiros ");
        primeiraPessoa.setIdade(22);
        var segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Taina Roberta Da Silva Medeiros ");
        segundaPessoa.setIdade(19);

        System.out.println(primeiraPessoa.toString() + segundaPessoa.toString());

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(primeiraPessoa);
        listaDePessoas.add(segundaPessoa);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas.get(1));

        var arroz = new Produto("Arroz", 22.99, 1);
        var feijao = new Produto("Feijao", 8.99, 1);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(arroz);
        listaDeProdutos.add(feijao);
        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(0));
        System.out.println(listaDeProdutos.get(1));
        var cocaCola = new ProdutoPerecivel("Coca Cola ", 5, 1, "01/11/2026");
        System.out.println(cocaCola);



    }
}
