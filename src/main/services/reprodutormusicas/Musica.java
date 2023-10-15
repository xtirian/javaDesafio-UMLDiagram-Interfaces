package main.services.reprodutormusicas;

public class Musica {
  private int tempo;
  private String nome;

  
  public Musica(int tempo, String nome) {
    this.tempo = tempo;
    this.nome = nome;
  }

  public int getTempo() {
    return tempo;
  }
  public void setTempo(int tempo) {
    this.tempo = tempo;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  void tocar(Musica musica){
    System.err.println("Tocando musica: "+musica.getNome());
    System.err.println("Tempo total: "+musica.getTempo());
  }

  
  
}
