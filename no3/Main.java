import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String input;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan perhitungan: ");
    input = scan.nextLine();
    scan.close();
    
    String[] split = input.split(" ");
    String operator = split[1];
    int firstNumner = Integer.parseInt(split[0]);
    int secondNumber = Integer.parseInt(split[2]);

    switch (operator) {
      case "+":
        System.out.println(firstNumner + secondNumber);  
        break;

      case "-":
        System.out.println(firstNumner - secondNumber);
        break;

      case "*":
        System.out.println(firstNumner * secondNumber);
        break;

      case "/":
        System.out.println(firstNumner / secondNumber);
        break;

      case "%":
        System.out.println(firstNumner % secondNumber);
        break;

      default:
        System.out.println("Input salah");
        break;
    }
  }
}
