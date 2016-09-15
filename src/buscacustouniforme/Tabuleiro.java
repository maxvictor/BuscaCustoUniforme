package buscacustouniforme;

import java.util.ArrayList;

public class Tabuleiro {    // É o tabuleiro com a listagem dos valores

    ArrayList<Integer> valores;

    public Tabuleiro() {
    }

    public Tabuleiro(ArrayList<Integer> valores) {
        this.valores = valores;
    }

    public ArrayList<Integer> getValores() {
        return valores;
    }

    public void setValores(ArrayList<Integer> valores) {
        this.valores = valores;
    }
    
    public int achaZero(){
        int aux = 0;
        for(int i = 0; i < 9; i++){
            if(valores.get(i) == 0){
                aux = i;
            }
        }
        return aux;
    }
    
    public void trocaValores(int pos){
        int aux = pos;
        
        // todos os movimentos serão colocados aqui
        
    }
    
}
