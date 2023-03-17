package array;

public class PrimeNumbers {
public static void main(String[] args) {
	
	int n=100;
	int factors=0;
	for(int i=1;i<=n;i++)
		if (n%i==0)
	{System.out.println(i);
	factors++;
     }
	
	if (factors==2)
	{System.out.println("Prime NUmber");
	}
	
	else 
	{
		System.out.println("Not a prime Number");
	}
	
}
}

