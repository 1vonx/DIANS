package com.mojainstitucija.mojainstitucija.repository.impl;

import com.mojainstitucija.mojainstitucija.bootstrap.DataHolder;
import com.mojainstitucija.mojainstitucija.model.Lokacii;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryLokaciiRepository {
    public List<Lokacii> findAll()
    {
        return DataHolder.lokaciiList;
    }
    public Optional<Lokacii> findByName(String name)
    {
        return DataHolder.lokaciiList.stream().filter(i->i.getName().equals(name)).findFirst();
    }
}
