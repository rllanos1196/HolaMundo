import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args){
        System.out.println("Hola,...");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");

        String userName = myObj.nextLine();
        System.out.println("Bienvenido a ClauPT: "+ userName);
        
        System.out.println(userName + " Ud. es licenciado en ClauPT");
    }
}
