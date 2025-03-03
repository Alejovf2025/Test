import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner teclado = new Scanner(System.in);
        int n1,n2;
        double raiz1,raiz2;

        do{
        System.out.println("Ingrese el primer  valor: " );
        n1 = teclado.nextInt();
        }while(n1<=0);

        do{

        System.out.println("Ingrese el segundo valor: ");
        n2 = teclado.nextInt();
        }while(n2<=0);


        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);

        System.out.println("La raiz de " + n1 + "es: " +raiz1);
        System.out.println("La raiz de " + n2 +  "es: " +raiz2);
*/



        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("1)Calcular tagente \n" +
                "2)Calcular raiz \n" +
                "3)calcular seno \n" +
                "4)Calcular coseno \n" +
                "5)calcular log \n " +
                "Digite su opcion :  ");
        opcion = teclado.nextInt();

        switch(opcion){
            case 1 -> {
                Scanner t = new Scanner(System.in);
                double valor;
                System.out.println("Ingrese el valor a operar : ");
                valor = t.nextDouble();
                double x = Math.tan(valor);
                System.out.println("La tagente de " + valor + " es: " + x);
            }
            case 2 -> {
                Scanner t = new Scanner(System.in);
                double valor;
                System.out.println("Ingrese el valor a operar : ");
                valor = t.nextDouble();
                double z = Math.sqrt(valor);
                System.out.println("La raiz de " + valor + " es: " + z);

            }
            case 3 -> {
                Scanner t = new Scanner(System.in);
                double valor;
                System.out.println("Ingrese el valor a operar : ");
                valor = t.nextDouble();
                double y = Math.sin(valor);
                System.out.println("El seno de " + valor + " es: " + y);

            }

            case 4 -> {
                Scanner t = new Scanner(System.in);
                double valor;
                System.out.println("Ingrese el valor a operar : ");
                valor = t.nextDouble();
                double p = Math.cos(valor);
                System.out.println("El coseno de " + valor + " es: " + p);

            }

            case 5 ->{
                Scanner t = new Scanner(System.in);
                double valor;
                System.out.println("Ingrese el valor a operar : ");
                valor = t.nextDouble();
                double j = Math.log(valor);
                System.out.println("El log de " + valor + " es: " + j);
                System.out.println("Cambios");


            }





        }


    }
}