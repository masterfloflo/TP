package main;

public class TestArray2 {

	public static void main(String[] args) {
	
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	// la moyenne des �l�ments du tableau
		 int somme = 0;
	      for(int i = 0; i < array.length; i++)
	      {
	         somme += array[i];
	      }
	      float moyenne = (float) somme / array.length;
	 
	      System.out.println("\nLa moyenne des �l�ments du tableau = "+moyenne);
	      
	   
	      
	      // l�index dans le tableau de l�entier 15
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
	    	  System.out.println("La valeur recherch�e n'existe pas");
	    	  return -1;

	    
	   }

	}
	
	
