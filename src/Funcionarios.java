// Ex 01 - Um novo administrador de uma fábrica de software precisa registrar os nomes de seus funcionários
// recém-admitidos. Desenvolva um vetor do tipo String, que registre os 05 funcionários chegados na organização
// junto de uma mensagem: "Bem-vindo ao Mundo do TI, Coder + (Nome do coder que será criado por você)"
// Resultado final esperado: Um sistema que apresente os nomes dos funcionários e os seus números
// Observação: Os números dos funcionários devem ser os índices do vetor.

import java.util.Arrays;

public class Funcionarios {

    public static void main(String[] args) {

        String funcionarios[] = new String[5];
        funcionarios[0] = "Joao Paulo";
        funcionarios[1] = "Fabiana Silva";
        funcionarios[2] = "Jessica Pereira";
        funcionarios[3] = "Marcelo Falcao";
        funcionarios[4] = "Fabio Santos";

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Bem-vindo ao Mundo do TI, coder " + (i + 1) + " = " + funcionarios[i]);
        }

    }
}