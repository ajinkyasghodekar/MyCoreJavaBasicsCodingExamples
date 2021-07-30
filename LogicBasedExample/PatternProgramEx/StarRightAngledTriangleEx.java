package LogicBasedExample.PatternProgramEx;

public class StarRightAngledTriangleEx {
    public static void main(String[] args) {
        int i, j, n=6;
        
        for(i=0;i<n;i++){
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}

