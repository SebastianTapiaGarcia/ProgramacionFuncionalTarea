package Ejercicio7;
import java.util.List;
import java.util.OptionalDouble;

public class Promedio {
    public static void main(String[] args) {
        List<Double> numeros = List.of(1.5, 2.0, 3.5, 4.0);
        OptionalDouble promedio = numeros.stream()
                .mapToDouble(Double::doubleValue)
                .average();
        
        System.out.println("El promedio es " + promedio.getAsDouble());
    }
}
