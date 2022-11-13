public class CustomNumber {
    public int number;
    public CustomNumber(){
        this.number = (int) Math.floor(Math.random()*(12-1+1)+1);
        System.out.println(number);
    }
    public void getMultiplicationTable(){
        for(int i=12; i>=1; i--){
            System.out.println(i*number);
        }
    }
}
