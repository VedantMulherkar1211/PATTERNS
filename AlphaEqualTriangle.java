package StarPattern.com;

public class AlphaEqualTriangle {

	public static void main(String[] args) {
		
		char ch;
		
		for(int i=65;i<71;i++)
		{
			for(int j=i;j>=65;j--)
			{
				ch=(char)j;
				System.out.print(ch);
			}
			System.out.print("\n");
		}

	}

}
