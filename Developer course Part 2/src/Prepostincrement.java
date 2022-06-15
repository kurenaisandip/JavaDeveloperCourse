public class Prepostincrement {

    public static void main(String[] args)
    {
     int x = 0 , y = 0;

     x = x  + 1; // x +=1; same as x++;

     y = -3;
     y--;

     y /= 3;  // y = y/3;
     y *= 2;  // y = y*2;

        // Post increment

        y++; // y = y + 1;

        // pre increment
        ++y; // Pre increment

     System.out.println(""+x);
     System.out.println(""+y);
    }
}
