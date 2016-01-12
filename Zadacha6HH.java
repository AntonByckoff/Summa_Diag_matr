class Matrica{
    void SostMaatr(){
      int n=1091;
      int[][] a=new int[n][n];
      int ch;
      boolean b;
      // координаты центра
      int x,y;
      x=n/2+1-1;
      y=n/2+1-1;
      int i,j;
      i=x;
      j=y;
      ch=1;
      a[i][j]=ch;   
      j++;
      ch++;
      a[i][j]=ch;
      b=true; 
      while(b==true){
       while(i+1<n&b==true){
       i++;
       ch++;
       a[i][j]=ch;
       if (a[i][j-1]==0){break;}
       if(n<=i+1){b=false;}
       }
       while(0<=j-1&b==true){
       j--;
       ch++;
       a[i][j]=ch; 
       if (a[i-1][j]==0){break;}
       if(j-1<0){b=false;}      
       }
       
      while(0<=i-1&b==true){
       i--;
       ch++;
       a[i][j]=ch; 
       if (a[i][j+1]==0){break;}
       if (i-1<0){b=false;}
      }
      
       while(j+1<n&b==true){
       j++;
       ch++;
       a[i][j]=ch;
       if (a[i+1][j]==0){break;}
       if (n<=j+1){b=false;}
       }
      }
      
    //  Vivod(a,n);
      SumChisDiag(a,x,y,n);
    }
   private void Vivod(int[][] a,int n){
       for (int i=0;i<n;i++){
           for (int j=0;j<n;j++){
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
        System.out.println();
   }  
   
   private void SumChisDiag(int [][] a,int x,int y,int n){
      long sum;
      sum=0;
      for(int i=0; i<n;i++){
        sum+=a[i][i];  
      }
     // System.out.println("sum="+sum);     
      
      for(int i=0; i<n;i++){
        sum+=a[i][n-1-i];  
        //System.out.println("a= "+a[n-1-i][n-1-i]);
      } 
      sum=sum-a[x][y];
       System.out.println("sum="+sum);
   }
}
public class Zadacha6HH {
    public static void main(String[] args) {
      Matrica m=new Matrica();
      m.SostMaatr();
    }
    
}
