package problemas.problema2;

import java.awt.Rectangle;

public class MedidorAreaTeste {
    public static void main(String[] args) {
        Medidor medidorArea = new MedidorArea();

        Rectangle[] retangulos = new Rectangle[] {
              new Rectangle(5, 10, 20, 30),
              new Rectangle(10, 20, 30, 40),
              new Rectangle(20, 30, 5, 15)
           };

        double areaMedia = Entidade.calcularMedia(retangulos, medidorArea);
        System.out.printf("Média das áreas = %.2f", areaMedia);
        System.out.println();
        System.out.println();
   }
}

