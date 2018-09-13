/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guns;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Gun  {
    private int _id;
    private String _nom;
    private int _calibre;
    private Date _dateSorti;
    private float _cout;
    
    
     //Constructeur
    public Gun(int id, String nom, int calibre, Date dateSorti, float salaire){
        _id = id;
        _nom = nom;
        _calibre = calibre;
        _dateSorti = dateSorti;
        _cout = salaire;
    }
    
    public Gun(String nom, int age, Date dateSorti, float salaire){
        _nom = nom;
        _calibre = age;
        _dateSorti = dateSorti;
        _cout = salaire;
    }
    
    //Propriétés
    public int getId(){
        return _id;
    }
    
    public String getNom(){
        return _nom;
    }
    public void setNom(String nom){
        this._nom = nom;
    }
    
    public int getCalibre(){
        return _calibre;
    }
    public void setCalibre(int age){
        this._calibre = age;
    }
    
    public Date getDateSorti(){
        return _dateSorti;
    }
    public void setDateSorti(Date date){
        this._dateSorti = date;
    }
    
    public float getCout(){
        return _cout;
    }
    public void setCout(float salaire){
        this._cout = salaire;
    }
    //
    
    public String printGun(){
        String line = String.valueOf(_id) + " : " + _nom + " " +
                String.valueOf(_calibre) +" ans  né(e) le " + String.valueOf(_dateSorti) + " salaire : " + String.valueOf(_cout);
        return line;
    }
}

