package com.example.springmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "filme")
public class Filme {

  @Id
  private String id;

  private String nome;

  private String anoLancamento;

  public Filme(String nome, String anoLancamento) {
    this.nome = nome;
    this.anoLancamento = anoLancamento;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAnoLancamento() {
    return anoLancamento;
  }

  public void setAnoLancamento(String anoLancamento) {
    this.anoLancamento = anoLancamento;
  }
}
