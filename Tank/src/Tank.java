public class Tank {

    int x = 0, y = 0, dir = 0;  // dir=0 вправо, =1 вниз, =2 влево, =3 вверх
    int fuel, nTank;
    static int count;

    public Tank(){
        this(0,0,100);
    }

    public Tank(int x, int y) {
        this(x,y,100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;

        nTank=++count;
    }

    public void goForward(int dvigh) {
        if(Math.abs(dvigh)>fuel){ dvigh=fuel;}
        if (dir == 0) {
            x += dvigh;
        }
        if (dir == 1) {
            y += dvigh;
        }
        if (dir == 2) {
            x -= dvigh;
        }
        if (dir == 3) {
            y -= dvigh;
        }
        fuel-=dvigh;
    }

    public void goBackward(int dvigh) {
        goForward(-dvigh);
    }

    public void turnRight() {
        if (dir == 3) {
            dir = 0;
        } else {
            dir++;
        }
            }

    public void turnLeft() {
        if (dir == 0) {
            dir = 3;
        } else {
            dir--;
        }
            }

    public void printPosition() {
        System.out.printf("The Tank T34-%d is at %d, %d now.%n", nTank, x, y);
    }
}
