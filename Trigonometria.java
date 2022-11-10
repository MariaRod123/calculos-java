import java.util.Scanner;

public class Trigonometria {

    public static void main(String[] args) {

        int opcion;
        double catop, hip, ang, sin, catady, cos, tan;
        System.out.println("¿Que desea calcular?:\n  1- Seno\n 2-Coseno\n 3-Tangente");
        Scanner opcion_elegida = new Scanner(System.in);
        opcion=opcion_elegida.nextInt();

        if (opcion==1) {
            System.out.println("Ingrese amplitud del ángulo");
            Scanner medida= new Scanner(System.in);
            ang=medida.nextDouble();
            System.out.println("Ingrese medida de la hipotenusa");
            hip=medida.nextDouble();

            /* cálculo del valor del seno de un ángulo*/
            sin=Math.sin(Math.toRadians(ang));
            /* calculo del valor de cateto opuesto de un triángulo rectángulo dado el ángulo y la hipotenusa*/
            catop= hip * sin;
            System.out.println("La medida del cateto opuesto es:" +catop + "cm");
            System.out.println("El seno del ángulo es:" +sin);
        }
        else if (opcion ==2) {
            System.out.println("Ingrese amplitud del ángulo");
            Scanner input= new Scanner(System.in);
            ang=input.nextDouble();
            System.out.println("Ingrese medida de la hipotenusa");
            hip=input.nextDouble();

            /* cálculo del valor del coseno de un ángulo*/
            cos=Math.cos(Math.toRadians(ang));
            /* calculo del valor de cateto adyacente de un triángulo rectángulo dado el ángulo y la hipotenusa*/
            catady= hip * cos;
            System.out.println("La medida del cateto adyacente es:" +catady + "cm");
            System.out.println("El coseno del ángulo es:" +cos);

        }
        else if (opcion==3) {
            System.out.println("Ingrese amplitud del ángulo");
            Scanner amplitud= new Scanner(System.in);
            ang=amplitud.nextDouble();

            int opcion_cateto;
            System.out.println("¿Cuál cateto va a ingresar?\n  1-Cateto Opuesto\n 2- Cateto adyacente ");
            Scanner opc_cat= new Scanner(System.in);
            opcion_cateto= opc_cat.nextInt();
            switch (opcion_cateto){
                case 1:
                    System.out.println("Ingrese medida del cateto opuesto");
                    Scanner cateop = new Scanner(System.in);
                    catop=cateop.nextDouble();

                    /* cálculo del valor de la tangente de un ángulo*/
                    tan=Math.tan(Math.toRadians(ang));
                    /* calculo del valor de cateto adyacente de un triángulo rectángulo dado el cateto opuesto y la tangente*/
                    catady= catop * tan;
                    System.out.println("La medida del cateto opuesto es:" +catady + "cm");
                    System.out.println("El seno del ángulo es:" +tan);

                case 2:
                    System.out.println("Ingrese medida del cateto adyacente");
                    Scanner cateto_ady= new Scanner(System.in);
                    catady=cateto_ady.nextDouble();

                    /* cálculo del valor de la tangente de un ángulo*/
                    tan=Math.tan(Math.toRadians(ang));
                    /* calculo del valor de cateto opuesto de un triángulo rectángulo dado el cateto adyacente y la tangente*/
                    catop= catady * tan;
                    System.out.println("La medida del cateto opuesto es:" +catop + "cm");
                    System.out.println("La tangente del ángulo es:" +tan);

                case 3:
                    System.out.println("La opción ingresada no existe");
            }

        }
        else
            System.out.println("Opción no válida");

    }

}











































