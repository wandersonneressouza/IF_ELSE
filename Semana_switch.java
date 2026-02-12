  /*Exercício 6 - Dia da Semana (Switch)
  Usando switch, receba um número de 1 a 7 e
  imprima o dia da semana correspondente (1=Domingo, 2=Segunda, etc.). */
  
  import java.util.Scanner;
  
  public class Semana_switch{
    
    public static void main (String[] args) {
      
      int semana;
      
      Scanner in = new Scanner(System.in);
      
      System.out.printf("DIGITE UM NUMERO DE 1 A 7.    ");
      semana = in.nextInt();
      
        
        switch (semana) {
          
        case 1:
        System.out.println("Domingo");
        break;
        
        case 2:
        System.out.println("Segunda");
        break;
        
        case 3:
        System.out.println("Terça");
        break;
        
        case 4:
        System.out.println("Quarta");
        break;
      
        case 5:
        System.out.println("Quinta");
        break;
      
        case 6:
        System.out.println("Sexta");
        break;
      
        case 7:
        System.out.println("Sabado");
        break;
        
        default:
        System.out.println("Opção Invalida!");
      }
    }
    
      
  }
