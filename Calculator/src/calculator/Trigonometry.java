package calculator;

public class Trigonometry {
    double num;
    public double sin(double num){
        double ans=Math.sin(num);
        return ans;

    }public double cos(double num){
        double cosans=Math.cos(num);
        return cosans;
    }public double tan(double num){
        double tanans=Math.tan(num);
        return tanans;
    }public double cot(double num){
        double cotans=1/Math.tan(num);
        return cotans;
    }
}
