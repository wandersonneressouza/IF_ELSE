  /*Exercício 6 - Dia da Semana (Switch)
  Usando switch, receba um número de 1 a 7 e
  imprima o dia da semana correspondente (1=Domingo, 2=Segunda, etc.). */
  import java.util.Scanner;
  
  public class Semana{
    
    public static void main (String[] args) {
      
      int semana;
      
      Scanner in = new Scanner(System.in);
      
      System.out.printf("DIGITE UM NUMERO DE 1 A 7.    ");
      semana = in.nextInt();
      
        if(semana == 1){
        System.out.print("1 = Domingo");}
        else if(semana == 2){
        System.out.print("2 = Segunda");}
        else if(semana == 3){
        System.out.print("3 = Terça");}
        else if(semana == 4){
        System.out.print("4 = Quarta");}
        else if(semana == 5){
        System.out.print("5 = Quinta");}
        else if(semana == 6){
        System.out.print("6 = Sexta");}
        else if(semana == 7){
        System.out.print("7 = Sabado");}
        else{
        System.out.print("Numero Invalido!");}
      
    }
    
      
  }
