public class AnonymousClass {
    public static void main(String[] args) {

//        Anonymous Class = A class that doesn't have a name , cannot be reused.
//                          Add custom behaviour without having to create a new class.
//                          Often used for one time uses (TimeTask, Runnable, callbacks).


      Dog2 dog2 = new Dog2();
      dog2.speak();

      // Now what if there is different dog that is different from the rest.

        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();

        // The above is a lot of work to create whole new
        // class for just one unique object

        Dog2 dog3 = new Dog2() {       // Within these curly braces you can define any features
            @Override                 // or override any methods . This anonymous class annot be reused
            void speak(){
                System.out.println("Scooby Doo says Roof Roof!");
            }
        };

        dog3.speak();

    }
}
