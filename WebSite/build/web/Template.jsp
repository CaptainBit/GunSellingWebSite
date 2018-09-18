<%-- 
    Created on : 2018-09-13, 09:53:50
    Author     : Isaac Fiset and William Lafontaine
--%>
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
        <%
            //Server
            String driver = "com.mysql.cj.jdbc.Driver";
            String servername = "localhost";
            String port = "3306";
            String shema = "bd_guns";
            String parameter = "?serverTimezone=UTC";
            String url = "jdbc:mysql://" + servername + ":" + port + "/" + shema + parameter;
            String username = "root";
            String password = "t0t0g5wil"; 
            
            Properties properties = new Properties();
            properties.setProperty("user", username);
            properties.setProperty("password", password);
            properties.setProperty("useSSL", "false");
            properties.setProperty("verifyServerCertificate", "true");
            properties.setProperty("requireSSL", "false");
        
            java.sql.Connection conn = null;
            
            try{
                Class.forName(driver).newInstance();
                conn = DriverManager.getConnection(url, properties);
            }
            catch(SQLException e){
                System.out.println(e);
                System.exit(-1);
            }
            catch(Exception e){
                System.out.println(e);
                System.exit(-1);
            }
            finally{
                // Close ResultSet and PreparedStatement
                conn.close();
            }
                            
        %>
    </head>
    <body>
        
        <div class="header">
            <nav class="navbar navbar-inverse navbar-fixed-top">
              <div class="container-fluid">
                <div class="navbar-header">
                  <a class="navbar-brand" onclick="ChangerTable('Toutes les armes à feu')" href="#">Marchand d'armes <i class="fas fa-fighter-jet"></i></a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="#" onclick="ChangerTable('Rifle')">Rifle</a></li>
                    <li><a href="#" onclick="ChangerTable('Pistol')">Pistol</a></li>
                    <li><a href="#" onclick="ChangerTable('Kids')">Kids</a></li>
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
        function ChangerTable(nom){
            $("#table-nom").text(nom);
            $('#table-data').html("\
                    <thead>\
                          <tr>\
                            <th scope='col'>#</th>\
                            <th scope=col'>Description</th>\
                            <th scope=col'>Type</th>\
                          </tr>\
                        </thead>\
                        <tbody>\
                          <tr onclick='ChangerImage(1)'>\
                            <th scope='row'>1</th>\
                            <td>Uzi</td>\
                            <td>Kids</td>\
                          </tr>\
                          <tr onclick='ChangerImage(2)'>\
                            <th scope='row'>2</th>\
                            <td>Pistol</td>\
                            <td>Pistol</td>\
                          </tr>\
                          <tr onclick='ChangerImage(3)'>\
                            <th scope='row'>3</th>\
                            <td>Ak-47</td>\
                            <td>Rifle</td>\
                          </tr>\
                        </tbody>\
                        ");
        }
                
        function ChangerImage(id){
            console.log(id);
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
                /*
                $.post()"getData",nom,function(data){
                    console.log("post success");
                    //post to table in html
                });
                */
            
        </script>        
        
    </body>
</html>    