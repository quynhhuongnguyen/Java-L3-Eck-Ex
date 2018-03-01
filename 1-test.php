<?php
$ref ="ASR/17/924";
$text = "ASR/17/152;ASR/17/924;CSR/17/104;RES/17/158";
$a = explode (";",$text);
$i = 0;
for ($i; $i<=count($a); $i++){
	if ($a[$i] == $ref){
		echo $a[$i];
	}
}


echo "\n";
?>



$query_good_match = "SELECT Good_match FROM SFTY_Traitement Where Good_match LIKE '%$Ref_Doc%'";
    $result_good_match = mysql_query($query_good_match);
    while ($row = mysql_fetch_row($result_good_match)){
		$text_good_match = $row[0];
		$domain_good_match = strstr ($text_good_match, 'ASR');
		$morceau_good_match = substr ($domain_good_match,0,10);
		if ($morceau_good_match == $Ref_Doc){
			$good_match = str_replace($morceau_good_match,"",$text_good_match);
			$final_good_match = mysql_query("UPDATE SFTY_Traitement SET Good_match='$good_match' WHERE Good_match = '$text_good_match'");
		}
	}
