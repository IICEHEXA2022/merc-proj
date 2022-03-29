package Principal; 
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
      
   int vetor[]={1,2,3,4,5,-1,-2,3,-4,-5};
   boolean vetorBool[]= new boolean[vetor.length];
   
             for(int i=0; i<vetor.length; i++){
                System.out.println(i+" a posiçao é: " +(vetor[i]>0));
                 
                vetorBool[i]= vetor[i]>0;
             }
    }
}  
                  