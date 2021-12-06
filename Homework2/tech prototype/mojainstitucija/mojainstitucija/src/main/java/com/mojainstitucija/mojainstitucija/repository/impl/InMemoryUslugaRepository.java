package com.mojainstitucija.mojainstitucija.repository.impl;


import com.mojainstitucija.mojainstitucija.bootstrap.DataHolder;
import com.mojainstitucija.mojainstitucija.model.Usluga;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryUslugaRepository {
    public List<Usluga> findAll()
    {
        return DataHolder.uslugaList;
    }
    public Optional<Usluga> findByName(String name)
    {
        return DataHolder.uslugaList.stream().filter(i->i.getName().equals(name)).findFirst();
    }
}
