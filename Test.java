public class Test{
	public static void main(String[] args){
		System.out.println("hello world");
		int[] a= {1,2,3,4,5,6,7};
		int result = BinarySearch(a,2);
		System.out.println(result);
	}
	
	public static int BinarySearch(int[] array, int x){
		int left=0, right=array.length-1;
		while(left<=right){
			int middle = (left+right)/2;
			if(array[middle]==x)
				return middle;
			if(array[middle]>x)
				right = middle-1;
			else
				left = middle-1;
		}
		return -1;
	}
}
