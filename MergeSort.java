public class MergeSort{
	public void mergeSort(int[] a,int left,int right){
		if(left >= right)
			return;
		int middle = (left+right)/2;
		mergeSort(a,left,middle);
		mergeSort(a,middle+1,right);
		merge(a,left,middle,right);
	}

	public void merge(int[] a,int left,int middle,int right){
		int[] tmp = new int[right-left+1];
		int i=left,j=middle+1,k=0;
		while(i<=middle&&j<=right){
			if(a[i]<a[j])
				tmp[k++]=a[i++];
			else
				tmp[k++]=a[j++];
		}
		while(i<=middle){
			tmp[k++]=a[i++];
		}
		while(j<=right){
			tmp[k++]=a[j++];
		}
		for(i=left,j=0;i<=right&&j<k;i++,j++){
			a[i]=tmp[j];
		}
	}
}
