public class Main {

    public static void checkScore(double score)throws ArithmeticException{
        if(score > 0 && score <=50){
            System.out.println("Average score");
        }else if(score > 50 && score <= 100){
            System.out.println("Very good score");
        }else{
            throw new ArithmeticException("Score is out of scale!");
        }
    }

    public static void main(String[] args) {

        checkScore(2.15);
        checkScore(50);
        checkScore(95.02);
        checkScore(100.01);

    }
}