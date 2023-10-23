import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    ArrayList<Carro> lista = new ArrayList<>();

    lista.add(new Civic());
    lista.add(new Mustang());

    lista.forEach(i -> System.out.println(i));
  }
}
