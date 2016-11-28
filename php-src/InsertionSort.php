<?php
// Implementation of the Insertion Sort algorithm.
function InsertionSort($A) {
    $a_len = count($A);

    // Iterate over the array.
    for($i=1; $i<$a_len; $i++) {
        $v = $A[$i];
        $j = $i - 1;

        // While index is positive and the element is greater than A[i]
        // scan and insert A[i] into its proper position.
        while(($j >= 0) && ($A[$j] > $v)) {
            $A[$j+1] = $A[$j];
            $j--;
        }
        $A[$j+1] = $v;
    }

    // Return the sorted array.
    return $A;
}
?>