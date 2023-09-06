/*            
 1
2 2
3 3
4 4
5 5
4 4
3 3
2 2
1

 *
 */
  package neebal_gurukul_2_1;

public class que_7 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(j==i)
				{
					System.out.print(" "+i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=2;j<=5;j++)
			{
				if(j==i)
				{
					System.out.print(" "+i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				if(j==i)
				{
					System.out.print(" "+i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=2;j<=5;j++)
			{
				if(j==i)
				{
					System.out.print(" "+i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
