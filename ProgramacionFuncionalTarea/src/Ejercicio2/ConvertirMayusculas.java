package Ejercicio2;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertirMayusculas {
    public static void main(String[] args) {
        List<String> palabras = List.of("java", "python", "c", "ruby");
        List<String> mayusculas = palabras.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        
        System.out.println(mayusculas);
    }
}
