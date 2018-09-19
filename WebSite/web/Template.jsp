<%-- 
    Created on : 2018-09-13, 09:53:50
    Author     : Isaac Fiset and William Lafontaine
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%--
git: 
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <script src="./js/libs/jquery/jquery.js"></script>
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
                  <a class="navbar-brand" onclick="ChangerTable(0)" href="#">Dictionnaire des armes à feu  <i class="fas fa-fighter-jet"></i></a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="#" onclick="ChangerTable(1)">Rifle</a></li>
                    <li><a href="#" onclick="ChangerTable(2)">Pistol</a></li>
                    <li><a href="#" onclick="ChangerTable(3)">Kids</a></li>
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
                          <h4 id="table-nom">Toutes les armes à feu</h4>
                          <table class="table table-hover" id="table-data">
                          </table>
                      </div>
                    </article>
                </section>
                
                <aside class="col-xs-12 col-sm-12 col-md-4 col-lg-5">
                    <article class="panel panel-default">
                        <div class="panel-heading">Image de l'arme à feu</div>
                        <div class="panel-body">
                            <h4 id="img-nom">AK-47</h4>
                            <img id="img-data" src="./img/pistol.jpg" class="img-fluid" alt="Erreur du chargement de l'image">
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
        
        <script>
        $('document').ready(function(){
            ChangerTable(0);
        })
        
        function ChangerTable(idType){
            
            switch(idType){
                case 0:
                    $("#table-nom").text("Toute les armes");
                    break;
                case 1:
                    $("#table-nom").text("Rifle");
                    break;
                case 2:
                    $("#table-nom").text("Pistol");
                    break;
                case 3:
                    $("#table-nom").text("Kids");
                    break;
            }
            
            $.post("./Select.jsp",{"idType":idType},function(data){
                $('#table-data').html(data);
            });
        }
                
        function ChangerImage(id){
            switch(id){
                case 1:
                    $('#img-nom').text('uzi');
                    $('#img-data').attr("src","./img/uzi.jpg");                    
                    break;
                case 2: 
                    $('#img-nom').text('pistol');                    
                    $('#img-data').attr("src","./img/pistol.jpg");
                    break;
                case 3: 
                    $('#img-nom').text('ak-47');                    
                    $('#img-data').attr("src","./img/ak-47.jpg");                    
                    break;
            }
        }
        </script>        
        
    </body>
</html>    