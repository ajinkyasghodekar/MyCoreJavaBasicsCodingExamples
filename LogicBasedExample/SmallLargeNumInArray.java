package LogicBasedExample;
public class SmallLargeNumInArray {
    public static void main(String[] args) {
        int [] arr=new int[]{10, 20,100,5,21};
        int small=arr[0];
        int large=arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>large)
            large=arr[i];
            else if(arr[i]<small)
            small=arr[i];
        }
        System.out.println("samll number is: " +small);
        System.out.println("large number is: " +large);
    }
}