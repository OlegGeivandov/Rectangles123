import java.util.Random;

public class Rectangle {
    int sideA;
    int sideB;

//    public void setSideA(int sideA) {
//
//            this.sideA = sideA;
//    }
//
//    public void setSideB(int sideB) {
//        this.sideB = sideB;
//    }

    public Rectangle() {
        this.sideA = new Random().nextInt(0,20);
        this.sideB = new Random().nextInt(0,20);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

        public int area(){
        return sideA*sideB;
    }


}
