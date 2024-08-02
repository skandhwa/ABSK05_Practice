package ArrayExamples;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int[]a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=40;
		a[3]=60;
		a[4]=90;
		
		for(int i=0;i<a.length;i++)///i=0,0<5//i=1,1<5//i=2,2<5....
		{
			System.out.println(a[i]);//a[0]//a[1]//a[2]....a[4]
		}
		
		System.out.println("Printing elements through for each loop");
		
		for(int x:a)
		{
			System.out.println(x);
		}
		

	}

}
