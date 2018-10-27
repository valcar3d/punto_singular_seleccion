package traductor_morse;

/**
 *
 * @author valcar
 */

public class Traductor_Morse
{

    public static void main(String[] args)
    {
        System.out.println("De Texto a Morse: "+letrasAMorse("Hola esta es una prueba"));
        System.out.println("De Morse a Texto: "+deMorseALetras(".... --- .-.. .-    . ... - .-    . ...    ..- -. .-    .--. .-. ..- . -... .-"));
    }

    static String[] letras =
    {
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
        "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
        "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
        "9", "0", "!", ",", "?", ".", "'"
    };
    static String[] morse =
    {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
        "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
        "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
        "-....", "--...", "---..", "----.", "-----", "-.-.--", "--..--", "..--..", ".-.-.-", ".----.",
    };

    public static String deMorseALetras(String codigoMorse)
    {
        //Se inicializa la variable build
        String build = "";
        //Se remueve el posible espacio inicial del codgo morse de entrada
        String transformar = codigoMorse.trim();
        //Se separan las palabras (importante ingresar un codigo morse con palabras separadas por 3 espacios)
        String[] palabras = transformar.split("   ");
        //Se recorre el array pal con todo el codigo morse encontrado mediante la variable palabras
        for (String pal : palabras)
        {
            for (String letra : pal.split(" "))
            {
                for (int x = 0; x < morse.length; x++)
                {
                    if (letra.equals(morse[x]))
                    {
                        build += letras[x];
                    }
                }
            }
            build += " ";
        }

        return build;
    }

    public static String letrasAMorse(String textoEntrada)
    {
        String build = "";
        //Se remueve el posible espacio inicial del texto de entrada
        String transformar = textoEntrada.trim();
        //Se separan las palabras
        String[] palabras = transformar.split(" ");
        
        //Se recorre el array de characters almacenandolo en la variable letras
        for (String pal : palabras)
        {
            for (int i = 0; i < pal.length(); i++)
            {
                for (int x = 0; x < morse.length; x++)
                {
                    //se toma parte del string mediante substring (index inicio, index final) al mismo tiempo comparando objetos
                    if (pal.substring(i, i + 1).equalsIgnoreCase(letras[x]))
                    {
                        //agregar 1 espacio necesario despues de cada letra morse
    			build += morse[x] + " ";
                    }
                    else
                    {
                    }
                }
            }
            //agregar 3 espacios necesarios despues de cada palabra
            build += "   ";
        }

        return build;
    }

}
