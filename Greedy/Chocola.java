
import java.util.*;

// We are given a bar of chocolate composed of MxN square pieces.
// One should break the chocolate into single squares.
// Each break of a part of the chocolate is charged a cost expressed by a positive integer. This cost does not depend on the size of the part that is being broken but inly on the line the break goes on.
// Let us denote the costs of breaking along consecutive vertical lines with x1, x2, ..., xM-1 and along horizontal lines with y1, y2, ..., yN-1.
// Compute the minimal cost of breaking the whole chocolate into single squares.

public class Chocola {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer cost_vert[] = {2, 1, 3, 1, 4};
        Integer cost_hori[] = {4, 1, 2};

        Arrays.sort(cost_vert, Collections.reverseOrder());
        Arrays.sort(cost_hori, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h < cost_hori.length && v < cost_vert.length){
            if (cost_vert[v] <= cost_hori[h]){
                cost += (cost_hori[h]*vp);
                hp++;
                h++;
            } else{
                cost += (cost_vert[v]*hp);
                vp++;
                v++;
            }
        }

        while(h < cost_hori.length){
            cost += (cost_hori[h]*vp);
            hp++;
            h++;
        }

        while(v < cost_vert.length){
            cost += (cost_vert[v]*hp);
            vp++;
            v++;
        }

        System.out.println("Min Cost of cuts: "+cost);
    }
}
