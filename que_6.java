/*
 * 
A
C B
E D C
G F E D
I H G F E 
G F E D
E D C
C B 
A
 */
package neebal_gurukul_2_1;

public class que_6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i*2-1;j>=i;j--)
			{
				System.out.print(" "+(char)(j+64));
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=i*2-1;j>=i;j--)
			{
				System.out.print(" "+(char)(j+64));
			}
			System.out.println();
		}
		
	}

}
