import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada =  new Scanner (System.in);
    double pe;
      System.out.print("Que medida você quer alcançar? ");
      pe = entrada.nextDouble();
    double polegadas,jardas, milhas;
     polegadas = pe*12;
     jardas = polegadas*3;
     milhas = jardas*1760;
    System.out.println(polegadas);
    System.out.println(jardas);
    System.out.println(milhas);
    }
  }
