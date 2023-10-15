package main.services.browser;

public class PaginaWeb {
  //atributos
  String paginaEndereco;
  private String paginaTitle;
  
  public PaginaWeb(String paginaEndereco, String paginaTitle) {
    this.paginaEndereco = paginaEndereco;
    this.paginaTitle = paginaTitle;
  }

  public String getPaginaEndereco() {
    return paginaEndereco;
  }

  public void setPaginaEndereco(String paginaEndereco) {
    this.paginaEndereco = paginaEndereco;
  }

  public String getPaginaTitle() {
    return paginaTitle;
  }

  public void setPaginaTitle(String paginaTitle) {
    this.paginaTitle = paginaTitle;
  }

  

  
}
