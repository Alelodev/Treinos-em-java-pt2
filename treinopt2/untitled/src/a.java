import java.util.ArrayList;

public class a {
    static void main() {
        ArrayList<String> listaDeAnimais = new ArrayList<>();
        String cachorro = "Cachorro";
        String gato = "Gato";
        String golfinho = "Golfinho";

        var labrador = new Cachorro();
        labrador.setRaca("Labrador");

        Animal animal = (Animal) labrador;

        if (animal instanceof Cachorro){
            Cachorro cachorro1 = (Cachorro) animal;
            System.out.println("É Cachorro");
        } else {
            System.out.println("N è um Cachorro");
        }

        listaDeAnimais.add(cachorro);
        listaDeAnimais.add(gato);
        listaDeAnimais.add(golfinho);

        for (String listaDeAnimai : listaDeAnimais) {
            System.out.println(listaDeAnimai);
        }
    }
}
