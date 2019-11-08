package serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManipuladorArquivoBinario {
    public static void gravacaoBinario(DiarioClasse diario, String nomeArquivo) {
        try (ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            arquivo.writeObject(diario);
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo " + nomeArquivo);
        }
    }
    
    public static DiarioClasse leituraBinario(String nomeArquivo) {
        DiarioClasse diario = null;
        try {
            ObjectInputStream arquivo = new ObjectInputStream(new FileInputStream(nomeArquivo));
            diario = (DiarioClasse)arquivo.readObject();
            arquivo.close();
        } catch (Exception e) {
            System.out.println("Falha na leitura do arquivo " + nomeArquivo);
        }
        return diario;
    }
}
