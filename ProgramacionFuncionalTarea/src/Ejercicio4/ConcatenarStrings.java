package Ejercicio4;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenarStrings {
    public static void main(String[] args) {
        List<String> palabras = List.of("Hola", "mundo", "funcional");
        String unir = palabras.stream()
                .collect(Collectors.joining(" "));
        System.out.println(unir);
    }
}
