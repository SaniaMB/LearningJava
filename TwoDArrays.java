public class TwoDArrays {
    public static void main(String[] args) {

       /* String[] fruits = {"apple" , "orange","banana","coconut"};
        String[] vegies = {"potato","carrot","onion"};
        String[] meats  = {"chicken","pork","beef","fish"};

        String[][] groceries = {fruits , vegies , meats};
        groceries[0][0]="pineapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food +" ");
            }
            System.out.println();
        }*/

        char[][] telephone = { { '1','2','3'},
                               { '4','5','6'},
                                {'7','8','9'},
                                {'*','0','#'} };

        for(char[] rows : telephone){
            for(char number : rows ){
                System.out.print(number + " ");
            }
             System.out.println();
        }


    }
}
