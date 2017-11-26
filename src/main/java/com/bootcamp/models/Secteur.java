package com.bootcamp.models;

import com.bootcamp.enums.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by groupe 1
 */
public class Secteur {
    private int id;
    private String name;
    private String description;
    private long createAt;
    private long updateAt;
    private String objective;
    List<Axe> listAxes=new ArrayList<Axe>();
    List<Media> listMedia=new ArrayList<Media>();
    List<String> listComments=new ArrayList<String>();
    List<Projet> listProjects=new ArrayList<Projet>();

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

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public List<Axe> getListAxes() {
        return listAxes;
    }

    public void setListAxes(List<Axe> listAxes) {
        this.listAxes = listAxes;
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

    public List<Projet> getListProjects() {
        return listProjects;
    }

    public void setListProjects(List<Projet> listProjects) {
        this.listProjects = listProjects;
    }

   
}
