package 责任链模式.实例四;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class WashFaceFilter extends AbstractPrepareFilter {

    public WashFaceFilter(AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PreparationList preparationList) {
        if (preparationList.isWashFace()) {
            System.out.println("洗脸");
        }

    }

}
