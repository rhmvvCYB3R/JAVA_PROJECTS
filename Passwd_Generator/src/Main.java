import java.util.Scanner;
import java.util.Random;
class PasswdGen{
    private String charPool;
    public PasswdGen(String firstName,String lastName, String nums){
        charPool = firstName+lastName+nums;
        if (charPool.isEmpty()){
            charPool = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789";
        }
    }
    public String generator(int length){
        StringBuilder passwd = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i< length; i++){
            int index = rand.nextInt(charPool.length());
            passwd.append(charPool.charAt(index));

        }
        return passwd.toString();
    }
}

public class Main{


    // generation method
    static void generator(){
    Scanner scan = new Scanner(System.in);
    System.out.println("\nYou choose generating password!\n");
    System.out.print("Enter First Name: ");
    String firstName = scan.nextLine();

    System.out.print("Enter Last Name: ");
    String lastName = scan.nextLine();

    System.out.print("Enter some numbers without spaces: ");
    String nums = scan.nextLine();

    System.out.println("Enter length of password(mb 8 or 16): ");
    int length = scan.nextInt();

    PasswdGen passwordGen = new PasswdGen(firstName,lastName,nums);
    String passwd = passwordGen.generator(length);

    System.out.println("Generated password -- "+ passwd);
    while(true) {
        System.out.println("\n[1] - Go to menu      [2] - Exit");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 -> {
                return;
            }
            case 2 -> {
                System.out.println("BYE");
                System.exit(0);
            }
        }
    }
    }




    static void info(){
        // just some info method
        Scanner scan = new Scanner(System.in);
        System.out.println("""
 Why use this program?
                                                                     ／ﾌﾌ 　　　　　　 　ム｀ヽ
   - Create unique passwords using your name, surname, and numbers / ノ)  ）　ヽ
   - Choose any password length                                   / ｜　 ( ͡° ͜ʖ ͡°）ノ⌒（ゝ._,ノ
   - Fast, simple, and safe (local generation only)               /　ﾉ⌒7⌒ヽーく　 ＼　／
   ©️ rhmvvCYBER. All rights reserved.                             丶＿ ノ ｡　 ノ､　｡|/
                                                　　                   `ヽ `ー-'_人`ーﾉ
                                                　　　                    丶 ￣ _人'彡                       
                """);
        while(true) {
            System.out.println("\n[1] - Go to menu      [2] - Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    return;
                }
                case 2 -> {
                    System.out.println("BYE");
                    System.exit(0);
                }
            }
        }
    }




    //_________________MAIN MENU
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        while(true){
        try{
        System.out.println("""
                
                █▀█ ▄▀█ █▀ █▀ █ █ █ █▀▄ \s
                █▀▀ █▀█ ▄█ ▄█ ▀▄▀▄▀ █▄▀ \s                                                           
    ──▒▒▒▒▒────▒▒▒▒▒────▒▒▒▒▒────▄████▄─────        (̲c̲r̲e̲a̲t̲e̲d̲ b̲y̲ r̲h̲m̲v̲v̲C̲Y̲B̲3̲R̲)̲
    ─▒▄─▒▄─▒──▒▄─▒▄─▒──▒▄─▒▄─▒──███▄█▀─────── █▀▀ █▀▀ █▄░█ █▀▀ █▀█ ▄▀█ ▀█▀ █▀█ █▀█
    ─▒▒▒▒▒▒▒──▒▒▒▒▒▒▒──▒▒▒▒▒▒▒─▐████───────── █▄█ ██▄ █░▀█ ██▄ █▀▄ █▀█ ░█░ █▄█ █▀▄
    ─▒▒▒▒▒▒▒──▒▒▒▒▒▒▒──▒▒▒▒▒▒▒──█████▄───────
    ─▒─▒─▒─▒──▒─▒─▒─▒──▒─▒─▒─▒───▀████▀─────                                     
               
              
     [1] - Generate Password                        [2] - Why i should use this programm?
     
                                [0] - EXIT!
               
                """);


        System.out.print("Choose option: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 -> generator();
            case 2 -> info();
            case 0 ->{System.out.println("BYE!");
                return;
            }
            default -> System.out.println("Invalid choice!");

        }

        }
        catch(Exception e){
        System.out.println("Invalid choice!");
        scan.nextLine();
        }
        }
        }

    }
