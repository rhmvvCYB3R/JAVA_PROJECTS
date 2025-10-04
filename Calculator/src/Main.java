import java.util.Scanner;
class Calculator{
    public double add(double num1, double num2){
        return num1 + num2;
    }
    public double sub(double num1,double num2){
        return num1 - num2;
    }
    public double mul(double num1,double num2){
        return num1 * num2;
    }
    public double div(double num1,double num2){
        if(num2 == 0){
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return num1 / num2;
    }
    public double average(double num1,double num2){
        return (num1+num2)/2;
    }
    public double procent(double num1,double num2){
        double result = (num1 * num2) /100;
        return result;
    }
}
public class Main {
    static void Menu(){
        System.out.println("""
                █▀▀ ▄▀█ █░░ █▀▀ █░█ █░░ ▄▀█ ▀█▀ █▀█ █▀█
                █▄▄ █▀█ █▄▄ █▄▄ █▄█ █▄▄ █▀█ ░█░ █▄█ █▀▄
               _________________________________________ 
               
    [1] - Add                                            [4] - Divide
    [2] - Substr                                         [5] - Average
    [3] - Multiply                                       [6] - Procent from num
                        
                            [0] - EXIT
                                   """);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        while(true) {
            try {
                Menu();
                System.out.print("Choose option - ");
                int choice = scan.nextInt();
                if (choice == 1) {
                    System.out.println("\n\t\tYou choose add!");
                    System.out.print("Enter num1: ");
                    double num1 = scan.nextDouble();
                    System.out.print("Enter num2: ");
                    double num2 = scan.nextDouble();
                    System.out.println("Result: " + calc.add(num1, num2));

                } else if (choice == 2) {
                    System.out.println("\n\t\tYou choose subtract!");
                    System.out.print("Enter num1: ");
                    double num1 = scan.nextDouble();
                    System.out.print("Enter num2: ");
                    double num2 = scan.nextDouble();
                    System.out.println("Result: " + calc.sub(num1, num2));
                } else if (choice == 3) {
                    System.out.println("\n\t\tYou choose multiply!");
                    System.out.print("Enter num1: ");
                    double num1 = scan.nextDouble();
                    System.out.print("Enter num2: ");
                    double num2 = scan.nextDouble();
                    System.out.println("Result: " + calc.mul(num1, num2));
                } else if (choice == 4) {
                    System.out.println("\n\t\tYou choose Divide!");
                    System.out.print("Enter num1: ");
                    double num1 = scan.nextDouble();
                    System.out.print("Enter num2: ");
                    double num2 = scan.nextDouble();
                    System.out.println("Result: " + calc.div(num1, num2));
                } else if (choice == 5) {
                    System.out.println("\n\t\tYou choose Average!");
                    System.out.print("Enter num1: ");
                    double num1 = scan.nextDouble();
                    System.out.print("Enter num2: ");
                    double num2 = scan.nextDouble();
                    System.out.println("Result: " + calc.average(num1, num2));
                } else if (choice == 6) {
                    System.out.println("\n\t\tYou choose Procent from number!");
                    System.out.print("Enter num1: ");
                    double num1 = scan.nextDouble();
                    System.out.print("Enter procent: ");
                    double num2 = scan.nextDouble();
                    System.out.println("Result: " + calc.procent(num1, num2));

                } else if (choice == 0) {
                    System.out.println("\n\t\tYou choose EXIT! \nBYE!");
                    break;
                } else {
                    System.out.println("Invalid choice!");
                }
            }
            catch (Exception e ){
                System.out.println("Something went wrong! Try again! Maybe u choose incorrect option!" + e);
                scan.nextLine();
            }
        }



    }
}