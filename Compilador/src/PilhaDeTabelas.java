/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import java.util.List;

public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }
    public String getTipoSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return ts.getTipo(nome);
            }
        }
        return null;
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
        Saida.println(ret.toString());
    }

    public List getTodasTabelas() {
        return pilha;
    }
}
