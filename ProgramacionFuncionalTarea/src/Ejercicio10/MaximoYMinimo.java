package Ejercicio10;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximoYMinimo {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 3, 8, 15, 2);
        Optional<Integer> max = numeros.stream()
                .max(Comparator.naturalOrder());
        Optional<Integer> min = numeros.stream()
                .min(Comparator.naturalOrder());
        
        System.out.println("El numero maximo es: " + max.get());
        System.out.println("El numero minimo es: " + min.get());
    }
}
