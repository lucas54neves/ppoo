package serializacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiarioClasse implements Serializable {
    private List<Aluno> alunos;

    public DiarioClasse() {
        alunos = new ArrayList<>();
    }
    
    public void inserirAluno(String matricula, String nome, int nota) {
        alunos.add(new Aluno(matricula, nome, nota));
    }
    
    public void gerarRelatorio() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
    public void gravacaoTexto(String nomeArquivo) {
        try (FileWriter arquivo = new FileWriter(nomeArquivo)) {
            Collections.sort(alunos);
            for (Aluno aluno : alunos) {
                arquivo.write(aluno.getMatricula() + "," + aluno.getNome() + "," + aluno.getNota() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Falha na gravação no arquivo " + nomeArquivo);
        }
    }
    
    public void leituraTexto(String nomeArquivo) {
        try {
            BufferedReader arquivo = new BufferedReader(new FileReader(nomeArquivo));
            String linha = arquivo.readLine();
            
            while (linha != null) {
                String[] campos = linha.split(",");
                
                inserirAluno(campos[0], campos[1], Integer.parseInt(campos[2]));
                
                linha = arquivo.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Falha na abertura do arquivo " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Falha na leitura do arquivo " + nomeArquivo);
        }
    }
}
