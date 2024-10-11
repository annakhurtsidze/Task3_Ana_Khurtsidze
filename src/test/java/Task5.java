public class Task5 {
    public static void main(String[] args) {
        double [] score = {81, 78, 100, 25, 36};
        double [] weight = {0.2,  0.2, 0.4, 0.1, 0.1 };


        double sum = 0;
        double weightSum = 0;
        for(int i=0; i<score.length; i++){
                sum+= score[i]*weight[i];
                weightSum+=weight[i];
        }

        double weightedAverage = sum/weightSum;

        System.out.println("Weighted average is: " +weightedAverage);
    }
}
