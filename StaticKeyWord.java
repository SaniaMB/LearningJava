
public class StaticKeyWord {
    public static void main(String[] args) {

//    Static = Makes a variable or method belong to the class
//             rather than to any specific object
//             Commonly used for utility methods or shared resources.

          Friend friend1 = new Friend("Spongebob");
          Friend friend2 = new Friend("Patrick");
          Friend friend3 = new Friend("Sania");
          Friend friend4 = new Friend("Bro code");

          System.out.println(friend1.name);
          System.out.println(friend2.name);
          System.out.println(friend3.name);
          System.out.println(friend4.name);
          System.out.println(Friend.numOfFriends);

          Friend.showFriends();


    }
}
