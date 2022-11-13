public class Main {
    public static void main(String[] args) {

        for(MonthEnum month : MonthEnum.values()){
            if(month.toString().endsWith("y")){
                System.out.println(month.toString() + " ends with y");
            }else{System.out.println(month.toString() + " doesn't end with y");}
        }

    }
}