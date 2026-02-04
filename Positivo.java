/* Exercício 5 - Positivo, Negativo ou Zero
Receba um número e classifique-o como "Positivo", "Negativo" ou "Zero".*/

import java.util.Scanner;

public class Positivo{

  public static void main (String[] args) {
 
  Scanner in = new Scanner(System.in);
  
  double numb;
  
  System.out.print("Digite um Numero: ");
  numb = in.nextDouble();
  
    if (numb == 0){
    System.out.print("Numero é ZERO!");
    }else if (numb > 0){
    System.out.print("Numero e POSITIVO!");
    }else{
    System.out.print("Numero é NEGATIVO!");
    }
    
  
 }
}
