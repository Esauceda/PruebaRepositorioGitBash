package hn.edu.ujcv.pii.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        String nombreAlumno;
        int nota1, nota2, nota3;
        double promedio;
        System.out.println("Ingrese el nombre del Alumno: ");
        nombreAlumno = teclado.next();
        System.out.println("Ingrese la nota 1: ");
        nota1 = teclado.nextInt();
        System.out.println("Ingrese la nota 2: ");
        nota2 = teclado.nextInt();
        System.out.println("Ingrese la nota 3: ");
        nota3 = teclado.nextInt();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El Alumno " + nombreAlumno + "tiene un promedio de: " + promedio);
        //Y && Cuando las dos condiciones se cumplan
        //O || Cuando una de las condiciones se cumpla

        if((promedio>=0) && (promedio<=64))
        {
            System.out.println("El alumno reprobo");
        }
        else if ((promedio>=65) && (promedio<=75))
        {
            System.out.println("El alumno es bueno");
        }
        else if ((promedio>=76) && (promedio<=85))
        {
            System.out.println("El alumno es muy bueno");
        }
        else if ((promedio>=86) && (promedio<=95))
        {
            System.out.println("El alumno es sobresaliente");
        }
        else if ((promedio>=96) && (promedio<=100))
        {
            System.out.println("El alumno es excelente");
        }
        else
        {
            System.out.println("El promedio es incorrecto");
        }
    }
}
