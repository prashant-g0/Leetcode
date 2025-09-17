// A person is walking on a 2D plane starting from the origin (0,0).
// They can move only in the four cardinal directions:
// 'n' : move north (increase y by 1)
// 's' : move south (decrease y by 1)
// 'e' : move east (increase x by 1)
// 'w' : move west (decrease x by 1)

// Given a string path consisting of these characters, 
// your task is to calculate the shortest straight-line distance from the origin (0,0) to the final position after following the entire path.
// You must return the distance as a floating-point value.

// Example: 
// Input: path = "wneenesennn"
// Output: 5.0

//Code:

import java.lang.Math;
class Main {
    public static float shortestPath(String path){
        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='n') y += 1;
            else if(path.charAt(i)=='s') y -= 1;
            else if(path.charAt(i)=='e') x += 1;
            else if(path.charAt(i)=='w') x -= 1;
        }
        double res = Math.sqrt((x*x)+(y*y));
        return (float)res;
    }
    public static void main(String[] args) {
        String path = "wneenesennn";
        System.out.print(shortestPath(path));
    }
}
