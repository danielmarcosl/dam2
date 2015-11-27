package com.example.alumnot.xml_interno_lista;

import java.io.Serializable;

/**
 * Created by Daniel Marcos Lorrio on 03/11/2015.
 */
public class Videogame implements Serializable {

    private String name;
    private String platform;
    private String year;
    private String description;

    public Videogame(String n, String p, String y, String d) {
        this.name = n;
        this.platform = p;
        this.year = y;
        this.description = d;
    }

    public String getNameText() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public String getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }
}
