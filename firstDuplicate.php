function firstDuplicate($a) {

    $length = count($a);
    $minimumIndex = $length - 1;
    $currentIndex;
    $duplicate = false;
    
    for ($i = 0; $i < $length; $i++)
    {
        $numberBeingSearched = $a[$i];
        
            for ($j = $i + 1; $j < $length; $j++)
            {
                if ($numberBeingSearched == $a[$j])
                {
                    $duplicate = true;
                    $currentIndex = $j;
                    if ( $currentIndex <= $minimumIndex )
                    {
                        $minimumIndex = $currentIndex;   
                    }
                    
                }
            }
        
        
    }
    if ($duplicate)
    {
        return $a[$minimumIndex];
    }
    else
    {
        return -1;
    }
}

