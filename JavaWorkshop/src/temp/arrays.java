package temp;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[3];
		arr2[0] = 101;
		arr2[1] = 102;
		arr2[2] = 103;
		
		int[][] multiDimensional = {{1,2}, {3,4}, {5,6}};
		
		
		// 1D addition
		int sum = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum+=arr1[i];
		}
		System.out.println("Addition of arr1[1,2,3] : "+sum);
		System.out.println();
		
		// 2D Addition 
		int[] sum2 = new int[3];
		for(int i=0; i<arr1.length; i++){
			sum2[i]=arr1[i] + arr2[i];
		}
		System.out.print("Addition of arr1[1,2,3] & arr2[101,102,103] : [  ");
		for(int i=0; i<arr1.length; i++){
			System.out.print(sum2[i]+"  ");
		}
		System.out.println("]\n");
		
		
		// factorial
		int fact=1;
		System.out.print("Factorial of arr1[1,2,3] : [ ");
		for(int i=0; i<arr1.length; i++) {
			for(int j=arr1[i]; j>1; j--) {
				fact*=j;
			}
			System.out.print(fact+ "  ");
		}
		System.out.println("]\n");
		
		
		// printing 2d Array
		System.out.println("Multi:");
		
		for(int i=0; i<3; i++) {
			System.out.print("[   ");
			for(int j=0; j<2; j++) {
				System.out.print(multiDimensional[i][j]+ "   ");
			}
			System.out.print("]\n");
		}
	}

}
