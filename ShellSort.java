public class ShellSort{
	public void shellSort(int[] a){
		int n=a.length;
		for(int gap=n/2;gap>0;gap=gap/2){
			for(int i=gap;i<n;i++){
				if(a[i]<a[i-gap]){
					int j,tmp=a[i];
					for(j=i-gap;j>=0&&a[j]>tmp;j-=gap){
						a[j+gap]=a[j];
					}
					a[j+gap]=tmp;
				}		
			}
		}
	}
}
