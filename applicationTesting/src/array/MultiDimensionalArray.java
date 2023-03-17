package array;
public class MultiDimensionalArray {
	public static void main(String[] args) {
int array2[][]=new int [2][3];
		
		array2[0][0]=123;
		array2[0][1]=2;
    	array2[1][0]=33;
    	array2[1][1]=4243;
    	array2[1][2]=100;
	for (int i=0;i<=1;i++)
		{for (int j=0;j<=2;j++)
		{
			System.out.println(array2[i][j]);
			
		}
		
	}

	
}


}