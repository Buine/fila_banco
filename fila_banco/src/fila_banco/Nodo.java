/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila_banco;

/**
 *
 * @author Jrozo
 */
public class Nodo {
    private char tipo;
    private int dato;
    private Nodo sig;

    public Nodo(char t, int d) {
        this.tipo = t;
        this.dato = d;
        this.sig = null;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
}
