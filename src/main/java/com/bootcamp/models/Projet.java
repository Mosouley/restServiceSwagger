package com.bootcamp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by groupe 1
 */
public class Projet {
    private int id;
    private String name;
    private String description;
    private long createAt;
    private long updateAt;
    private long plannedStartDate;
    private long plannedEndDate;
    private long ActualStartDate;
    private long ActualEndDate;
    private double forecastedBudget;
    private double actualBudget;
    private List<String> objectives = new ArrayList<String>();
    //Indicateur and Phases to be added in a second time

    List<Region> listRegions=new ArrayList<Region>();
    List<Media> listMedia=new ArrayList<Media>();
    List<String> listComments=new ArrayList<String>();

    public List<Region> getListRegions() {
        return listRegions;
    }

    public void setListRegions(List<Region> listRegions) {
        this.listRegions = listRegions;
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

    public long getPlannedStartDate() {
        return plannedStartDate;
    }

    public void setPlannedStartDate(long plannedStartDate) {
        this.plannedStartDate = plannedStartDate;
    }

    public long getPlannedEndDate() {
        return plannedEndDate;
    }

    public void setPlannedEndDate(long plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
    }

    public long getActualStartDate() {
        return ActualStartDate;
    }

    public void setActualStartDate(long ActualStartDate) {
        this.ActualStartDate = ActualStartDate;
    }

    public long getActualEndDate() {
        return ActualEndDate;
    }

    public void setActualEndDate(long ActualEndDate) {
        this.ActualEndDate = ActualEndDate;
    }

    public double getForecastedBudget() {
        return forecastedBudget;
    }

    public void setForecastedBudget(double forecastedBudget) {
        this.forecastedBudget = forecastedBudget;
    }

    public double getActualBudget() {
        return actualBudget;
    }

    public void setActualBudget(double actualBudget) {
        this.actualBudget = actualBudget;
    }

    public List<String> getObjectives() {
        return objectives;
    }

    public void setObjectives(List<String> objectives) {
        this.objectives = objectives;
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

   
}
