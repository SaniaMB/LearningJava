public class StringMethods {
    public static void main(String[] args) {

    String name = "Password";

    /*
    int length = name.length();
    char letter = name.charAt(2);
    int index = name.indexOf("o"); //first occurrence
    int lastIndex = name.lastIndexOf("o");

    name = name.toUpperCase();
    name = name.toLowerCase();
    name = name.trim();
    name = name.replace("o","a");

     System.out.println(name.isEmpty());

    if(name.isEmpty()){
        System.out.println("Your name is empty!");
    }else{
        System.out.println("Its full!");
    }

    if(name.contains("")){
        System.out.println("Your name contains a space!!");
    }else{
        System.out.println("Your name doesn't contain any space");

    } */

    if(name.equalsIgnoreCase("password")){    //name.equals("password" -> Is case sensitive
        System.out.println("Your name can't be password!");
    }else{
        System.out.println("Hello " + name);
    }



    }
}
