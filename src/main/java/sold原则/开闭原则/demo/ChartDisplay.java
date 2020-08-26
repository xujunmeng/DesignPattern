package sold原则.开闭原则.demo;

/**
 * @author james
 * @date 2020/7/15
 */
public class ChartDisplay {

    private AbstractChart chart;

    public void setChart(AbstractChart chart) {
        this.chart = chart;
    }

    public void display() {
        chart.display();
    }

}
