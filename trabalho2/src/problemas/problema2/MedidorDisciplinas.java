package problemas.problema2;

import java.awt.Rectangle;
import java.util.ArrayList;

public class MedidorDisciplinas implements Medidor {
   public double medir(Object umObjeto) {
      ArrayList<String> umAluno = (ArrayList<String>)umObjeto;        
      double numDisciplinas = umAluno.size();
      return numDisciplinas;
   }
}

