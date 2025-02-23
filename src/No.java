public class No extends Elemento{
  private Elemento cabeca;
  private No cauda;

  public No() {
    this.cabeca = null;
    this.cauda = null;
  }

  public Elemento getCabeca() {
    return cabeca;
  }

  public void setCabeca(Elemento cabeca) {
    this.cabeca = cabeca;
  }

  public No getCauda() {
    return cauda;
  }

  public void setCauda(No cauda) {
    this.cauda = cauda;
  }
}
