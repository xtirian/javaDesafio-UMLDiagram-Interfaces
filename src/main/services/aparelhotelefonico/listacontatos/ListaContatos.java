package main.services.aparelhotelefonico.listacontatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaContatos {
  private List<Contato> listContatos;

  public ListaContatos(List<Contato> listContatos) {
    this.listContatos = new ArrayList<>();
  }

  public void adicionarContato(Contato contato) {
    listContatos.add(contato);
    System.out.println("Contato " + contato.getNome() + " adicionado com sucesso.");
  }

  public void sortListNome() {
    List<Contato> sortedList = new ArrayList<>();

    Collections.sort(sortedList, new ComparatorNomeContato());

    sortedList.forEach(System.out::println);
  }

  public List<Contato> filterListCategoria(String categoria) {
    List<Contato> filtredList = new ArrayList<>();

    filtredList.addAll(listContatos.stream().filter(contato -> contato.getCategoria() == categoria).toList());    

    return filtredList;

  }

}
