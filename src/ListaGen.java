import java.util.Stack;

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
    string = string.replace(" ", "");

    No pos = this.inicio;
    Stack<No> pilha = new Stack();

    for(int i=0; i<string.length(); i++) {
      if(string.charAt(i) == '[') {
        if(this.inicio == null) {
          No novoNo = new No();
          this.inicio = novoNo;
          pos = this.inicio;

        } else {
          if(string.charAt(i+1) != ']') {
            pilha.add(pos);

            No novoNo = new No();
            pos.setCabeca(novoNo);
            pos = (No)pos.getCabeca();
          }
        }
      } else if(string.charAt(i) == ',') {
        No novoNo = new No();
        pos.setCauda(novoNo);
        pos = pos.getCauda();

      } else if(string.charAt(i) == ']') {
        if(pilha.size() != 0)
          pos = pilha.pop();

      } else {
        String atomo = "";

        while(string.charAt(i) != '[' && string.charAt(i) != ',' && string.charAt(i) != ']') {
          atomo += string.charAt(i);
          i++;
        }
        i--;

        pos.insereAtomo(atomo);
      }
    }
  }
}
