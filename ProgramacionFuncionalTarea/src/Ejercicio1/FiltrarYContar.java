package Ejercicio1;
import java.util.List;

public class FiltrarYContar {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 7, 12, 5, 20, 8);
        long filtrarContar = numeros.stream()
                .filter(n -> n > 10)
                .count();
        
        System.out.println("Hay " + filtrarContar + " numeros mayores a 10");
    }
}
