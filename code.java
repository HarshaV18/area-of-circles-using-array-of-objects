import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Circle{
    double r;
    
    public Circle(double r){
        this.r=r;
    }
    public double getarea(){
        return 3.14*r*r;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        
        Circle[] objects=new Circle[n];
        for(int i=0;i<n;i++){
            double r=obj.nextDouble();
            objects[i]=new Circle(r);
        }
        for(int i=0;i<n;i++){
            double area=objects[i].getarea();
            if(area>30.0){
                System.out.format("%.4f",area);
            }
        }
    }
}
