package com.example.fire_emblem.model;

import java.io.Serializable;

public class Portrait implements Serializable {
    private String px75;
    private String px113;
    private String px150;

    public String getPx75() {
        return px75;
    }

    public String getPx113() {
        return px113;
    }

    public String getPx150() {
        return px150;
    }
}
