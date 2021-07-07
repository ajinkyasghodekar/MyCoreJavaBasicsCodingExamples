package Enum;

public class MainApp {
    public static void main(String[] args) {
        // Color c = Color.red;
        // System.out.println(c);

        colorNames [] c = colorNames.values();
        for (colorNames color : c) {
            System.out.println("The color is: "+color +" and its index value is: "+color.ordinal());
        }
    }
}
