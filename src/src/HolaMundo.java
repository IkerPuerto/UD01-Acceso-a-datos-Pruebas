package src;

import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        notaMedia(teclado);
    }
    public static void notaMedia(Scanner leerTeclado)  {
        double suma = 0;
        System.out.println("Introduce el numero de notas que quieres meter:");
        double numeroNotas = leerTeclado.nextDouble();
        for (int i =1; i <= numeroNotas; i++) {
            System.out.println("Introduce la nota " +i +" :");
            double nota = leerTeclado.nextDouble();
            suma = suma + nota;
        }
        System.out.println("La nota media es:");
        System.out.println(suma/numeroNotas);
    }
}
