import java.util.Scanner;

public class Menu1 {
    public Menu1() {
            System.out.println("=====================");
            System.out.println("== Operation basic ==");
            System.out.println("=====================");

            Scanner option = new Scanner(System.in);
            System.out.println("==Select one option==");
            System.out.println();
            System.out.println("Option 1: Calculator");
            System.out.println("Option 2: Chronometer");
            System.out.println("Option 3: Timer");
            System.out.println("Option 4: Clock");
            System.out.println("option 5: Exit");
            int menu = option.nextInt();

            switch (menu) {
                case 1:
                    Calculator calc = new Calculator();
            }

        }
    }