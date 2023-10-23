/**
 * Carro
 */
public abstract class Carro {

  protected String marca;
  protected String tipo;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((marca == null) ? 0 : marca.hashCode());
    result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Carro other = (Carro) obj;
    if (marca == null) {
      if (other.marca != null) return false;
    } else if (!marca.equals(other.marca)) return false;
    if (tipo == null) {
      if (other.tipo != null) return false;
    } else if (!tipo.equals(other.tipo)) return false;
    return true;
  }
}
