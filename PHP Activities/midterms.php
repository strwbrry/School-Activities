<form method="POST" action="">
Name:
<br>
<input type="text" name="name">
<br>
Birth Year: 
<br>
<input type="number" name="birthyear">
<br>
<button>SUBMIT</button>
</form>

<?php
 $name = $_POST['name'];
 $birthYear = $_POST['birthyear'];
 $presentdate = date("Y");

 if ($name == "Ronald Reglos Jr" && $birthYear == "2001") {
    $age = $presentdate - $birthYear;
    echo "Hello!!! I am ".$name." and my current age is ".$age."<br>";
 } 
 else{
    echo "Invalid Person Identity or Birth Year";
 }
?>