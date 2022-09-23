package gameRotLa;

public class room {

    int roomx;
    int roomy;
    int roomz;

    boolean treasureTF;

    int numorbit;

    int numseeker;

    int numblinker;


    room(int roomzz, int roomyy, int roomxx, boolean tf)
    {
        this.roomz = roomzz;
        this.roomy = roomyy;
        this.roomx = roomxx;
        this.treasureTF = tf;
        this.numorbit = 0;
        this.numseeker = 0;
        this.numblinker = 0;



    }

    void changeOr(int ino){
        numorbit = numorbit +ino;
    }

    void changeBl(int ino){
        numblinker = numblinker +ino;
    }

    void changeSeek(int ino){
        numseeker = numseeker +ino;

    }

    void updatetreasureTrue(){
        treasureTF = true;

    }

    void updatetreasureFalse(){
        treasureTF = false;

    }



    int getx() {
        return roomx;
    }

    int gety() {
        return roomy;
    }

    int getz() {
        return roomz;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        room[] facrooms = new room[37];
        facrooms[0]= new room(0, 1, 1, false); //entrance or center of 0
        facrooms[1]= new room(1, 0, 0, false);
        facrooms[2]= new room(1, 0, 1, false);
        facrooms[3]= new room(1, 0, 2, false);
        facrooms[4]= new room(1, 1, 0, false);
        facrooms[5]= new room(1, 1, 1, false); //center of 1
        facrooms[6]= new room(1, 1, 2, false);
        facrooms[7]= new room(1, 2, 0, false);
        facrooms[8]= new room(1, 2, 1, false);
        facrooms[9]= new room(1, 2, 2, false);
        facrooms[10]= new room(2, 0, 0, false);
        facrooms[11]= new room(2, 0, 1, false);
        facrooms[12]= new room(2, 0, 2, false);
        facrooms[13]= new room(2, 1, 0, false);
        facrooms[14]= new room(2, 1, 1, false); //second floor center
        facrooms[15]= new room(2, 1, 2, false);
        facrooms[16]= new room(2, 2, 0, false);
        facrooms[17]= new room(2, 2, 1, false);
        facrooms[18]= new room(2, 2, 2, false);
        facrooms[19]= new room(3, 0, 0, false);
        facrooms[20]= new room(3, 0, 1, false);
        facrooms[21]= new room(3, 0, 2, false);
        facrooms[22]= new room(3, 1, 0, false);
        facrooms[23]= new room(3, 1, 1, false); //third floor center
        facrooms[24]= new room(3, 1, 2, false);
        facrooms[25]= new room(3, 2, 0, false);
        facrooms[26]= new room(3, 2, 1, false);
        facrooms[27]= new room(3, 2, 2, false);
        facrooms[28]= new room(4, 0, 0, false);
        facrooms[29]= new room(4, 0, 1, false);
        facrooms[30]= new room(4, 0, 2, false);
        facrooms[31]= new room(4, 1, 0, false);
        facrooms[32]= new room(4, 1, 1, false); //4th center
        facrooms[33]= new room(4, 1, 2, false);
        facrooms[34]= new room(4, 2, 0, false);
        facrooms[35]= new room(4, 2, 1, false);
        facrooms[36]= new room(4, 2, 2, false);

        treasure[] treasurearr;
        treasurearr = new treasure[10];


        for (int k = 0; k<10; k++){
            treasurearr[k] = new treasure();
            treasurearr[k].spawn(); //spawn treasures in random places
        }

        for(int i = 0; i<36; i++){

            for(int j = 0; j<10; j++){

                if (treasurearr[j].findX() == facrooms[i].getx() && treasurearr[j].findY() == facrooms[i].gety() && treasurearr[j].findZ() == facrooms[i].getz() ){
                    facrooms[i].updatetreasureTrue();
                }
            }



        }

        orbiter[] orbiters;
        orbiters = new orbiter[4];
        seeker[] seekers;
        seekers = new seeker[4];
        blinker[] blinkers;
        blinkers = new blinker[4];



        for (int k = 0; k<4; k++){
            orbiters[k] = new orbiter();
            orbiters[k].spawn();
            seekers[k] = new seeker();
            seekers[k].spawn();
            blinkers[k] = new blinker();
            blinkers[k].spawn();
        }

        for(int i = 0; i<36; i++){

            for(int j = 0; j<4; j++){

                if (orbiters[j].findxc() == facrooms[i].getx() && orbiters[j].findyc() == facrooms[i].gety() && orbiters[j].findzc() == facrooms[i].getz() ){
                    facrooms[i].changeOr(1);

                }
                if (seekers[j].findxc() == facrooms[i].getx() && seekers[j].findyc() == facrooms[i].gety() && seekers[j].findzc() == facrooms[i].getz() ){
                    facrooms[i].changeSeek(1);

                }

                if (blinkers[j].findxc() == facrooms[i].getx() && blinkers[j].findyc() == facrooms[i].gety() && blinkers[j].findzc() == facrooms[i].getz() ){
                    facrooms[i].changeBl(1);

                }

            } //mark all the rooms where the monsters are



        }







    }

}
