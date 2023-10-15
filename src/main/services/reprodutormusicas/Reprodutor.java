package main.services.reprodutormusicas;

import java.util.ArrayList;
import java.util.List;

public interface Reprodutor {
  

  public default void selecionarMusica(Musica musica){
    List<Musica> musicasDisponiveis = new ArrayList<>();

    List<Musica> musicaSelecionada = musicasDisponiveis.stream().filter(m -> m.getNome().equals(musica.getNome())).toList();


    musica.tocar(musicaSelecionada.get(0));
  }

  public static void main(String[] args) {
    
  }
  
}
