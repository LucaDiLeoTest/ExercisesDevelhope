public class Person {
    public int age;
    public Person(){
        double randomNumber = Math.floor(Math.random()*(80-5+1)+5);
        this.age=(int) randomNumber;
        System.out.println(this.age);
    }
    public String getLifeStage() {
        if (age <= 12) {
            return " child ";
        } else if (age >= 13 && age <= 19) {
            return " teen ";
        }else if(age>=20 && age<=59){
            return " adult ";
        }else{
            return " senior adult ";
        }
    }
}
