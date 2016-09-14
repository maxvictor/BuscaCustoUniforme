package buscacustouniforme;

import buscacustouniforme.Tabuleiro;

public class No {           // O nó é o estado de cada tabuleiro na árvore

    private Tabuleiro tab;

    public No(Tabuleiro tab) {
        this.tab = tab;
    }

    public Tabuleiro getTab() {
        return tab;
    }

    public void setTab(Tabuleiro tab) {
        this.tab = tab;
    }
    
}
