package co.develhope.GenericWildcards02;

public class GenericsClass <T>{
   private T t;

    /**
     * get method
     * @return the instance t
     */
   public T getT(){

       return t;
   }

    /**
     * set method -> give the possibility to set the T type variables
     * @param valueToSet T-type variable
     */
   public void setT(T valueToSet){
       this.t = valueToSet;
   }

   public static <T> boolean isEqual(GenericsClass gc1 , GenericsClass gc2){
        
       return gc1.getT().equals(gc2.getT());
   }
}
