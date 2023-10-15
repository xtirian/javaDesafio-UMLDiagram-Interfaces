package main.devices;

import main.services.aparelhotelefonico.Caller;
import main.services.browser.Safari;
import main.services.correioemail.Email;
import main.services.reprodutormusicas.Reprodutor;

public interface Iphone extends Email, Caller, Reprodutor, Safari {
  public static void main(String[] args) {
    
  }
}
