package calculos_cuadrado;

import java.util.Scanner;

/**
 *
 * @author valcar
 */
public class Cubo extends Cuadrado
{

    public static void main(String[] args)
    {
        Cuadrado cuadrado = new Cuadrado();

        Scanner entrada = new Scanner(System.in);
        String lado = "", opcion = "";
        int ladoConvertido = 0, opcionConvertida = 0;
        boolean nuevoDato = true;

        while (nuevoDato)
        {
            System.out.println("Ingrese un numero correspondiente a un LADO:");
            lado = entrada.next();
            ladoConvertido = Integer.parseInt(lado);

            System.out.println("Que calculo desea realizar?\n");
            
            mostrarMenu();

            System.out.println("Ingrese la opción deseada");
            opcion = entrada.next();
            opcionConvertida = Integer.parseInt(opcion);

            switch (opcion)
            {
                case "1":
                    System.out.println("El volumen del cubo con el numero "+ladoConvertido+" es: " +calcularVolumen(ladoConvertido));
                    System.out.println("\n");
                    break;
                case "2":
                    System.out.println("El perimetro del cubo con el numero "+ladoConvertido+" es: "+calcularPerimetro(ladoConvertido));
                    System.out.println("\n");
                    break;
                case "3":
                    System.out.println("El Area del cuadrado con el numero "+ladoConvertido+" es: " +cuadrado.calcularArea(ladoConvertido));
                    System.out.println("\n");
                    break;
                case "4":
                    System.out.println("El Perimetro del cuadrado con el numero "+ladoConvertido+" es " +cuadrado.calcularPerimetro(ladoConvertido));
                    System.out.println("\n");
                    break;
                case "5":
                    break;
                case "0":
                    nuevoDato = false;
                    break;
            }

        }

    }

    public static int calcularVolumen(int lado)
    {
        int volumen = lado * 3;
        return volumen;
    }

    public static int calcularPerimetro(int lado)
    {
        int area = lado * 2;
        int perimetro = 4 * area;
        return perimetro;
    }

    public static void mostrarMenu()
    {
        System.out.println("1 - Para Volumen (Cubo)");
        System.out.println("2 - Para Perimetro (Cubo)");
        System.out.println("3 - Para Area (Cuadrado)");
        System.out.println("4 - Para Perimetro (Cuadrado)");
        System.out.println("5 - Para NUEVO DATO");
        System.out.println("0 - Para SALIR \n");
        
    }

}
