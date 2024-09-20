<$php
sesssison_start();
if(!isset($_SESSION["usuario"])){
    header("Location: form_login.php",true,301);
}else{
?>
<html><body>
    <h1>Ola <?php echo()> </h1>
</body>
}