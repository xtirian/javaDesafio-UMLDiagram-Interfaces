package main.services.aparelhotelefonico;


public interface Caller{

  public default void ligar(long telefone){
    System.out.println("ligando para: " + telefone);   

  }

  public static void main(String[] args) {
    
  }
  
}
