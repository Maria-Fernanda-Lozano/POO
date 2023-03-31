package Figuras;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        float base=0, altura=0;
        double radio=0;
        Scanner teclado=new Scanner(System.in);
        int Eleccion=1, i=1;

        while (i==1) {
            System.out.println("cual de estos desea mirar el area: 1=Triangulo, 2=Rectangulo, 3=Circulo");
            Eleccion=teclado.nextInt();
            switch (Eleccion) {
                case 1:
                System.out.println("Digite la base del triangulo");
                base=teclado.nextFloat();
                System.out.println("Digite la altura del triangulo");
                altura=teclado.nextFloat();
                Triangulo t=new Triangulo(base, altura);
                t.calcularArea();
                    break;
                case 2:
                System.out.println("Digite la base del rectángulo");
                base=teclado.nextFloat();
                System.out.println("Digite la altura del rectángulo");
                altura=teclado.nextFloat();
                Rectangulo r=new Rectangulo(base, altura);
                r.calcularArea();
                    break;
                case 3:
                System.out.println("Digite el radio del circulo");
                radio=teclado.nextDouble();
                Circulo c=new Circulo(radio);
                c.calcularArea();
                    break;
                default:
                System.out.println("la eleccion elegida no es valida");
                    break;
            }
            System.out.println("Quieres saber el area de otra figura?: 1=Si, 2=No");
            i=teclado.nextInt();
            if (i==0){
                System.out.println("Gracias por su partisipacion");
            }
        }
        teclado.close();
    }
}