import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija la operacion a realizar: ");
        System.out.print("Adicion =1 ; Resta = 2 ; Multiplicacion = 3 ; Division =4: ");

        int op = teclado.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        double num2 = teclado.nextInt();

        if (op ==1){
            double suma = num1 + num2;
            System.out.print("La suma de los números es: "+suma);
        } else if (op ==2) {
            double resta = num1 - num2;
            System.out.print("La resta de los números es: "+resta);
        } else if (op ==3) {
            double multi = num1 * num2;
            System.out.print("La multiplicación de los números es: "+multi);
        }else if (op == 4){
            if (num2 != 0){
                double div = num1/num2;
                System.out.print("La división de los números es: "+div);
            }else {
                System.out.print("La division entre cero no existe.");
            }
        }else{
            System.out.print("Elija una operacion correcta.");
        }
    }
}
