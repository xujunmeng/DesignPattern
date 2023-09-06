package 责任链模式.实例四;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class HaveBreakfastFilter extends AbstractPrepareFilter {

    public HaveBreakfastFilter(AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PreparationList preparationList) {
        if (preparationList.isHaveBreakfast()) {
            System.out.println("吃早餐");
        }

    }

}
