package Oops;

public class multiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Single Dimension Array
		
		int a[] = {10, 34, 56, 87, 90, 101};
		System.out.println("Elements of array a:");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//Multi-dimentional Arrays
		
		int [][] b = {
				{2,4,6,8},
				{3,6,9}
					 };
		System.out.println("\nLength of array b row 1: "+b[0].length);
		System.out.println("Length of array b row 2: "+b[1].length);
		
		System.out.println("\nElements of array b rows:");
		for (int i=0;i<b[0].length;i++) {
			System.out.print(b[0][i]+" ");
			}
		System.out.println("\n");
		for (int j=0;j<b[1].length;j++) {
			System.out.print(b[1][j]+" ");
		}
		

	}

}
