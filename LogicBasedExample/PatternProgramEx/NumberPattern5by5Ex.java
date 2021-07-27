package LogicBasedExample.PatternProgramEx;

class NumberPattern5by5Ex {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(i+1 +" ");
            }
            System.out.println();
        }
    }
}

/*
    Output:
    1 1 1 1 1 
    2 2 2 2 2
    3 3 3 3 3
    4 4 4 4 4
    5 5 5 5 5
*/