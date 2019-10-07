package Exercicio2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<Contato>();
    }
    
    public void adicionar_contato(Contato contato) {
        contatos.add(contato);
    }
    
    public void exibir_contatos() {
        for(Contato c: contatos) {
            System.out.println(c);
        }
    }
    
    public void remover_contato(String cpf_cnpj) {
        int indice = -1;
        
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i) instanceof PessoaFisica) {
                PessoaFisica pessoa = (PessoaFisica) contatos.get(i);
                if (pessoa.getCpf().equals(cpf_cnpj)) {
                    indice = i;
                }
            } else {
                PessoaJuridica pessoa = (PessoaJuridica) contatos.get(i);
                if (pessoa.getCnpj().equals(cpf_cnpj)) {
                    indice = i;
                }
            }
        }
        
        if (indice == -1) {
            System.out.println("Nao existe um contato com o CPF ou CNPJ " + cpf_cnpj);
        } else {
            contatos.remove(indice);
        }
    }
}
