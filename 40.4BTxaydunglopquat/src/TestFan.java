public class TestFan {
    public static void main(String[] args) {
        Fan testfan1 = new Fan();
        testfan1.setSpeed(Fan.fast);
        testfan1.setRadius(10);
        testfan1.setColor("yellow");
        testfan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.medium);
    }
}

