package Ejercicio3;
import java.util.List;

public class SumarCuadrados {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        int suma = nums.stream()
                .map(n -> n*n)
                .reduce(0, Integer::sum);
        System.out.println("La suma de los cuadrados es " + suma);
    }
}
