package 责任链模式.实例三;

/**
 * 部门经理
 * Created by james on 2017/9/18.
 */
public class DeptHandler extends ConsumeHandler {

    @Override
    public void doHandler(String user, double free) {
        if (free < 1000) {

            if (user.equals("zy")) {
                System.out.println("给予报销:" + free);
            } else {
                System.out.println("报销不通过");
            }

        } else {
            if (getNextHandler() != null) {

                getNextHandler().doHandler(user, free);
            }
        }

    }
}