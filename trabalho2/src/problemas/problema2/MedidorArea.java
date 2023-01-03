package problemas.problema2;

import java.awt.Rectangle;

public class MedidorArea implements Medidor {
   public double medir(Object umObjeto) {
      Rectangle umRetangulo = (Rectangle) umObjeto;
      double area = umRetangulo.getWidth() * umRetangulo.getHeight();
      return area;
   }
}

