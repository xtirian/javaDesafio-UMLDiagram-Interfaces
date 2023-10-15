package main.services.browser;

public interface Safari {

  public default void exibirPagina(PaginaWeb pagina){
    
    System.err.println("Abrindo página "+ pagina.getPaginaTitle());
  }

  public static void main(String[] args) {
    
  }
}
