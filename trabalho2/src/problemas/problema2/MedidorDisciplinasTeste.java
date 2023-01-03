package problemas.problema2;

import java.util.ArrayList;
import problemas.problema1.Turma;

public class MedidorDisciplinasTeste {
    public static void main(String[] args) {
        Medidor medidorDisciplinas = new MedidorDisciplinas();
        Turma turma1 = new Turma();
        ArrayList<String>[] alunos = new ArrayList[turma1.alunos.size()]; 
        int i = 0;
        for (Integer key : turma1.alunos.keySet()) {
            ArrayList <String> disciplinas = new ArrayList<>(); 
            for (String cls : turma1.alunos.get(key)) {
                disciplinas.add(cls);
            }
            alunos[i] = (disciplinas);
            i++;  
        }
        double disciplinasMedia = Entidade.calcularMedia(alunos, medidorDisciplinas);
        System.out.printf("Média da quantia de disciplinas = %.2f", disciplinasMedia);
        System.out.println();
        System.out.println();
    }
}

