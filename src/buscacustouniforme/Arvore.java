package buscacustouniforme;

import java.util.ArrayList;

public class Arvore {
    private No raiz;            // raiz é o primeiro nó da árvore, o que é gerado aleatoriamente
    private ArrayList<No> nos;  // Esse array vai armazenar todos os nós da árvore
    
    public Arvore() {
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public ArrayList<No> getNos() {
        return nos;
    }

    public void setNos(ArrayList<No> nos) {
        this.nos = nos;
    }
}