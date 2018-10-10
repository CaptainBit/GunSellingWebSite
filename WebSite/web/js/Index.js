$('document').ready(function(){
            ChangerTable({types_idtype : '0', types_description : 'Toutes les armes'}); 
            
            $.getJSON("./GetType.jsp",null,function (data)
                    {
                        $.each(data ,(i,item)=> {
                            //Remplis le menu par type guns
                            $('#menuGuns').append($('<li>').append(
                                "<a href='#"+ item.types_description + "' onclick='ChangerTable("
                                + JSON.stringify(item) +")'>"+item.types_description+"</a>"
                            ));
                    
                            //Ajoute les choix de type lors de la modification d'un item
                            $('#editType').append(
                                    $('<option>', {
                                    text: item.types_description,
                                    value: item.types_idtype
                                }));
                            });
                    });
            
            $(document).on("submit", "#formModal", function(event)
            {
                event.preventDefault();
                
                var url=$(this).attr("action");
                
                $.post(url, $('#formModal').serialize(),(response)=>{
                    alert(response);    
                    ChangerTable(JSON.parse(sessionStorage.getItem("typeGun")));
                    $('#myModal').modal('toggle');
                });      
            });            
        })
        
        function SearchTable(){
             var search ,filter, table, tr, td, i;
                search = document.getElementById("searchTable");
                filter = search.value.toUpperCase();
                table = document.getElementById("table-data");
                tr = table.getElementsByTagName("tr");
                for (i = 0; i < tr.length; i++) {
                  td = tr[i].getElementsByTagName("td")[0];
                  if (td) {
                    if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                      tr[i].style.display = "";
                    } else {
                      tr[i].style.display = "none";
                    }
                  }       
                }
        }
        
                    
        function ChangerTable(type){
            $("#table-nom").text(type.types_description);
            
            $.getJSON("./Select.jsp",{"idType":type.types_idtype},function(data){
                CreateTable(data);
            });
            
            sessionStorage.setItem("typeGun", JSON.stringify(type));
        }
        function FindGun(name)
        {
            $("#table-nom").text("Resultat de la recherche  : " + name);
            $.getJSON("./Search.jsp",{"name":name},function(data){
                CreateTable(data);
            });

        }       
        function ChangerImage(item){
            $('#img-nom').text(item.gun_description);
            $('#img-data').attr("src",item.gun_imageUrl);
            $('#img-calibre').text("");
            $('#img-action').text("");
            $('#img-poids').text("");
            
            if(checkNull(item.gun_calibre)){
                $('#img-calibre').text("Calibre : " + item.gun_calibre);                
            }
            if(checkNull(item.gun_action)){
                $('#img-action').text("Action : " + item.gun_action);
            }
            if(checkNull(item.gun_poids)){
                $('#img-poids').text("Poids : " + item.gun_poids + " g");
            }
        }
        
        function checkNull(value){
            return typeof value !== "undefined" && value !== null && value !== "0.0" && value !== "";
        }
        
        function deleteItem(idGun)
        {
             $.post("./Delete.jsp",{"idGun":idGun},function(data){
                alert(data);       
                ChangerTable(JSON.parse(sessionStorage.getItem("typeGun")));
            });
        }
        
        function editItem(item){
            $("#myModal").modal();
            $('#titreModal').text("Modifier " + item.gun_description);
            $('#formModal').attr('action','./Update.jsp');
            
            $('#editNom').val(item.gun_description);
            $('#editType').val(item.types_idtype);
            $('#editAction').val(item.gun_action);
            $('#editCalibre').val(item.gun_calibre);
            $('#editPoids').val(item.gun_poids);
            $('#editId').val(item.gun_idguns);
            $('#editFile').val(item.gun_imageUrl);
        }
        
        function addItem(){
            $("#myModal").modal();
            $('#titreModal').text("Ajouter une nouvelle arme à feu");
            $('#formModal').attr('action','./AddGun.jsp');
            
            $('#editNom').val("");
            $('#editType').val("");
            $('#editAction').val("");
            $('#editCalibre').val("");
            $('#editPoids').val("");
            $('#editFile').val("");
        }
        
        function CreateTable(data){
            var Table = "<thead class='thead-dark'><tr><th scope=col'>Description</th>" +
                "<th scope=col'>Type</th><th class='text-right'>Actions</th></tr></thead><tbody>"; 
                
                data.forEach(function(item){
                    Table += "<tr onclick='ChangerImage("+ JSON.stringify(item)+")'>" +
                    "<td>"+item.gun_description+"</td><td>"+item.types_description+
                    "</td><td class='text-right'><a href='#' onclick='editItem("+ 
                    JSON.stringify(item)+")' title='Edit'><i class='fas fa-edit fa-lg fa-fw'></i></a>"
                    + "<a href='#' onclick='deleteItem("+ item.gun_idguns
                    +")' title='Delete'><i class='fas fa-trash-alt fa-lg fa-fw'></i></a></td></tr>";
                });        

                Table += "</tbody>";
                
                $('#table-data').html(Table);
        }

