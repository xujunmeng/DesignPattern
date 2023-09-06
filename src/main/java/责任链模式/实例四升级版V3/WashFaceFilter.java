package 责任链模式.实例四升级版V3;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class WashFaceFilter implements IPrepareFilter {

    private IPrepareFilter nextPrepareFilter;

    @Override
    public IPrepareFilter setNext(IPrepareFilter nextPrepareFilter) {
        this.nextPrepareFilter = nextPrepareFilter;
        return nextPrepareFilter;
    }

    @Override
    public void doHandle(PreparationList preparationList) {
        if (preparationList.isWashFace()) {
            System.out.println("洗脸");
        }
        if (true) {
            return;
        }

        nextPrepareFilter.doHandle(preparationList);
    }


}
