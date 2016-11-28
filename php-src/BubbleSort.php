<?php
// Implement the Bubblesort algorithm.
function BubbleSort($A) {
    $a_len = count($A);

    // Compare adjacent array elements and exchange the values 
    // if they are out of order.
    for($i = 0; $i < $a_len-1; $i++)
    {
        for($j = 0; $j < $a_len-1-$i; $j++)
        {
            if($A[$j+1] < $A[$j])
            {
                // Swap the elements.
                $temp = $A[$j];
                $A[$j] = $A[$j+1];
                $A[$j+1] = $temp;
            }
        }
    }

    return $A;
}
?>