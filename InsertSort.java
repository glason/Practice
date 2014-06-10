public class InsertSort{
	public void insertSort(int[] a){
		int i,j,tmp;
		for(i=1;i<a.length;i++){
			tmp=a[i];
			for(j=i-1;j>=0&&a[j]>tmp;j--){
				a[j+1]=a[j];
			}
			a[j+1]=tmp;
		}
	}
}
