import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner intro = new Scanner (System.in);
    int numImpar = intro.nextInt();
    int resultado = numImpar * 3;
    for ( numImpar = 0 ; numImpar < 3 ; numImpar++)
      System.out.println(numImpar);
  }
}