package javaapplication5;

public class JavaApplication5 {

  
    public static void main(String[] args) {
    ///Sum All Elemten In Array 
    int[] array=new int[10];
     int  sum=0;
    for(int i=0;i<10;i++){
      array[i]=i;
        sum=sum+array[i];
    }
    System.out.println("Sum= "+sum);
    
    ///Sum Number Even And Number Odd
     int[] array2=new int[10];
     int  sum2=0;
     int  sum3=0;
    for(int i=0;i<10;i++){
      array[i]=i;
        if(array[i]%2==0){
        sum2=sum2+array[i];
        }else{
        sum3=sum3+array[i];
        }
    }
    System.out.println("Sum Even= "+sum2);
    System.out.println("Sum Odd= " +sum3);
    
    }
    
}
