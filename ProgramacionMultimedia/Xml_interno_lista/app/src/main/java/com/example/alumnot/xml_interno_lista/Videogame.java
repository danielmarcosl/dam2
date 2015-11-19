package com.example.alumnot.xml_interno_lista;

import java.io.Serializable;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class Videogame implements Serializable {

    private String name;
    private String year;
    private String platform;

    public Videogame(String n, String p, String y) {
        this.name = n;
        this.platform = p;
        this.year = y;
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
}
