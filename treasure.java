package gameRotLa;
import java.util.Random;

public class treasure {
    int zcoor;
    int ycoor;
    int xcoor;

    void spawn(){
        Random rand = new Random(); //instance of random class
        int upperbound = 5;
        int ub = 3;
        int ubs = 3;
        //generate random values from 0-4
        zcoor = rand.nextInt(upperbound);
        if (zcoor == 0){
            xcoor = 1;
            ycoor = 1;
        }

        else {
            ycoor = rand.nextInt(ub);
            xcoor = rand.nextInt(ubs);
        }

    }

    int findZ(){
        return zcoor;
    }

    int findY(){
        return ycoor;

    }

    int findX(){
        return xcoor;

    }





}

