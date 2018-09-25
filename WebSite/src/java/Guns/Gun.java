/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guns;


/**
 *
 * @author admin
 */
public class Gun  {
    private int _id;
    private String _description;
    private int _typeId;
    private String _imageUrl;
    
    
     //Constructeur
    public Gun(int id, String description, int typeId, String imageUrl){
        _id = id;
        _description = description;
        _typeId =  typeId;
        _imageUrl = imageUrl;
    }
    
    //Propriétés
    public int getId(){
        return _id;
    }
    
    public String getDescription(){
        return _description;
    }
    public void setDescription(String description){
        this._description= description;
    }
    
    public int getTypeId(){
        return _typeId;
    }
    public void setTypeId(int typeId){
        this. _typeId = typeId;
    }
    
    public String getImageUrl(){
        return _imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this._imageUrl = imageUrl;
    }
}

