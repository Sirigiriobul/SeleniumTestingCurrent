
package array;
public class ObjectArray {
	public static void main(String[] args) {

		Object obul[][]=new Object[2][4];
		
		obul[0][0]=1;
		obul[0][1]="String";
		obul[0][2]=101.12;
		obul[0][3]=101.124232432532;
		obul[1][0]="flag";
		obul[1][1]='C';
		
	int	arrayLength=obul.length;
		System.out.println(arrayLength);
		for (int i=0;i<=1;i++)
		{for (int j=0;j<=3;j++)
		{System.out.println(obul[i][j]);
		}
	}

}
	
}

