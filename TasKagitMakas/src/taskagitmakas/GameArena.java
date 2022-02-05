/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskagitmakas;


class GameArena {
    static boolean isGameOver;
    Player player1, player2;
    
    void addPlayers(Player p1, Player p2){
        
        this.player1 = p1;
        this.player2 = p2;
    }
    
    void startGame(){
        System.out.println("PLAY!!");
        while(!isGameOver){ 
            player1.move();
            player2.move();
            processMoves();
        }
            displayScores();
    
    }
    
    private void processMoves(){
        if (isGameOver) return;
        if (player1.sign == HandSign.PAPER && player2.sign == HandSign.ROCK) {
            player1.wins++;
            System.out.println(player1.name+ " WİNS!");
        }
        else if(player1.sign == HandSign.ROCK && player2.sign == HandSign.SCISSOR){
            player1.wins++;
            System.out.println(player1.name+ " WİNS!");
        }
        else if (player1.sign == HandSign.SCISSOR && player2.sign == HandSign.PAPER){
            player1.wins++;
            System.out.println(player1.name+ " WİNS! ");
        }
        else if(player1.sign == player2.sign){
           Player.draws++;
           System.out.println("Draw!!");
        }
        else{
             player2.wins++;
             System.out.println(player2.name+ " WİNS! ");
        }
   System.out.println(player1.name+ " " + player1.sign + "|" + player2.name +" "+player2.sign);
        Player.trials++;
        
        
    }

    private void displayScores() {
        System.out.println("------------------------------------");
        System.out.printf("%s %d %n", player1.name,player1.wins);
        System.out.printf("%s %d %n", player2.name,player2.wins);
        System.out.printf("TRIALS: %d DRAWS: %d %n", Player.trials,Player.draws);
        System.out.println("------------------------------------");
    }
}
