package ntt;
import java.util.Arrays;
import java.util.Arrays;

public class Mergearray 
{
	public static void sortedMerge (int a1[], int b2[], int result[], int nk, int mn)
	{
		int i =0,j=0 ,k=0; //concatenation of 2 arrays
		while ( i < nk)
		{
			result [k] = a1[i];
			i++;
			k++;
		}
		while (j < mn)
		{
			result[k] = b2 [j];
			j++;
			k++;
		}
		Arrays.sort(result); //sort resultant array
	
	}
public static void main(String [] args)
{
	int a1[] = { 1, 3 , 2 ,5, 4};
	int b2[] = { 11,13, 14,15,12};
	int nk = a1.length;
	int mn = b2.length;
	
	int result[] = new int [nk+mn];
	sortedMerge ( a1, b2, result, nk, mn);
	
	System.out.print(" Merged sorted array :");
	for (int i =0; i<nk+mn; i++)
	
		System.out.println("" + result[i]);
	}

}