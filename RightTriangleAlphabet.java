package StarPattern.com;

public class RightTriangleAlphabet 
{

	public static void main(String[] args)
	{
		char ch;
		for(int i=65;i<=70;i++)
		{
			for(int j=65;j<=i;j++)
			{
				ch=(char)j;
				System.out.print(ch);
			}
			System.out.print("\n");
		}

	}

}
