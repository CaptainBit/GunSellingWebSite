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
    private String _imageUrl;
    private int _typeId;
    private String _calibre;
    private String _action;
    private float _poids;
   
    
    
     //Constructeur
    public Gun(int id, String description, int typeId, String imageUrl, String calibre, String action ,float poids){
        _id = id;
        _description = description;
        _typeId =  typeId;
        _imageUrl = imageUrl;
        _calibre = calibre;
        _action = action;
        _poids = poids;
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
    public String getCalibre(){
        return _calibre;
    }
    public void setCalibre(String calibre){
        this._calibre = calibre;
    }
    public String getAction(){
        return _action;
    }
    public void setAction(String action){
        this._action = action;
    }
    public float getPoids(){
        return _poids;
    }
    public void setPoids(float poids){
        this._poids = poids;
    }
}

