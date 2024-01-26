import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int fatorialDe = factorial(n);

    System.out.println("O fatorial de " + n + " é " + fatorialDe);
    scanner.close();
  }

  private static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

}
