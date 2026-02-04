   /* Exercício 4 - Aprovado ou Reprovado
Receba uma nota (0 a 10) e imprima "Aprovado" se for maior ou igual a 6, caso contrário "Reprovado".
 */   
     
import java.util.Scanner;

  public class Nota{
  
    public static void main(String[] args) {
    
      double nota;
    
        Scanner in = new Scanner(System.in);
    
        System.out.print("Digite Sua Nota: ");
          nota = in.nextDouble();
      
        if (nota >= 6){
          System.out.print("VC FOI APROVADO! ");
        }else{
          System.out.print("VC FOI REPROVADO! ");
      }
      
    
    } 
    
  }
