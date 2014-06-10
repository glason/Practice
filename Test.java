public class Test{
	public static void main(String[] args){
		System.out.println("hello world");
		int[] data = new int[]{4,8,3,7,1,5,6,2};
		//MergeSort m = new MergeSort();
		//m.mergeSort(data,0,7);
		//QuickSort q = new QuickSort();
		//q.quickSort(data,0,7);
		//BubbleSort b = new BubbleSort();
		//b.bubbleSort(data);
		//InsertSort insert = new InsertSort();
		//insert.insertSort(data);
		ShellSort shell = new ShellSort();
		shell.shellSort(data);
		for(int x:data){
			System.out.println(x);
		}
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
