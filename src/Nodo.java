import java.util.ArrayList;

public class Nodo<T> {
    private T valor;
    private ArrayList<Nodo<T>> arcos;
    private ArrayList<Nodo<T>> siguiente;


    public Nodo(T pValor){
        this.valor = pValor;
    }

}
