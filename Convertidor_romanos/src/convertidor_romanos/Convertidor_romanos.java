package convertidor_romanos;

/**
 *
 * @author valcar
 */
public class Convertidor_romanos
{

    public static void main(String[] args)
    {
        System.out.println(enteroARomano(4));
    }

    public static String enteroARomano(int n)
    {
        String romano = "";
        int repetir;
        
          String simbolos[] =
        {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
          
        int fijos[] =
        {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };
      
            
//        System.out.println("El tamaño del array fijos es: "+fijos.length);
//        System.out.println("El valor de 'n' es: "+n+"\n");
        
        for (int x = 0; x < fijos.length; x++)
        {
            //Comprobar que nos arroja un residuo o no ie - 0.1
            repetir = n / fijos[x];
            
            //System.out.println("La division entera de "+n+"/"+fijos[x]+" = "+repetir+"\n");
 
            
            for (int i = 1; i <= repetir; i++)
            {
                //Se agregan las letras conforme vamos comprobando los valores si coincide que no deja un residuo se agrega esa letra
                romano += simbolos[x];
                //System.out.println("El valor de simbolo asociado es: "+simbolos[x]+"\n");
                
            }
            
            //el valor más importante es el de fijos[x] ya que en base a el se detiene el loop o no dependiendo de si
            //encuentra un residuo o no y agrega los valores correspondientes.
            n %= fijos[x];
            
        }
        return "\nEl numero entero a romano es: "+romano;
    }
}
