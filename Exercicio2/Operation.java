package Exercicios.Excercicio1.Exercicio2;

public enum Operation implements OperationMath{

    SUM('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char simbolo = ' ';

    Operation(char simbolo) {
        this.simbolo = simbolo;
    }

     public char getSimbolo(){
        return this.simbolo;
     }

    @Override
    public String toString(){
        return "Symbol: " + this.simbolo;
    }

    @Override
    public double sum(double n1, double n2) {
        return n1+n2;
    }

    @Override
    public double subtract(double n1, double n2) {
        return n1-n2;
    }

    @Override
    public double divide(double n1, double n2){
        return n1/n2;
    }

    @Override
    public double multiply(double n1, double n2) {
        return n1*n2;
    }

    public double calculate(double n1, double n2) {
        return switch(this) {
            case SUM -> sum(n1,n2);
            case SUBTRACT -> subtract(n1,n2);
            case MULTIPLY -> multiply(n1,n2);
            case DIVIDE -> divide(n1,n2);
        };
    }



}
