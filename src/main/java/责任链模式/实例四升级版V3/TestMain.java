package 责任链模式.实例四升级版V3;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class TestMain {

    public static void main(String[] args) {
        PreparationList preparationList = new PreparationList();
        preparationList.setWashFace(true);
        preparationList.setWashHair(true);
        preparationList.setHaveBreakfast(true);

        IPrepareFilter haveBreakfastFilter = new HaveBreakfastFilter();
        IPrepareFilter washFaceFilter = new WashFaceFilter();
        IPrepareFilter washHairFilter = new WashHairFilter();

        washFaceFilter.setNext(washHairFilter).setNext(haveBreakfastFilter);

        washFaceFilter.doHandle(preparationList);
    }

}
