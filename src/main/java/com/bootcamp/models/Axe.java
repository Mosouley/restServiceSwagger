package com.bootcamp.models;

import com.bootcamp.enums.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by groupe 1.
 */
public class Axe {
    private int id;
    private String name;
    private String description;
    private long createAt;
    private long updateAt;
    private String focus;
    List<Media> listMedia=new ArrayList<Media>();
    List<String> listComments=new ArrayList<String>();
    List<Secteur> listSectors=new ArrayList<Secteur>();

    public Axe() {
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

    public List<Media> getListMedia() {
        return listMedia;
    }

    public void setListMedia(List<Media> listMedia) {
        this.listMedia = listMedia;
    }

    public List<String> getListComments() {
        return listComments;
    }

    public void setListComments(List<String> listComments) {
        this.listComments = listComments;
    }

    public List<Secteur> getListSectors() {
        return listSectors;
    }

    public void setListSectors(List<Secteur> listSectors) {
        this.listSectors = listSectors;
    }

   
}
