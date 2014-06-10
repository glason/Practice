public class MaxSum{
	public int maxSum(int[] a){
		int n=a.length;
		int sum=a[0];
		for(int i=0;i<n;i++){
			int subsum=0;
			for(int j=i;j<n;j++){
				subsum+=a[j];
				if(subsum>sum){
					sum = subsum;
				}
			}
		}
		return sum;
	}
	
	public int maxSum2(int[] a){
		int sum=0,sub=0;
		for(int i=0;i<a.length;i++){
			if(sub>0)
				sub+=a[i];
			else
				sub=a[i];
			if(sub>sum)
				sum=sub;
		}
		return sum;
	}
	
	public static void main(String[] args){
		int[] data = new int[]{-2,11,-4,13,-5,-2};
		MaxSum m = new MaxSum();
		int max = m.maxSum2(data);
		System.out.println(max);
	}
}

					
