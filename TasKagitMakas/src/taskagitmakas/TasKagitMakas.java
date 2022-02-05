/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskagitmakas;



/**
 *
 * @author Zeynep
 */
public class TasKagitMakas {

   
    public static void main(String[] args) {
        Player player1 = new Player ("p1");
        Player player2 = new Player ("p2");
        
        GameArena arena = new GameArena();
        arena.addPlayers(player1, player2);
        arena.startGame();
    }
    
}
