import java.util.ArrayList;

public class BeautifulArray {
    
    public static int[] beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for(int i=2; i<=n; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            for(int e : ans){
                if(2*e<=n) temp.add(2*e);
            }

            for(int e : ans){
                if((2*e)-1<=n) temp.add((2*e)-1);
            }

            ans = temp;
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        int [] res = beautifulArray(n);
        
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }

}
