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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <style>
            #navBarSearchForm input[type=text]{width:430px !important;}
        </style>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Template</title>
    </head>
    <body>
        
        <div class="header">
            <nav class="navbar navbar-inverse navbar-fixed-top">
              <div class="container-fluid">
                <div class="navbar-header">
                  <a class="navbar-brand" href="#">Marchand d'armes <i class="fas fa-fighter-jet"></i></a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="Rifle.jsp">Rifle</a></li>
                    <li><a href="Pistol.jsp">Pistol</a></li>
                    <li><a href="./Jsp/Kids.jsp">Kids</a></li>
                </ul>
                <form class="navbar-form navbar-right" action="/action_page.php" id="navBarSearchForm">
                  <div class="input-group">
                    <input type="text" class="form-control" placeholder="Recherche d'une arme à feu" name="search">
                    <div class="input-group-btn">
                      <button class="btn btn-default" type="submit">
                        <i class="glyphicon glyphicon-search"></i>
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </nav>                            
        </div>  
        
        <div class="container-fluid" style="padding-top: 80px">
            
            <div class="row">
                
                <section class="col-xs-12 col-sm-12 col-md-8 col-lg-7">
                    <article class="panel panel-default" style="width:100%">
                      <div class="panel-heading">Recherche</div>
                      <div class="panel-body">
                          <h4>Toutes les armes</h4>
                          <table class="table" id="table-data">
                            <thead>
                              <tr>
                                <th scope="col">#</th>
                                <th scope="col">First</th>
                                <th scope="col">Last</th>
                                <th scope="col">Handle</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <th scope="row">1</th>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                              </tr>
                              <tr>
                                <th scope="row">2</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                              </tr>
                              <tr>
                                <th scope="row">3</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>@twitter</td>
                              </tr>
                            </tbody>
                          </table>
                      </div>
                    </article>
                </section>
                
                <aside class="col-xs-12 col-sm-12 col-md-4 col-lg-5">
                    <article class="panel panel-default">
                        <div class="panel-heading">Image de l'arme à feu</div>
                        <div class="panel-body">
                            <h4>AK-47</h4>
                            <img id="img-data" src="./img/gun.jpg" class="img-fluid" alt="Erreur du chargement de l'image">
                        </div>
                    </article>                    
                </aside>
                
            </div>   
            
        </div>
        
        <div class="footer">
            <div class="footer-copyright text-center py-3">
                Application web développée et programmée par William Lafontaine et Isaac Fiset            
            </div>
        </div>
        
    </body>
</html>
