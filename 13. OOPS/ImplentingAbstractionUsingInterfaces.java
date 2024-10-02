package com.saisree.oops;

public class ImplentingAbstractionUsingInterfaces 
{
	 public static void main(String args[])
	    {
	        Queen q = new Queen();
	        q.moves();

	    } 

	}

	interface ChessPlayer                    //Implenting Abstraction using Interfaces
	{
	    void moves();

	}

	class Queen implements ChessPlayer
	{
	    public void moves()
	    {
	        System.out.println("up, down, left, right,diagonal (in all 4 directions)");

	    }

	}

	class Rook implements ChessPlayer
	{
	    public void moves()
	    {
	        System.out.println("up, down, left, right");

	    }

	}

	class Queenn implements ChessPlayer
	{
	    public void moves()
	    {
	        System.out.println("up, down, left, right,diagonal - (by 1 step)");

	    }

	}
