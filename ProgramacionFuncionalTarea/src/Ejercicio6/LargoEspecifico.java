package Ejercicio6;
import java.util.List;
import java.util.Optional;

public class LargoEspecifico {
    public static void main(String[] args) {
        List<String> palabras = List.of("sol", "luna", "estrella", "mar");
        Optional<String> largo = palabras.stream()
                .filter(p -> p.length() == 4)
                .findFirst();
                
        System.out.println(largo.get());
    }
}
