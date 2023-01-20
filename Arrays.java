public class Arrays {
    public static void main(String[]args){
        //array iteration
        String[] names = {"john","Doe"};
        String[] cars = {"bmw","benz"};
        for(int i=0;i< names.length;i++){
            System.out.println("owner "+ names[i]);
            for(int j=0;j< cars.length;){
                System.out.println("car: " + cars[j]);
                j++;
            }
        }
        //for-each loop on an array
        for(String i: cars){
            switch(i){
                case "bmw":
                    i = "volvo";
                    break;
                case "benz":
                    i = "golf";
                    break;
                default:
                    System.out.println("maping failed");
            }
            System.out.println(i);
        }
        //multidimentional arrays
        int[][] board = {{1,2,3},{3,4,7},{4,6,9}};
        //iteration
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.println(board[i][j]);
            }
        }
    }
    
}
