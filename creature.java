package gameRotLa;


public abstract class creature { //superclass
    int xpos;
    int ypos;
    int zpos;
    abstract void spawn(); //abstract function/overload
    abstract void move();

    int findxc(){
        return xpos;
    }

    int findyc(){
        return ypos;

    }

    int findzc(){
        return zpos;

    }




}
class orbiter extends creature{ //subclass
    void spawn() {
        int min = 0;
        int max = 2;
        xpos = (int)Math.floor(Math.random()*(max-min+1)+min);
        ypos = (int)Math.floor(Math.random()*(max-min+1)+min);
        int zmin = 1;
        zpos = (int)Math.floor(Math.random()*(max-zmin+1) + zmin);

        while(xpos == 1 && ypos == 1){

            xpos = (int)Math.floor(Math.random()*(max-min+1)+min);
            ypos = (int)Math.floor(Math.random()*(max-min+1)+min);

        }




    }

    void move(){
        int min;
        int max;
        if(xpos == 1) {
            while (xpos == 1) {
                min = 0;
                max = 2;
                xpos = (int) Math.floor(Math.random() * (max - min + 1) + min);
            }
        }

        else if(ypos == 1) {
            while (ypos == 1) {
                min= 0;
                max = 2;
                ypos = (int) Math.floor(Math.random() * (max - min + 1) + min);

            }
        }

        else if (ypos == 0 && xpos == 0){
            min = 0;
            max = 1;
            int choice = (int) Math.floor(Math.random() * (max - min + 1) + min);
            if (choice == 1){
                xpos = 1;
                ypos = 0;
            }
            else{
                xpos = 0;
                ypos = 1;
            }
        }

        else if (ypos == 2 && xpos == 2){
            min = 0;
            max = 1;
            int choice = (int) Math.floor(Math.random() * (max - min + 1) + min);
            if (choice == 1){
                xpos = 2;
                ypos = 1;
            }
            else{
                xpos = 1;
                ypos = 2;
            }
        }


        else if(ypos == 0 && xpos == 2){
            min = 0;
            max = 1;
            int choice = (int) Math.floor(Math.random() * (max - min + 1) + min);
            if (choice == 1){
                xpos = 1;
                ypos = 0;
            }
            else{
                xpos = 2;
                ypos = 1;
            }
        }

        else if (xpos == 0 && ypos == 2){
            min = 0;
            max = 1;
            int choice = (int) Math.floor(Math.random() * (max - min + 1) + min);
            if (choice == 1){
                xpos = 1;
                ypos = 2;
            }
            else{
                xpos = 0;
                ypos = 1;
            }

        }


        }






}

class seeker extends creature{ //subclass
    void spawn() {
        int min = 0;
        int max = 2;
        xpos = (int)Math.floor(Math.random()*(max-min+1)+min);
        ypos = (int)Math.floor(Math.random()*(max-min+1)+min);
        int zmin = 1;
        zpos = (int)Math.floor(Math.random()*(max-zmin+1) + zmin);


    }
    void move(){
        System.out.println("Hello world!");
    }



}

class blinker extends creature{ //subclass

    void spawn() {
        zpos = 4;
        int min = 0;
        int max = 2;
        xpos = (int)Math.floor(Math.random()*(max-min+1)+min);
        ypos = (int)Math.floor(Math.random()*(max-min+1)+min);

    }

    void move(){

    }

}
