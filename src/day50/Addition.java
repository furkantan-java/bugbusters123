package day50;

public class Addition extends Question{


    public Addition( int num1, int num2) {
        super("addition question", "+");
        this.num1 = num1;
        this.num2 = num2;
        calculate();
    }



    @Override
    void calculate() {
this.answer = --num1 + num2;
this.calculated = true;
    }

    @Override
    public String toString() {
        if(calculated) return  num1 + operator +  num2 +  "=" +  answer;
        return num1 + operator +  num2 +  "=";
    }
}
