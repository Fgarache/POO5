import java.util.Scanner;

public class operation {
   static int suma, resta, mult, div, number1, number2;

    public void insert_number (){
        Scanner insert = new Scanner(System.in);
        System.out.println("Insert Number one: ");
        number1 = insert.nextInt();
        System.out.println("Insert number two: ");
        number2 = insert.nextInt();

    }

    public int sumar (int a, int b) {
        b = number1;
        a = number2;
       suma  = a + b;
        return suma;

    }
    public int restar (int a1, int b2) {
        a1 = number1;
        b2 = number2;
        resta = a1 - b2;
        return resta;
    }

    public int multiplicar (int a, int b) {
        a = number1;
        b = number2;
        mult = a * b;
        return mult;
    }

    public int dividir (int a, int b) {
        a = number1;
        b = number2;
        div = a / b;
        return div;
    }


}
