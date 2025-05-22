public  class Car1 {

   String model;
   String color;

   Car1(String model , String color){
       this.model = model;
       this.color = color;
   }

   void drive(){
       System.out.println("You drive the " + this.color + " " + this.model);
   }

   @Override
    public String toString(){
       return this.color + " " + this.model;
   }

   String getModel(){
       return this.model;
   }

   String getColor(){
       return this.color;
   }

   String setColor(String color){
       return this.color = color;
   }

}
