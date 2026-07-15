import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class c {
    static void main() {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(10);
        numeros.add(3);
        numeros.add(4);
        numeros.add(12);
        numeros.add(1);
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);

        var primeiro = new Titulo();
        primeiro.setNome("C");
        var segundo = new Titulo();
        segundo.setNome("A");
        var terceiro = new Titulo();
        terceiro.setNome("B");

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(primeiro);
        listaTitulos.add(segundo);
        listaTitulos.add(terceiro);

        Collections.sort(listaTitulos);
        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
}}
