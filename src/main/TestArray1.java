package main;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2 };

		/*
		 * for (int i = 0; i<17; i++) System.out.print(array[i] + ",");
		 * 
		 * System.out.println(" ");
		 * 
		 * for (int i = 16; i>=0; i--) System.out.print(array[i] + ",");
		 * 
		 * System.out.println(" ");
		 * 
		 * for (int i =0; i<17; i++) { if (array[i]>3) System.out.print(array[i] + ",");
		 * }
		 * 
		 * System.out.println(" ");
		 */

		/*
		for (int i = 0; i < array.length; i++) 
		{
			
			int test = array[i];
			
			if (test % 2 == 0);
			{
				System.out.print(test + ",");
			}
		}
		
		System.out.println(" ");

		*/
	
		
		int resultat = Integer.MAX_VALUE;
		
		for (int i=0; i < array.length; i++)
		{
			int test = array[i];
		
				if (test < resultat)
				{
					resultat = test;
				}
		}
		
		
		         System.out.print(resultat);
		         
		         
		         
		 		int resultata = Integer.MIN_VALUE;
				
				for (int i=0; i < array.length; i++)
				{
					int test = array[i];
				
						if (test > resultat)
						{
							resultata = test;
						}
				}
				
				
				         System.out.print(resultata);
		         
		         
		         

		}
		
		
	}


