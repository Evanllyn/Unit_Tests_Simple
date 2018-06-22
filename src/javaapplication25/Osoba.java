/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

public class Osoba {
    int ile;
    int suma;
    public static void main(String[] args){
        Osoba os1 = new Osoba();
        Osoba os2 = new Osoba();
        int[] tab = new int[3];
        tab[0] = 18;
        tab[1] = 30;
        tab[2] = 18;
        
        System.out.println(os1.czyPelnoletni(18));
        System.out.println(os1.czyPelnoletni(5));
        System.out.println(os1.czyPelnoletni(130));
        
        System.out.println(os2.zwrocSredniaWieku(tab));
        
  }
     public boolean czyPelnoletni(int wiek){
        if(wiek < 5 || wiek > 130)
            throw new IllegalArgumentException("Podana wartość musi znajdować się w przedziale od 5 do 130.");
        else if(wiek >= 18){
                    return true;
                }else{
                    return false;
                }
        }  
    
    
    public int zwrocSredniaWieku(int[] tab){
    
        Osoba osoby = new Osoba();
    if(tab == null)
        throw new IllegalArgumentException("Nie ma tablicy");
    if(tab.length == 0)
        throw new IllegalArgumentException("tablica jest pusta");
    
    for(int i = 0; i<tab.length; i++){
        if(osoby.czyPelnoletni(tab[i]) == true){
            suma = suma + tab[i];
            ile++;
        }else{
            
        }
    }
    return suma/ile;
    
    }
    
}

