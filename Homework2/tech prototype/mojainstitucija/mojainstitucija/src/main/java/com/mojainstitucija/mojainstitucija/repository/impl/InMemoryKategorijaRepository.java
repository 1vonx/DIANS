package com.mojainstitucija.mojainstitucija.repository.impl;

import com.mojainstitucija.mojainstitucija.bootstrap.DataHolder;
import com.mojainstitucija.mojainstitucija.model.Kategorija;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class InMemoryKategorijaRepository {
    public List<Kategorija> findAll()
    {
        return DataHolder.kategorijaList;
    }

    public Optional<Kategorija> findByName(String name){
        //optional ako ne postoi kat da moze da vrati dr
        return DataHolder.kategorijaList.stream().filter(r->r.getName().equals(name)).findFirst();
    }
    public List<Kategorija> search(String text)
    {
        return DataHolder.kategorijaList.stream().filter(r->r.getName().contains(text) ).collect(Collectors.toList());
    }

}
