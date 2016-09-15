package buscacustouniforme;

import buscacustouniforme.Tabuleiro;
import java.util.ArrayList;

public class No {           // O nó é o estado de cada tabuleiro na árvore

    private Tabuleiro tab;
    public ArrayList<No> filhos = new ArrayList<>();
    private boolean visitado;
    ArrayList<Integer> solucao = new ArrayList<>();
    private int custo;
    private No noPai;

    public No(Tabuleiro tab) {
        this.tab = tab;
    }

    public No() {
    }

    public Tabuleiro getTab() {
        return tab;
    }

    public void setTab(Tabuleiro tab) {
        this.tab = tab;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    public void preencheSolucao(){
        solucao.add(0);
        solucao.add(1);
        solucao.add(2);
        solucao.add(3);
        solucao.add(4);
        solucao.add(5);
        solucao.add(6);
        solucao.add(7);
        solucao.add(8);
    }
    
    public void criaFilho(){
        int posZero = tab.achaZero();
        
        if(posZero == 0){
            trocaValores(0, 1);
            trocaValores(0, 3);
        }
        if(posZero == 1){
            trocaValores(1, 0);
            trocaValores(1, 2);
            trocaValores(1, 4);
        }
        if(posZero == 2){
            trocaValores(2, 1);
            trocaValores(2, 5);
        }
        if(posZero == 3){
            trocaValores(3, 0);
            trocaValores(3, 4);
            trocaValores(3, 6);
        }
        if(posZero == 4){
            trocaValores(4, 1);
            trocaValores(4, 3);
            trocaValores(4, 5);
            trocaValores(4, 7);
        }
        if(posZero == 5){
            trocaValores(5, 2);
            trocaValores(5, 4);
            trocaValores(5, 8);
        }
        if(posZero == 6){
            trocaValores(6, 3);
            trocaValores(6, 7);            
        }
        if(posZero == 7){
            trocaValores(7, 4);
            trocaValores(7, 6);
            trocaValores(7, 8);
        }
        if(posZero == 8){
            trocaValores(8, 5);
            trocaValores(8, 7);
        }
    }
    
    public void trocaValores(int p1, int p2){
        Tabuleiro tabFilho = new Tabuleiro();
        No noFilho = new No();
        int num1, num2;
        ArrayList<Integer> aux;
        
        aux = tab.getValores();
        
        num1 = aux.get(p1);
        num2 = aux.get(p2);
        aux.set(p1, num2);
        aux.set(p2, num1);
        tabFilho.setValores(aux);
        
        noFilho.noPai = this;
        noFilho.setTab(tabFilho);
        
        if(noFilho.getTab().getValores() != solucao){
            filhos.add(noFilho);
        }else{
            System.out.println("YAY!");
        }
        
        System.out.println("");
        System.out.println(filhos.get(0).getTab().getValores());
    }
}
