package main;


	import java.util.Arrays;


public class TestArrayTri
{

	
	public static void main(String[] args)
	{

		int[] Pop = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		
		// Tri du tableau Pop grâce à la classe Arrays
		
		Arrays.sort(Pop);

		
for (int i = 0; i<Pop.length; i++)
	System.out.print(Pop[i] + " ");

}
}


