import java.util.Scanner;
public class esPrimo {
    public static void main(String[] args)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int contador=0,i,numero;
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
        for(i = 1; i <= numero; i++)
        {
            if((numero % i) == 0)
            {
                contador++;
            }
        }
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }

    }
}
