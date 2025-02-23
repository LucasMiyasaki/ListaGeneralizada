public class ListaGen {
  private No inicio;

  public ListaGen() {
    this.inicio = null;
  }

  public No getInicio() {
    return this.inicio;
  }

  public void setInicio(No inicio) {
    this.inicio = inicio;
  }

  public void gerarLista(String string) {
    // “[aaa, [bbb, ccc], ddd, [eee, [ ], fff]]”
    string.replace(" ", "");

    for(int i=0; i<string.length(); i++) {
      
    }
  }
}
