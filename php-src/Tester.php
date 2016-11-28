<?php
require('BubbleSort.php');

$A = array(3,6,9,4,2,8,0,7,5,1);

$B = array();
$B = BubbleSort($A);

echo 'A = ';
foreach($A as $i) {
    echo $i . ' ';
}
echo '<br>';

echo 'B = ';
foreach($B as $j) {
    echo $j . ' ';
}
echo '<br>';

?>