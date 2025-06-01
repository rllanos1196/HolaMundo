import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args){
        Scanner large = new Scanner(System.in);
        System.out.print("Ingrese el valor del largo: ");
        int largo = large.nextInt();

        System.out.print("Ingrese el valor del ancho: ");
        int ancho = large.nextInt();

        System.out.print("Ingrese el valor del alto: ");
        int alto = large.nextInt();

        int vol = largo * ancho * alto;
        System.out.print("El volumen del prisma rectangular es: "+vol+" unidades cúbicas");
    }
}
