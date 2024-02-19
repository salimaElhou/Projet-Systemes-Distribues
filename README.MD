<h2>Injection des dépendances</h2>
<h4>1- Creation d'Interface IDao :</h4>
<img src="Captures/DAO.png">
<h4>2- Implementation de cette Interface :</h4>
<img src="Captures/2.png">
<h4>3- Creation d'Interface IMetier :</h4>
<img src="Captures/3.png">
<h4>4- Implementation de cette Interface :</h4>
<img src="Captures/4.png">
<h4>5- Injection des dépendaces :</h4>
<h6>a. Par instanciation statique :</h6>
<img src="Captures/5.png">
<h6>b. Par instanciation dynamique :</h6>
<img src="Captures/6.png">
<p>avec le fichier config.txt est :</p>
<img src="Captures/7.png">
<h6>En utilisant le Framework Spring :</h6>
<P>Version XML :</P>
<img src="Captures/8.png">
<p>avec le fichier applicationContext.xml est :</p>
<img src="Captures/9.png">
<P>Version annotations :</P>
<img src="Captures/10.png">
<span>en ajoutent bien sure l'annotation @Repository("dao") sur la class DaoImpl , mème l'annotation @Service("metier") sur la class MetierImpl</span>