/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS401_K142111_A2P1;

/**
 *
 * @author ibtehaj
 */
public class CS401_K142111_A2P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board b=new Board();
        Connect4AI ai = new Connect4AI(b);  
        ai.playAgainstAIConsole();
        
    }
}
