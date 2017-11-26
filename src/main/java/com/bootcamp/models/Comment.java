
package com.bootcamp.models;

/**
 *
 * @author soul
 */
public class Comment {
    private int id;
    private String nom;
    private Media media;
    
    public Comment() {
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
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
