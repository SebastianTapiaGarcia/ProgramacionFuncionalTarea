package Ejercicio9;
import java.util.List;
import java.util.stream.Collectors;

public class EliminarDuplicados {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 2, 3, 4, 4, 4);
        List<Integer> noDuplicados = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        
        System.out.println(noDuplicados);
    }
}
