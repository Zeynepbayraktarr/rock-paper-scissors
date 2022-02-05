/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskagitmakas;

import java.util.Scanner;

enum HandSign{PAPER, SCISSOR, ROCK}
        
class Player {
    
    String name;
    HandSign sign;
    int wins;
    static int draws;
    static int trials;

    public Player(String name) {
        this.name = name;
    }
    
    void move(){
        if (GameArena.isGameOver) return;
        boolean inputInvalid=false;
        Scanner input = new Scanner (System.in);
        
       do{
             char userChoice = input.next().charAt(0);
             inputInvalid=false;
             
         switch(userChoice){
             case 's' :
                 this.sign = HandSign.SCISSOR;
                 break;
             case 'r' : 
                 this.sign = HandSign.ROCK;
                 break;
             case 'p' :
                 this.sign = HandSign.PAPER;
                 break;
             case 'q':
                 GameArena.isGameOver=true;
                 break;
             default:
                 inputInvalid=true; 
                 break;
                 
            }        
         
         }
         while(inputInvalid);
       
        System.out.println(this.name + " " + sign);
 
}
    
}

