package problemas.problema1;

public class turmaTeste {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        System.out.println();
        for (Integer key : turma1.alunos.keySet()) {
            System.out.println("Disciplinas do aluno de matrícula " + key + ":");
            for (String cls : turma1.alunos.get(key)) {
                    System.out.print(cls + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
