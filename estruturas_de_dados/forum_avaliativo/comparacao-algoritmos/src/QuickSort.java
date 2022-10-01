public class QuickSort implements AlgorithmSort{
    
    private int partition (int[] a, int start, int end)  {  
    int pivot = a[end]; // pivot element  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
        
        if (a[j] < pivot)  
        {  
            i++;   
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
    }  

    @Override
    public int[] sort(int[] a, int start, int end)  {  
        if (start < end)  
        {  
            int p = partition(a, start, end);    
            sort(a, start, p - 1);  
            sort(a, p + 1, end);  
        }  

        return a;
    }
}
