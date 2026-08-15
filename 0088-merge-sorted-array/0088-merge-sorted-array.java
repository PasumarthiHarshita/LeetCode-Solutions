class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int i=0,j=0,k=0;
        int res[]=new int[m+n];
		while(i<m && j<n)
		{
           if(arr1[i]<arr2[j])
		   {
               res[k]=arr1[i];
			   i++;
		   }
			else
			{
                res[k]=arr2[j];
			    j++;
			}
			k++;
		}
        while(i<m)
        {
            res[k]=arr1[i];
            i++;
            k++;

        }
        while(j<n)
        {
            res[k]=arr2[j];
            j++;
            k++;
            
        }
		for(i=0;i<m+n;i++)
        {
            arr1[i]=res[i];
        }
    }
}