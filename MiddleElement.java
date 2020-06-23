package arrays;

public class MiddleElement {

	public static void main(String[] args) {
		int a[]={11,12,12,4,5,2};
		if(a.length%2==0)
		{
			System.out.println(a[a.length/2]);
			System.out.println(a[a.length/2-1]);
		}
		else
		{
			System.out.println(a[a.length/2]);
		}
	}
}
