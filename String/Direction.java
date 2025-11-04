import java.util.*;;
public class Direction {
    public static float getSortest(String str){
        int x=0, y=0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            //South
            if (dir == 'S') {
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            else if (dir == 'W') {
                x--;
            }
            //East
            else{
                x++;
            }
        }
         int X2 = x*x;
         int Y2 = y*y;
         return (float)Math.sqrt(X2+Y2);
    }
    
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getSortest(str));
    }
}
