# Implementation of Comparison Counting sort algorithm.
class ComparisonCountSort:

    def sort(A):
        # Initialise arrays
        Count = [0 for i in range(len(A))]
        S = [0 for i in range(len(A))]

        # Get length
        n = len(A)

        for i in range(0, n-1):
            k = i + 1
            for j in range(k, n):
                if(A[i] < A[j]):
                    Count[j] = Count[j] + 1
                else:
                    Count[i] = Count[i] + 1
        for i in range(0, n):
            S[Count[i]] = A[i]

        return S
