import java.util.ArrayList;

public class b {
    static void main() {
        var primeira = new ContaBancaria();
        primeira.setSaldo(2000);
        primeira.setNome("Angelo Roberto Da Silva Medeiros");
        primeira.setNumeroDaConta(123);
        var segunda = new ContaBancaria();
        segunda.setNome("Sabrina Gleice Da SIlva medeiros");
        segunda.setSaldo(10000);
        segunda.setNumeroDaConta(456);
        var terceira = new ContaBancaria();
        terceira.setNumeroDaConta(789);
        terceira.setNome("Tarcio Sales Medeiros");
        terceira.setSaldo(9000);
        var quarta = new ContaBancaria();
        quarta.setNome("Taina Roberta Da Silva Medeiros");
        quarta.setSaldo(4000);
        quarta.setNumeroDaConta(101112);


        ArrayList<Double> listaDeSaldos = new ArrayList<>();
        listaDeSaldos.add(primeira.getSaldo());
        listaDeSaldos.add(segunda.getSaldo());
        listaDeSaldos.add(terceira.getSaldo());
        listaDeSaldos.add(quarta.getSaldo());
        double saldoMaisAlto = 0;

        for (Double listaDeSaldo : listaDeSaldos) {
            if(listaDeSaldo > saldoMaisAlto){
                saldoMaisAlto = listaDeSaldo;
            }
        }
        System.out.printf("O saldo mais alto é: %s%n", saldoMaisAlto);
        }
    }

