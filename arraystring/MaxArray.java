package arrays_strings;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20, 5, 30, 15};
		int max = arr[0]; // assume the ist element is
for (int i=1; i< arr.length; i++) {

		if (arr[i] > max) {

		max =arr[i]; // update the max
		}}
System.out.println( "Max value is:"+max);

}}
