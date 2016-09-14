package buscacustouniforme;

import java.util.ArrayList;

public class Tabuleiro {

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
    
    public int movimenta(int pos){
        
    }
    
    public int baixo(int pos){
        int posi = pos;
        
        if(posi == 0 || posi == 1 || posi == 2 || posi == 3 || posi == 4 || posi == 5){
            posi = posi + 3;
        }
        return posi;
    }
    
    public int cima(int pos){
        int posi = pos;
        
        if(posi == 3 || posi == 4 || posi == 5 || posi == 6 || posi == 7 || posi == 8){
            posi = posi - 3;
        }
        return posi;
    }
    
    public int esquerda(int pos){
        int posi = pos;
        
        if(posi == 1 || posi == 2 || posi == 4 || posi == 5 || posi == 7 || posi == 8)
            posi = posi - 1;
        return posi;
    }
    
    public int direita(int pos){
        int posi = pos;
        
        if(posi == 0 || posi == 1 || posi == 3 || posi == 4 || posi == 6 || posi == 7)
            posi = posi + 1;
        return posi;
    }
}
