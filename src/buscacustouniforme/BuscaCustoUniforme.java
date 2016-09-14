package buscacustouniforme;

import buscacustouniforme.ArvoreBinaria;
import java.util.ArrayList;
import java.util.Collections;
public class BuscaCustoUniforme {


    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();         // Criação da Árvore
        ArrayList<Integer> listaInicial = new ArrayList();  // Criação da lista de números iniciais para colocar no tabuleiro
        Tabuleiro taba = new Tabuleiro(listaInicial);       // Criação do tabuleiro com a lista de números
        No no = new No(taba);                               // Criação do Nó com o tabuleiro para colocar na raiz
        
        // adiciona números na lista inicial
        listaInicial.add(0);
        listaInicial.add(2);
        listaInicial.add(6);
        listaInicial.add(8);
        listaInicial.add(1);
        listaInicial.add(4);
        listaInicial.add(3);
        listaInicial.add(7);
        listaInicial.add(5);
        Collections.shuffle(listaInicial);  // randomiza a lista inicial
        
        for(int i = 0; i < 9; i++){
            System.out.print(listaInicial.get(i) + " ");
        }
        
        arvore.setRaiz(no); //insere o nó contendo o tabuleiro que contém a lista de números iniciais que foi randomizada, essa é a raiz da árvore
        
        int posZero = taba.achaZero(); // verificamos em que posição está o zero para saber quais os movimentos possíveis para gerar os próximos nós
        
        
    }
    
}
