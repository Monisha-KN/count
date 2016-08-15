import java.util.*;

class count
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=s.nextInt();
		int i=0;
		int cnt=0;
		
		while(n>0)
		{
			i=n%10;
			cnt++;
			n=n/10;
		}
		System.out.println(cnt);
		
		
	}

}