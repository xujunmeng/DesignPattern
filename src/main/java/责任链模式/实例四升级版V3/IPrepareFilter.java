package 责任链模式.实例四升级版V3;

/**
 *
 * https://www.cnblogs.com/xrq730/p/10633761.html
 *
 * 接着看一下使用责任链模式的写法，既然责任链模式的特点是“链上的每个对象都持有下一个对象的引用”，那么我们就这么做。
 *
 * 先抽象出一个AbstractPrepareFilter：
 *
 * 留一个抽象方法prepare给子类去实现，在抽象类中持有下一个对象的引用nextPrepareFilter，如果有，则执行；如果没有表示链上所有对象都执行完毕，执行Study类的study()方法：
 *
 * @author xujunmeng
 * @date 2023/9/6
 */
public interface IPrepareFilter {

    IPrepareFilter setNext(IPrepareFilter nextPrepareFilter);

    void doHandle(PreparationList preparationList);

}
