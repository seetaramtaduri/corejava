class Matrix {
  public static void main(String args[]) {
    int a[][] = {
                         { 1, 2, 3, 4 },
                         { 5, 4, 3, 2 },
                         { 2,  3, 2, 3 },
                         { 0, 1, 3, 3 }
                     };
    int i, j;

    for(i=0; i<4; i++) {
      for(j=0; j<4; j++)
        System.out.print(a[i][j] + " ");
      System.out.println();
    }
  }
}
