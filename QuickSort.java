public class QuickSort{
	public void quickSort(int[] a,int left,int right){
		if(left < right){
			int i = partition(a,left,right);
			quickSort(a,left,i-1);
			quickSort(a,i+1,right);
		}
	}

	private int partition(int[] a,int left,int right){
		int x = a[left], i=left, j=right;
		while(i<j){
			while(i<j&&a[j]>=x)
				j--;
			a[i]=a[j];
			while(i<j&&a[i]<=x)
				i++;
			a[j]=a[i];
		}
		a[i]=x;
		return i;
	}
}		
