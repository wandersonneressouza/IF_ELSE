 /* Exercício 9 - Login Simples
Verifique se um nome de usuário é "admin" e senha é "1234".
Informe "Acesso concedido" ou "Acesso negado". */
 
import java.util.Scanner;
  
  public class NomeSenha{
    //nome == "admin"
    //senha == "1234"
    
      public static void main (String[] args) {
        
        String user;
        int senha;
      
        Scanner in = new Scanner(System.in);
      
        System.out.printf("Digite o nome do Usuario: ");
          user = in.nextLine();
          
        System.out.printf("Digite a senha do Usuario: ");
          senha = in.nextInt();
          
      
      //System.out.print(user +" "+senha);
      
      // metodo para comparar Strings
      //user.equals("admin")
      
                //jeito certo de fazer!
            if (user.equals("admin") && senha == 1234) {
              System.out.print("Acesso Autorizado!");}
            else {
              System.out.print("Acesso Negado!");}
      
        in.close();
      
      }

  }
  
  /* dicas GPT. usar senha como STRING nao como INT, pois
  usuario pode querer cadastrar senha como letras e numeros, e nao apenas numeros
  */
