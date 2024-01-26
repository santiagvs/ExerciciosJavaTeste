import java.util.Locale;
import java.util.Scanner;

public class Troco {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);
    double valor = scanner.nextDouble();

    int centavos = (int) Math.round(valor * 100);

    System.out.println("Notas:");
    int[] notas = { 100, 50, 20, 10, 5, 2 };
    for (int nota : notas) {
      int quantidadeNotas = centavos / (nota * 100);
      centavos %= nota * 100;
      System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
    }

    System.out.println("Moedas:");
    int[] moedas = { 100, 50, 25, 10, 5, 1 };
    for (int moeda : moedas) {
      int quantidadeMoedas = centavos / moeda;
      centavos %= moeda;
      double valorMoeda = moeda / 100.0;
      System.out.println(quantidadeMoedas + " moeda(s) de R$ " + valorMoeda);
    }

    scanner.close();
  }
}
