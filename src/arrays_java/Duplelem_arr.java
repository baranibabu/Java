package arrays_java;

public class Duplelem_arr {

	public static void main(String[] args) {
		int arr[]=new int[8];
		int arr1[]={1,2,4,5,2,5,7,8};
		System.out.println("Duplicate elements are");
		for(int i=0;i<arr1.length;i++){
			for(int j=i+1;j<arr1.length;j++){
				if (arr1[i]==arr1[j]) {
					System.out.println(arr1[j]);
					
				}
			}
			// TODO Auto-generated method stub
		}

	}

}
