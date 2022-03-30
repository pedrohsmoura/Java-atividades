import java.util.Scanner;

public class Main{ 
  public static void main(String[]args){
  Scanner myObj = new Scanner(System.in);
  System.out.println("digite sua idade");
  int idade = myObj.nextInt();
  if (idade >= 18){
      System.out.println("pode votar");
  }
  else{
      System.out.println("nao pode votar");
  }
}
}
