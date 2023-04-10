import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 07/04/2023 */

public class App {

  public static void main(String[] args) {
    System.out.println("Digite o valor da lateral do quadrado: ");
    float lado = new Scanner(System.in).nextFloat();
    System.out.println("O dobro da area do quadrado eh de: " + ((lado * lado) * 2) );
  }

}
