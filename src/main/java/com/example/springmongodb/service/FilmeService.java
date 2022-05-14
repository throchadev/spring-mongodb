package com.example.springmongodb.service;

import com.example.springmongodb.model.Filme;
import com.example.springmongodb.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

  @Autowired
  private FilmeRepository filmeRepository;

  public void save(String nome, String anoLancamento){

    Filme filme = new Filme(nome, anoLancamento);

    this.filmeRepository.save(filme);
  }
}
