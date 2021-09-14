import java.util.Arrays;

public class Projetos {

    public static void main(String[] args) {

        String projeto [] = new String [4];
        projeto[0] = "frontEnd";
        projeto[1] = "backEnd";
        projeto[2] = "bancoDeDados";
        projeto[3] = "QAOuTester";
        System.out.println(Arrays.toString(projeto));

        for(int y = 0; y < projeto.length; y++){
        projeto[1] = "QAOuTester";
        projeto[3] = "backEnd";
            System.out.println("Projeto " + (y+1) + " = " + projeto[y]);
        }

    }
}





//[tipo] [nome] = new [tipo] ["tamanho"];

//   System.out.println(Arrays.toString(projeto));

//        for(int y = 0; y < projeto.length; y++){
//            if(projeto[y] == "backEnd") {
//                projeto[y] = "QAOuTester";
////                continue;
//            }if (projeto[y] == "QAOuTester"){
//                projeto[y] = "backEnd";
//            }