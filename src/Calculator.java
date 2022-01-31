import java.util.Scanner;

public class Calculator {
    public Calculator () {

        int num1, num2;
        operation op = new operation();
        Scanner menucalc = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("==    Calculator   ==");
        System.out.println("=====================");
        System.out.println("option 1: Sum");
        System.out.println("option 2: Subtraction");
        System.out.println("option 3: Multiplication");
        System.out.println("option 4: Division");
        System.out.println("option 5: Volver");
        int menu2 = menucalc.nextInt();
        //asignar variables de la clase operation
        num1 = op.number1;
        num2 = op.number2;
        switch (menu2){
            //sumar
            case 1: op.insert_number();
                     int sumar = op.sumar(num1, num2);
                System.out.println("Sum: "+sumar);
                System.out.println("");
                System.out.println("otra opcion");
                Menu1 start = new Menu1();
                break;

            case 2: op.insert_number();
            //restar
                    int resta = op.restar(num1, num2);
                System.out.println("Rest: " + resta);
                System.out.println("");
                System.out.println("otra opcion");
                Menu1 start2 = new Menu1();

                break;

            case 3: op.insert_number();
            int multiplica = op.multiplicar(num1, num2);
                System.out.println("Mult: "+multiplica);
                System.out.println("");
                System.out.println("otra opcion");
                Menu1 start3 = new Menu1();
                break;

            case 4: op.insert_number();
            int division = op.dividir(num1, num2);
                System.out.println("Division: " + division);
                System.out.println("");
                System.out.println("otra opcion");
                Menu1 start4 = new Menu1();
                break;

            case 5: Menu1 start5 = new Menu1();

        }



    }



}
