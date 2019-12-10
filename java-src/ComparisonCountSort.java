// Comparison Count sort algorithm
public class ComparisonCountSort
{
    private int[] A;
    private int[] Count;
    private int[] S;
    
    // Constructor
    public ComparisonCountSort(int[] data)
    {
        A = data;

        Count = new int[data.length];
        S = new int[data.length];

        for(int i=0; i<data.length; i++)
        {
            Count[i] = 0;
            S[i] = 0;
        }
    }
    
    public int[] sort()
    {
        int n = A.length;
        int i, j;
        
        for(i=0; i<n-1; i++)
        {
            int k = i + 1;

            for(j=k; j<n; j++)
            {
                if(A[i] < A[j])
                {
                    Count[j] = Count[j] + 1;
                }
                else
                {
                    Count[i] = Count[i] + 1;
                }
            }
        }

        for(i=0; i<n; i++)
        {
            S[Count[i]] = A[i];
        }
        
        return S;
    }
}