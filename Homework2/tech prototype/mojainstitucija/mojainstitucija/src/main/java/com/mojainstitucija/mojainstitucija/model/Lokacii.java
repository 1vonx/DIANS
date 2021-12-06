package com.mojainstitucija.mojainstitucija.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Lokacii {
    @Id
    public String name;

    public String address;

    public String source;


    public Lokacii(String name, String address, String source) {
        this.name = name;
        this.address = address;
        this.source = source;
    }
    public Lokacii() {
    }
}
