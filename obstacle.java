import java.util.Scanner;

class obstacle{

     int countPath(int [][]A){
           if(A[0][0] ==-1){
              return 0;}
           int r = A.length;
           int c = A[0].length;
           int [][]ct = new int[r+1][c+1];
           ct[0][0] = 1;
           for (int i=1;i<r;i++){
              if(A[i][0] ==0){
                 ct[i][0] = ct[i-1][0];}
              else{ ct[i][0] =0;}
                  }
            for (int j=1;j<c;j++){
                if(A[0][j]==0){
                   ct[0][j] = ct[0][j-1];}
                 else{ct[0][j] = 0;}
                 }

          for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
               if(A[i][j]==0){
                 ct[i][j] = ct[i-1][j] + ct[i][j-1];
                 }else{ct[i][j]=0;}}}
       return ct[r-1][c-1];
}

  public static void main(String []args){
          obstacle pr = new obstacle();
          int n=3;
          int m=2;
          int p = 1 ;
          int q = 1;
          int [][]arr = new int[n+1][m+1];
         
           for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==p && j==q){
                arr[i][j] = -1;}
               else{arr[i][j]=0;}
               }}
       System.out.println(2*pr.countPath(arr));
}

}
