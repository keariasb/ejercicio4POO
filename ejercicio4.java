import java.util.*;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular su cuadrado y su cubo");
        System.out.println(cuadradoCubo(scanner.nextDouble()));
    }
    public static String cuadradoCubo(double x){
        return "El cuadrado del número es " + Math.pow(x,2) + " y el cubo es " + Math.pow(x,3) + "\n";
    }
}
