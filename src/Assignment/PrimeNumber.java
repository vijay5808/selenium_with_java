package Assignment;

public class PrimeNumber {
	public static void main(String[] args) {

		int temp =0 , counter=0;
		System.out.print("20 Prime Numbers are: ");
		for(int i=2;i<=72;i++)
		{
			for(int j=2; j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp = temp+1;
				}
			}
			if(temp==0)
			{
				System.out.print(i+"|");
			}
			else
			{
				temp=0;
			}
		}
	}

}


