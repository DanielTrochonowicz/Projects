package task2.frogJump;

public class FrogJump {

    public int frogJump(int X, int Y, int D) {
        if ((Y-X)%D==0){
            return (Y-X)/D;
        }
        return (Y-X)/D+1;
    }
}
