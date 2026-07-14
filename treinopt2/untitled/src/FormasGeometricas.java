import java.util.ArrayList;

public class FormasGeometricas {
    static void main() {

        var quadrado1 = new Quadrado();
        quadrado1.setLado(2);
        var circulo1 = new Circulo();
        circulo1.setRaio(5);

        ArrayList<Object> listaDaAreaDeFormasGeometricas = new ArrayList<>();
        listaDaAreaDeFormasGeometricas.add(quadrado1.calcularArea());
        listaDaAreaDeFormasGeometricas.add(circulo1.calcularArea());

        for (Object listaDaAreaDeFormasGeometrica : listaDaAreaDeFormasGeometricas) {
            System.out.println(listaDaAreaDeFormasGeometrica);
        }
    }
}
