package src;

import java.io.File;
import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
        System.out.println("Clase file");
        File prueba = new File("//src/txt/prueba");
        if (prueba.exists()) {
        	System.out.println("Existe");
        } else {
        	System.out.println("No tienes ni idea");
        }
    }
}

