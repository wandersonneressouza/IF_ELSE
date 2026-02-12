/*Exercício 11 - Ano Bissexto
Verifique se um ano é bissexto. Regra: Divisível por 4,
mas não por 100, exceto se for divisível por 400.
*/

import java.util.Scanner;

public class Bissexto {

    public static void main(String[] args) {

        int ano;

        Scanner in = new Scanner(System.in);
        
      System.out.print("BEM VINDO! ");
      System.out.print("VERIFIQUE SE O ANO E BISSEXTO.");
      System.out.print("DIGITE O ANO PRA TESTAR: ");
        ano = in.nextInt();
        
      System.out.print("VC DIGITOU " + ano );
      
      if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0 ){
        System.out.print( ano + " É BISSEXTO ");
      }else{
        System.out.print( ano + " NAO E BISSEXTO ");
      }
      
      in.close();
    }
}

/* 
&&  → E
||  → OU
*/
