package sold原则.开闭原则.demo;

/**
 * @author james
 * @date 2020/7/15
 */
public class Main {

    public static void main(String[] args) {
        ChartDisplay chartDisplay = new ChartDisplay();
        chartDisplay.setChart(new BarChart());
        chartDisplay.display();
    }

}
