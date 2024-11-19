public class Etwas {
  private int x;

  public static void main(String[] args) {
    Etwas etwas = new Etwas();

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println("Original array: " + Arrays.toString(arr));

    int sum = etwas.sum(arr);
    System.out.println("Summe: " + sum);

    int min = etwas.minimum(arr);
    System.out.println("Minimum: " + min);

    int max = etwas.maximum(arr);
    System.out.println("Maximum: " + max);

    double durchschnitt = etwas.average(arr);
    System.out.println("Durchschnitt: " + durchschnitt);

    int[] sortiertesArray = etwas.sortieren(arr);
    System.out.println("Sortierter array: " + Arrays.toString(sortiertesArray));
  }

  public boolean istGerade(int y) {
    return x % 2 == 0;
  }

  public boolean istUngerade(int y) {
    return x % 2 != 0;
  }

  public boolean istPrimzahl(int y) {
    if (x < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(x); i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }

  public boolean istQuadratzahl(int y) {
    int sqrt = (int) Math.sqrt(x);
    return sqrt * sqrt == x;
  }
}
