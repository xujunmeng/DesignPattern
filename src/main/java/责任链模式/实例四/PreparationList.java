package 责任链模式.实例四;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class PreparationList {

    private boolean haveBreakfast;

    private boolean washFace;

    private boolean washHair;

    public boolean isHaveBreakfast() {
        return this.haveBreakfast;
    }

    public boolean isWashFace() {
        return this.washFace;
    }

    public boolean isWashHair() {
        return this.washHair;
    }

    public void setWashFace(boolean b) {
        this.washFace = b;
    }

    public void setWashHair(boolean b) {
        this.washHair = b;
    }

    public void setHaveBreakfast(boolean b) {
        this.haveBreakfast = b;
    }
}
