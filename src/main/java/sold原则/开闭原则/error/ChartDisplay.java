package sold原则.开闭原则.error;

/**
 * @author james
 * @date 2020/7/15
 */
public class ChartDisplay {

    public void display(String type) {
        if (type.equals("pie")) {
            PieChart chart = new PieChart();
            chart.display();
        } else if (type.equals("bar")) {
            BarChart chart = new BarChart();
            chart.display();
        }
    }

}
