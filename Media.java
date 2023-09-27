import java.util.Scanner;
import java.util.Arrays;
import java.util.ArraysList;
import java.util.Random;
class Media {
  public static void main(String[] args) {
    double[] v = new int[10];
    double soma = 0.0;
    
System.out.print("Informe 10 valores numericos: ");
  for (int i = 0 ; i < 10 ; i++ ) {
    v[i] = input.nextDouble();
    soma = soma + v[i];

  }
    System.out.println(Arrays.tostring(v));

    double media = soma/ v.length;
    System.out.println("Media: " + media);
  }
}