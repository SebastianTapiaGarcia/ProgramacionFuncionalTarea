package EjercicioIntegrador;
import java.util.List;  
import java.util.stream.Collectors;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        record Persona(String nombre, int edad){}
        List<Persona> personas = List.of(
                new Persona("Ana", 25),
                new Persona("Luis", 17),
                new Persona("Marta", 30)
        );
        List<String> nombresMayores = personas.stream()
                .filter(p -> p.edad() > 18)
                .map(Persona::nombre)
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println(nombresMayores);
    }
}
