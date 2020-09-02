public class Estojo {

public String cor;
public int tamanho;
Caneta caneta = new Caneta("vermelho", "cheio", "bic");

@Override 
public String toString() { 
  String s = "estojoda cor: " + cor + " do tamanho em cm: " + tamanho; 
  s += ", com uma caneta da cor " + caneta.cor + ", com carga: " + caneta.carga + ", da marca" + caneta.marca;
  return s; 
} 
}