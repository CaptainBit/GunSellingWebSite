<%-- 
    Created on : 2018-09-13, 09:53:50
    Author     : Isaac Fiset and William Lafontaine
--%>
<%--
git: 
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <script src="../js/libs/jquery/jquery.js"></script>
        <link rel="stylesheet" href="./Css/Default.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Template</title>
    </head>
    <body>
        <div class="header">
            <h1>Marchand d'armes</h1>
            <nav class="navsection">
                <a href="Homepage.jsp" class="logo"><i class="fas fa-fighter-jet"></i></a>
                <a href="Rifle.jsp">Rifle</a>
                <a href="Pistol.jsp">Pistol</a>
                <a href="./Jsp/Kids.jsp">Kids</a>
                <div class="search-container">
                  <form action="/action_page.php">
                    <input type="text" placeholder="Search.." name="search">
                    <button type="submit"><i class="fa fa-search"></i></button>
                  </form>
                </div>
            </nav>
        </div>  
        
        <div class="Container">
            <section class="section-gauche">
                  <h1>Articles</h1>
                  <article>
                        <h1>Titre de l'article</h1>
                        <p>Contenu de l'article</p>
                  </article>
            </section>
        </div>
              
        <div class="Container">
            <aside class="aside-droite">
                <h4>Sources de l'article</h4>
                <ul>
                  <li><a href="#">Lien 1</a></li>
                  <li><a href="#">Lien 2</a></li>
                  <li><a href="#">Lien 3</a></li>
                </ul>
            </aside>
        </div>
        
        <div class="footer">
            <h5>Application web développée et programmée par </h5>            
            <h5><strong>William Lafontaine</strong> et <strong>Isaac Fiset</strong></h5>
            <h6>Étudiants programmeurs remarquables</h6>
        </div>
        
    </body>
</html>
