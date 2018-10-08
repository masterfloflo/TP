package main;

public class TestArray1 {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2 };

// Ensemble des éléments du tableau grâce à une boucle		
		  for (int i = 0; i<array.length; i++) 
			  
			  System.out.print(array[i] + ",");
		  
		  System.out.println(" ");
		  
// Ensemble des éléments dans l’ordre inverse du tableau
		 for (int i = 16; i<=array.length; i--) 
			 System.out.print(array[i] + ",");
		  
		  System.out.println(" ");
		  
// boucle + un test qui n'affiche que les entiers supérieurs à 3
		  
		  for (int i =0; i<array.length; i++)
		  { 
			  if (array[i]>3) 
			System.out.print(array[i] + ",");
		  }
		  
		 System.out.println(" ");
		
	// Boucle qui n'affiche que les entiers paires
		 
		for (int i = 0; i <array.length; i++) 
		{
			
			int pair = array[i];
			
			if (pair %2 == 0);
			{pair=array[i];}
			 
				System.out.println(pair + ",");
		}
		
		System.out.println(" ");
	
		
		// Afficher le plus grand et le plus petit élément
		 int maxVal = Integer.MAX_VALUE;
	     int minVal = Integer.MIN_VALUE;
		
	
	     for(int i = 0; i < array.length; i++){
	         if(array[i] < maxVal)
	           maxVal = array[i];
	         if(array[i] > minVal)
	           minVal = array[i];
	       }
	  
	 
	       for(int i = 0; i < array.length; i++){
	           if(array[i] < maxVal)
	             maxVal = array[i];
	           if(array[i] > minVal)
	             minVal = array[i];
	         }
	    
	         System.out.print("\nValeur minimale = "+maxVal);
	         System.out.print("\nValeur maximale = "+minVal);

		         

		}
		
		
	}


