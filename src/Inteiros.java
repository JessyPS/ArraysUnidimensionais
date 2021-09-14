import org.w3c.dom.ls.LSOutput;
import java.util.Arrays;
import java.util.Random;

public class Inteiros {

    public static void main(String[] args) {

        int[] inteiros = {1, 2, 3, 4};

        Random numerosAleatorios = new Random();

        for (int i = 0; i < inteiros.length; i++) {
        int numero = numerosAleatorios.nextInt(inteiros.length);
        int random = inteiros[numero];
        inteiros[numero] = inteiros[i];
        inteiros[i] = random;
        }
        System.out.println(Arrays.toString(inteiros));
    }
}
