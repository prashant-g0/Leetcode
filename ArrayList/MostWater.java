import java.util.ArrayList;

public class MostWater {

    public static int calculate(ArrayList<Integer> height){
        int n = 0, m = height.size()-1;
        int area = Integer.MIN_VALUE;

        while (n<m){
            int width = m-n;
            int length = Math.min(height.get(n), height.get(m));
            
            area = Math.max(area, width*length);

            if(height.get(n)<height.get(m)) n++;
            else m--;
        }

        return area;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1); height.add(8); height.add(6);
        height.add(2); height.add(5); height.add(4);
        height.add(8); height.add(3); height.add(7);

        int area = calculate(height);
        System.out.println("Max water: " + area + "L");
    }
}
