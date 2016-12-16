/*
 * ComparisonCountSort.js
 * Implementation of the Comparison Count sort algorithm.
 */

function ComparisonCountSort(A) {
    var i, j;
    var n, k;
    n = A.length;

    var Count = new Array();
    var S = new Array();

    // Initialise with count of 0.
    for (i = 0; i < n; i++) {
        Count[i] = 0;
        S[i] = 0;
    }

    // Loop over all elements.
    for (i = 0; i < n-1; i++) {
        k = i + 1;

        // Loop again for all elements in the array after 
        // the element in the outer loop.
        for (j=k; j < n; j++) {
            // The element in the outer loop has a lower value.
            if(A[i] < A[j]) {
                Count[j] = Count[j] + 1;
            }
            // The element in the inner loop has a lower value.
            else {
                Count[i] = Count[i] + 1;
            }
        }
    }

    // Assign the new index for displaying the list in 
    // sorted order.
    for (i = 0; i < n; i++) {
        S[Count[i]] = A[i];
    }

    return S;
}

// Sample data for testing.
var X = [5,21,40,11,3,1,7,2,4,6,10,18,9,8];
console.log(X);

// Call the function to test.
var Y = ComparisonCountSort(X);
console.log(Y);
