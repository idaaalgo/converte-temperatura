import java.util.Scanner;

public class CelsiusToFahreinheit {
    public static void main(String[] args) {
        String cabecalho = """
                        ----------------------------------
                        PROGRAMA PRA CONVERTER TEMPERATURA
                           DE CELSIUS PARA FAHREINHEIT
                        ----------------------------------
                        """;
        System.out.println(cabecalho);
        //Váriaveis
        double celsius;
        double fahreinheit;

        Scanner dados = new Scanner(System.in);
        System.out.println("Informe a Temperatura em Graus Celsius, para efetuar a conversão: ");
        celsius = dados.nextDouble();
        fahreinheit = (celsius * 1.8) + 32;

        System.out.println(String.format("A temperatura de %.2f Cº equivale " +
                                        "à %.2f Fº.", celsius, fahreinheit));

    }
}