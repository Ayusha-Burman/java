public class DivideAndConquer {
    public static void main(String args[])
    {
        int arr[]={6,3,9,5,2,8};
        int si=0;
        int ei=arr.length-1;
        mergeSort(arr,si,ei);
        printArray(arr);
    }
    public static void mergeSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(arr,si,mid);//left
        mergeSort(arr,mid+1,ei);//right
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid, int ei)
    {
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        //comp temp to original array
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }  
        
    }
    public static void printArray(int arr[])
    {
        System.out.println("The Array after sorting is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
