package main;

import javax.naming.directory.SearchResult;

public class TestArray2 {

	public static void main(String[] args) {
	
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
		/*
		 int somme = 0;
	      for(int i = 0; i < array.length; i++)
	      {
	         somme += array[i];
	      }
	      float moyenne = (float) somme / array.length;
	 
	      System.out.print("\nMoyenne = "+moyenne);
	      
	      */
	      
	      
	      int valrech=15;
	      int position = existe(array, valrech);
	      if(position!=-1) 
	    	  
	    	     System.out.println(valrech+" se trouve dans la position "+position);
	}
	      
	      static int existe(int array[], int val)
	      {
	    	  for(int i = 0 ; i<array.length;i++)
	    	  {
	    	   if(val==array[i])
	    	     return i;
	    	  }
	    	  System.out.println("La valeur recherchée n'existe pas");
	    	  return -1;


	      
	   }

	}
	
	
