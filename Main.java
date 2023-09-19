class Main {
  public static void main(String[] args) {
    PedraElemento fogo1 = new PedraFogo(10);
    PedraElemento fogo2 = new PedraFogo(2);
    PedraElemento agua1 = new PedraAgua(3);
    PedraElemento agua2 = new PedraAgua(5);
    PedraElemento terra1 = new PedraTerra(8);
    PedraElemento terra2 = new PedraTerra(1);
    PedraElemento ar1 = new PedraAr(12);
    PedraElemento ar2 = new PedraAr(9);

    Cajado cajado = new Cajado();

    cajado.executarPoderElemental(fogo1, fogo2);
    cajado.executarPoderElemental(agua1, agua2);
    cajado.executarPoderElemental(terra1, terra2);
    cajado.executarPoderElemental(ar1, ar2);
    cajado.executarPoderElemental(fogo1, ar1);
    cajado.executarPoderElemental(fogo1, terra1);
    cajado.executarPoderElemental(terra1, agua1);
    cajado.executarPoderElemental(agua1, ar1);
  }
}