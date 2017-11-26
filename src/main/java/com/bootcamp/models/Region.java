
package com.bootcamp.models;

import com.bootcamp.enums.TypeRegion;

/**
 *
 * @author soul
 */
public class Region {
    private int id;
    private String nom;
    private TypeRegion typeRegion;
    
    public Region() {
    }

    public TypeRegion getTypeRegion() {
        return typeRegion;
    }

    public void setTypeRegion(TypeRegion typeRegion) {
        this.typeRegion = typeRegion;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
