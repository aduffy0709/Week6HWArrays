
public class ArraysHW {
	
	public class ArraySum{

	     public static void main(String []args){
	        
	        int arr[] = {2,5,6,3,7,8};
	        int sum=0;
	        
	        for(int i=0;i<arr.length;i++){
	            sum += arr[i];
	        }
	        
	        System.out.println("Sum of array is: "+sum);
	        
	     }
	}
	
	
	public static int[] toPower(int size, int power) {
		int[] returnArray= new int[size]; 
		for(int i=0; i<returnArray.length; ++i) {
			returnArray[i]= (int)Math.pow(i, power); 
		}
		return returnArray; 
	}

	public static void main(String[] args) {
		int[] result = toPower(4, 2);
		for(int i=0; i<result.length; ++i) {
			System.out.println(result[i]); 
		}
		
	}
		

}


