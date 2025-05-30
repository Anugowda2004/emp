package arrays_strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5}; // creation of array
        int start = 0; 
        int end = arr.length -1; // (index 4)
while (start < end) {

		int temp = arr[start];

		arr[start] = arr[end];

		arr [end] = temp;

		start++;

		end--;

	}
System.out.println("Reversed Array : ");

for(int num: arr) {
System.out.println (num);
}}}
