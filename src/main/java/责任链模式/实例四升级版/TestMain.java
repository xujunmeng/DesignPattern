package 责任链模式.实例四升级版;

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

        Study study = new Study();

        StudyPrepareFilter washFaceFilter = new WashFaceFilter();
        StudyPrepareFilter washHairFilter = new WashHairFilter();
        StudyPrepareFilter haveBreakfastFilter = new HaveBreakfastFilter();

        FilterChain filterChain = new FilterChain(study);
        filterChain.addFilter(washFaceFilter);
        filterChain.addFilter(washHairFilter);
        filterChain.addFilter(haveBreakfastFilter);

        filterChain.doFilter(preparationList, filterChain);

    }

}
