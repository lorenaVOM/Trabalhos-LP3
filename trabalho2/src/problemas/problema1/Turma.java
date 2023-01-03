package problemas.problema1;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    public HashMap<Integer, ArrayList<String>> alunos = new HashMap<Integer, ArrayList<String>>();
    public Turma() {
        String linha;
        int matrícula;
        String codDisciplina;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresse a matrícula do aluno seguido pelo código da disciplina, -1 to sair:");
        do {
            linha = teclado.nextLine();
            linha = linha.trim(); 
            if (!linha.equals("-1")) {
                String[] stringAnalisada = linha.split(" ");
                matrícula = Integer.parseInt(stringAnalisada[0]); 
                codDisciplina = stringAnalisada[1];
                if (alunos.containsKey(matrícula)) {
                        alunos.get(matrícula).add(codDisciplina);
                }
                else {
                    ArrayList<String> disciplinas = new ArrayList<>();
                    disciplinas.add(codDisciplina);
                    alunos.put(matrícula, disciplinas);
                }
            }
        } while (!linha.equals("-1"));
    }
}
