public class BubbleSort{
	public void bubbleSort(int[] a){
		for(int i=0;i<a.length;i++){
			boolean exchange = false;
			for(int j=a.length-1;j>i;j--){
				if(a[j]<a[j-1]){
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
				exchange = true;
			}
			if(!exchange)
				break;
		}
	}
}
