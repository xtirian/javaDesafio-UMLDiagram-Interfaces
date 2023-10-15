package main.services.correioemail;

import main.services.aparelhotelefonico.listacontatos.Contato;

public abstract interface Email {

  public default void enviarEmail(Contato contato){
    String emailAdress =  contato.getEmail();

    System.out.println("Email enviado com sucesso para: " + emailAdress);    
  }

  public default void receberEmail(Contato contato){
    String emailAdress =  contato.getEmail();

    System.out.println("Email enviado com sucesso para: " + emailAdress);     
  }
  
  public static void main(String[] args) {
    
  }
}
