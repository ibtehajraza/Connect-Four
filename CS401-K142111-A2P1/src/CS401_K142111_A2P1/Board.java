/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS401_K142111_A2P1;

class Board{
    
    byte[][] board = new byte[4][6];
    final int r=4,c=6;
    
    public Board(){
        for(int i=0; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                board[i][j]=0;
            }
        }
    } 
    
    
    
    public boolean isLegalMove(int column){
        return board[0][column]==0;
    }
    
    //Placing a Move on the board
    public boolean placeMove(int column, int player){ 
        if(!isLegalMove(column)) {System.out.println("InValid Move!"); return false;}
        for(int i=r-1;i>=0;--i){
            if(board[i][column] == 0) {
               board[i][column] = (byte)player;
               return true;
            }
        }
        return false;
    }
    
    public void undoMove(int column){
        for(int i=0;i<r;++i){
            if(board[i][column] != 0) {
               board[i][column] = 0;
               break;
            }
        }        
    }
    
    //Printing the board
    public void displayBoard(){
        System.out.println();
        for(int i=0;i<r;++i){
            for(int j=0;j<c;++j){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

