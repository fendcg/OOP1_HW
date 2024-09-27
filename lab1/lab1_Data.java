package lab1;
import lab1.*;
public class lab1_Data {
    private double sum = 0.0;
    private double max = Double.NEGATIVE_INFINITY;
    private int count = 0;
    public lab1_Data() {}

    public void addValue(double val){
        sum += val;
        count++;
        if (val > max){
            max = val;
        }
    }
    public double getAverage() {
        if (count != 0) {
            return sum / count;
        }
        else {return 0;}
    }
    public double getMax() {
        if (max != Double.NEGATIVE_INFINITY){
        return max;
        }
        else{
            return 0;
        }
    }
}
