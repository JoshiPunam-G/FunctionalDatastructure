
 /* 
 *  Purpose:Program to play a Cross Game or Tic­Tac­Toe Game. Player 1 is
 *  the Computer and the Player 2 is the user. Player 1 take Random Cell that is the
 *  Column and Row.
 *  the start and end clicks
 *  @version 1.0 
 *  @since   12-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;


 class TicTacToeTest
{

	public static final int X = 1,O=-1;
	public static final int EMPTY=0;
	
	public int player=X;
	public boolean isEmpty=false;
	private int[][] board=new int[3][3];
	
	
	
	public void putSign(int x, int y) 
	{
	 
		if(x<0 ||x>2 || y<0 ||y>2)
		{
			System.out.println("Invalid board position");
			return;
		}
		if(board[x][y]!=EMPTY)
		{
			System.out.println("Board Position Ocuupied");
			return;
		}
		board[x][y]=player;
		player= -player;
	}
	
	
	public boolean isWin(int player)
	{
	  return( (board[0][0]+board[0][1]+board[0][2]==player*3)||
			  (board[1][0]+board[1][1]+board[1][2]==player*3)||
			  (board[2][0]+board[2][1]+board[2][2]==player*3)||
			  (board[0][0]+board[1][0]+board[2][0]==player*3)||
			  (board[0][1]+board[1][1]+board[2][1]==player*3)||
			  (board[0][2]+board[1][2]+board[2][2]==player*3)||
			  (board[0][0]+board[1][1]+board[2][2]==player*3)||
			  (board[0][2]+board[1][1]+board[2][0]==player*3));	
		
	}
	
	
	public void displayWinner()
	{
		
		if(isWin(X))
		{
			System.out.println("\n X Win...!");
			isEmpty=false;
		}
		else if (isWin(O))
		{
			System.out.println("\n O Win...!");
			isEmpty=false;
		}
		else
		{
			if(!isEmpty)
			{
				System.out.println("it's a tie");
			}
		}
		
	}
	
	
	public String toString()
	{
		StringBuilder s=new StringBuilder();
		isEmpty=false;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				switch(board[i][j])
				{
				case X:
					s.append("X");
					break;
					
				case O:
				s.append("O");
				break;
				
				case EMPTY:
					s.append(" ");
					isEmpty=true;
					break;
					
				}
				if(j<2)
				{
					s.append("|");
				}
			}
			if(i<2)
			{
				s.append("\n----\n");
			}
		}
	
		return s.toString();
	}
	
}



public class TicTacToe {

	public static void main(String[] args) {
		TicTacToeTest t=new TicTacToeTest();
		Scanner sc=new Scanner(System.in);
		int x=0,y=0;
		do
		{
			System.out.println(t.player==t.X? "player X turn ":"player O turn");
			System.out.println("Enter x and y places:");
			x=sc.nextInt();
			y=sc.nextInt();
			
			t.putSign(x,y);
			System.out.println(t.toString());
			System.out.println("_____________________");
			t.displayWinner();
			
			
		}while(t.isEmpty);
			
		}
	}
