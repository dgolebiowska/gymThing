package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class AtlasOfExcercises {
    @GeneratedValue
    @Id
    private int id;

    @Column
    private String name;
    @Column
    private boolean bodyWeighted;
    @Column
    private boolean weighted;
    @Column
    private boolean repeats;
    @Column
    private String instruments;


    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBodyWeighted() {
        return bodyWeighted;
    }

    public void setBodyWeighted(boolean bodyWeighted) {
        this.bodyWeighted = bodyWeighted;
    }

    public boolean isWeighted() {
        return weighted;
    }

    public void setWeighted(boolean weighted) {
        this.weighted = weighted;
    }

    public boolean isRepeats() {
        return repeats;
    }

    public void setRepeats(boolean repeats) {
        this.repeats = repeats;
    }

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }
}
