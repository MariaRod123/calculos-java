import java.util.Scanner;
public class AreasPerimetros {
    public static void main(String[] args) {

            float l, a, h, b, ld, lt1, lt2, lt3, pcuad, prect, ptri, acuad, arect, atri;
            double r, pcir, acir;
            int opcion;

        System.out.println("Seleccione que desea calcular:\n 1.Perímetro y área del cuadrado\n 2.Perímetro y área del rectángulo\n 3.Perímetro y área del triángulo\n 4.Perímetro y área de la circunferencia");
            Scanner opcion_elegida = new Scanner(System.in);
            opcion=opcion_elegida.nextInt();

        switch(opcion)

            {
                case 1:
                    System.out.println("Perímetro y área del cuadrado");
                    System.out.println("Ingrese la medida del lado");
                    Scanner lado = new Scanner(System.in);
                    ld = lado.nextFloat();
                    pcuad = ld * 4;
                    acuad= (float) Math.pow(ld,2);
                    System.out.println("El perímetro del cuadrado es:" + pcuad + "cm");
                    System.out.println("El área del cuadrado es:" +acuad + "cm^2");
                    break;
                case 2:
                    System.out.println("Perímetro y área del rectángulo");
                    System.out.println("Ingrese la medida del largo ");
                    System.out.println("Ingrese la medida del ancho ");
                    Scanner largo = new Scanner(System.in);
                    l = largo.nextFloat();
                    Scanner ancho = new Scanner(System.in);
                    a = ancho.nextFloat();
                    prect = (l + a) * 2;
                    arect= l * a;
                    System.out.println("El perímetro del rectángulo es:" + prect + "cm");
                    System.out.println("El área del rectángulo es:" + arect + "cm^2");
                    break;

                case 3:
                    System.out.println("Perímetro y área del triángulo");
                    System.out.println("Ingrese la medida del lado 1 ");
                    System.out.println("Ingrese la medida del lado 2");
                    System.out.println("Ingrese la medida del lado 3");

                    Scanner lado1 = new Scanner(System.in);
                    lt1 = lado1.nextFloat();
                    Scanner lado2 = new Scanner(System.in);
                    lt2 = lado2.nextFloat();
                    Scanner lado3 = new Scanner(System.in);
                    lt3 = lado3.nextFloat();
                    ptri = lt1 + lt2 + lt3;
                    System.out.println("El perímetro del triángulo es:" + ptri + "cm");

                    System.out.println("Ingrese la medida de la altura");
                    System.out.println("Ingrese la medida de la base del triángulo (lado más largo)");
                    Scanner base= new Scanner(System.in);
                    b=base.nextFloat();
                    Scanner altura= new Scanner(System.in);
                    h=altura.nextFloat();
                    atri= (b * h)/2;

                    System.out.println("El área del triángulo es:" + atri + "cm^2");

                    break;
                case 4:
                    System.out.println("Perímetro y área de la circunferencia");
                    System.out.println("Ingrese la medida del radio");
                    Scanner radio = new Scanner(System.in);
                    r = radio.nextDouble();
                    pcir = (2 * r * Math.PI);
                    acir= Math.pow(r,2);
                    System.out.println("El perímetro de la circunferencia es:" + pcir + "cm");
                    System.out.println("El área de la circunferencia es:" + acir + "cm^2");
                    break;

                default:
                    System.out.println("No existe la opción ingresada");
            }


        }
    }











