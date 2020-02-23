package day50;

public class Subtraction extends Question {

    public Subtraction(int num1, int num2) {
        super("subtraction question","-");
    this.num1 = num1;
    this.num2 = num2;

    }

    @Override
    void calculate() {
        answer = Math.max(num1,num2)-Math.min(num1,num2);
    this.calculated=true;
    }

    @Override
    public String toString() {
        if(calculated) return  super.toString() + num1 + operator +  num2 +  "=" +  answer;
        return super.toString() + num1 + operator +  num2 +  "=";
    }
}
