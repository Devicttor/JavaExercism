package Exercicios.Excercicio1.Exercicio2;
public class App {
    public static void main (String[] args){
        Operation op1 = Operation.SUM;
        Operation op2 = Operation.SUBTRACT;
        Operation op3 = Operation.MULTIPLY;
        Operation op4 = Operation.DIVIDE;
        OperationMath[] listOperation = {op1,op2,op3,op4};
        double[] numbers = {3.6,4.2,88.3,42.8,35,21};

        for(int i = 0; i < listOperation.length ; i++) {
            System.out.println(listOperation[i].calculate(numbers[i], numbers[i+1]));
        }


    }
}
