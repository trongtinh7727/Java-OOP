/**
 * Person
 */
public abstract class  Person {
   protected String name;
   protected String ID;
   protected String address;

   public Person(){

   }
   public Person(String name,String ID,String address){
      this.name = name;
      this.ID = ID;
      this.address = address;
   }
   @Override
   public String toString() {
      return this.name + " - " + this.ID +  " - " + this.address ;
   }
}