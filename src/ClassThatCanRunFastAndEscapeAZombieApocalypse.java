public class ClassThatCanRunFastAndEscapeAZombieApocalypse {
    public static void main(String[] args) {
        int count = 0;
        int totalInside = 0;
        while (count <= 1000000) {
            double pointX = Math.random();
            double pointY = Math.random();
            if (Math.sqrt((Math.pow(pointX, 2)) + (Math.pow(pointY, 2))) <= 1) {
                totalInside++;
            }
            count++;
        }
        double result = ((double) totalInside/count) * 4;
        System.out.println("Result: " + result);
    }
}