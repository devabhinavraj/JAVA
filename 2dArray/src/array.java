public class array {
    public static void main(String[] args) {
        int matrix [][] = new int[3][2];
        int rows = matrix.length;
        int columns = matrix[0].length ;
        for(int i =0 ; i < rows ; i++){
            for (int j = 0 ; j < columns ; j++){
                matrix[i][j] = 10;
            }
        }

        // Traverse Array
        System.out.println("--- Printing the Matrix ---");
        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Insert element
        matrix[1][1] = 20;
        System.out.println("--- After Update ---");
        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Delete element 
        matrix[2][0] = 0;
        System.out.println("--- After Deleteing Element at [2][0] ---");
        for(int i =0 ; i < rows ; i++ ){
            for(int j = 0 ; j < columns ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        // SubArray 
        int subArray [] = matrix [1] ;
        int len = subArray.length;
        System.out.println(" ---  SubArray ---");

        for(int i = 0 ; i < len ; i++){
            System.out.print(subArray[i] + " ");
        }
        
    }
}
