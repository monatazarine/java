public class Main {

    public static void main (String[] args){
        //matrix :
        char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};
        //display using a nested loop:
         //first loop is for the rows
        // char[] : each row is a array of characters
        // nickname each inner array "row =>{'1','2','3'}
        for (char[] row : telephone){
            for (char number : row){
                System.out.println(number);
            }
            System.out.println();
        }
    }

}



