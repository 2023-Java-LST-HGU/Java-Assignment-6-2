package logic;


public class Calculator {
    public static int time(int a, int b){

        return a * b ;
    }

    public static double divide(int a, int b){
        if(b==0){
            return 0.0;
        }else{

            return (double)a/b;

        }
    }
}
