public class Recursivo {
  public static void main(String[] args) {
    int n = 7;
    int fatorialDe = factorial(n);

    System.out.println("O fatorial de " + n + " é " + fatorialDe);
  }

  private static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
