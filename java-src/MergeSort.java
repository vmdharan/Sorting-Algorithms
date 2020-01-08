public class MergeSort
{
    public MergeSort(int[] data)
    {
        sort(data, 0, data.length);
    }

    public int[] sort(int[] A, int i, int j)
    {
        if ((j-i) > 1)
        {
            int mid = (int) Math.floor((j-i)/2.0);
            int[] B = sort(A, 0, mid-1);
            int[] C = sort(B, mid, j);
            merge(B, C, A);
        }

        return A;
    }

    public void merge(int[] B, int[] C, int[] A)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < B.length && j < C.length)
        {
            if(B[i] < C[j])
            {
                A[k] = B[i];
                i++;
            }
            else 
            {
                A[k] = C[j];
                j++;
            }
            k++;
        }

        // Pad with B
        if(i < B.length)
        {
            for(int p=i; p<B.length; p++)
            {
                A[k] = B[p];
                k++;
                p++;
            }
        }
        // Pad with A
        else
        {
            for(int q=j; q<C.length; q++)
            {
                A[k] = C[q];
                k++;
                q++;
            }
        }
    }
}