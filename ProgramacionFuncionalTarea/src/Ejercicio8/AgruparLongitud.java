package Ejercicio8;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparLongitud {
    public static void main(String[] args) {
        List<String> palabras = List.of("casa", "perro", "sol", "gato");
        Map<Integer, List<String>> agrupar = palabras.stream()
                .collect(Collectors.groupingBy(String::length));
        
        System.out.println(agrupar);
    }
    
}
