//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Scanner scanner= new Scanner(System.in);
            System.out.print("number:");
            int number= scanner.nextInt();
            if((number%5==0)&&(number%3==0)){
                System.out.println("FizzBuzz");
            }else if(number%5==0){
                System.out.println("Fizz");
            }else if(number%3==0){
                System.out.println("Buzz");
            }else{
                System.out.println(number);
            }
    }
}