package buscacustouniforme;

import buscacustouniforme.Arvore;
import java.util.ArrayList;
import java.util.Collections;
public class BuscaCustoUniforme {


    public static void main(String[] args) {
        Arvore arvore = new Arvore();         // Criação da Árvore
        ArrayList<Integer> listaInicial = new ArrayList();  // Criação da lista de números iniciais para colocar no tabuleiro
        Tabuleiro taba = new Tabuleiro(listaInicial);       // Criação do tabuleiro com a lista de números
        No noInicial = new No(taba);                               // Criação do Nó com o tabuleiro para colocar na raiz
        
        // adiciona números na lista inicial
        listaInicial.add(0);
        listaInicial.add(1);
        listaInicial.add(2);
        listaInicial.add(3);
        listaInicial.add(4);
        listaInicial.add(5);
        listaInicial.add(6);
        listaInicial.add(7);
        listaInicial.add(8);
        Collections.shuffle(listaInicial);  // randomiza a lista inicial
        
        for(int i = 0; i < 9; i++){
            System.out.print(listaInicial.get(i) + " ");
        }
        
        taba.setValores(listaInicial); // insere listaInicial de valores gerados aleatoriamente no tabuleiro
        arvore.setRaiz(noInicial); //insere o nó contendo o tabuleiro que contém a lista de números iniciais que foi randomizada, essa é a raiz da árvore
        
        arvore.getRaiz().criaFilho();
    }
    
}
