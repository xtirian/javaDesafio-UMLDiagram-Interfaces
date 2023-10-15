package main.services.aparelhotelefonico.listacontatos;

import java.util.Comparator;

/**
 * Contato
 */
public class Contato{
  private String nome;
  private long telefone;
  private String categoria;
  private String email;

  

  public Contato(String nome, long telefone, String categoria, String email) {
    this.nome = nome;
    this.telefone = telefone;
    this.categoria = categoria;
    this.email = email;
  }

  @Override
  public String toString() {
    return "Contato [nome=" + nome + ", telefone=" + telefone + ", categoria=" + categoria + "]";
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public long getTelefone() {
    return telefone;
  }
  public void setTelefone(long telefone) {
    this.telefone = telefone;
  }
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  } 
  
}

class ComparatorNomeContato implements Comparator<Contato>{

  @Override

  public int compare(Contato c1, Contato c2) {

    return Integer.valueOf(c1.getNome()).compareTo(Integer.valueOf(c2.getNome()));
  }
}
