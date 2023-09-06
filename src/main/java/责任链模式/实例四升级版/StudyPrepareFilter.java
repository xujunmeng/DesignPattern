package 责任链模式.实例四升级版;

/**
 *
 * 至此使用责任链模式修改这段逻辑完成，看到我们完成了学习与准备工作之间的解耦，即核心的事情我们是要学习，此时无论加多少准备工作，都不需要修改study方法，只需要修改调用方即可。
 *
 * 但是这种写法好吗？个人认为这种写法虽然符合开闭原则，但是两个明显的缺点对客户端并不友好：
 *
 * 增加、减少责任链对象，需要修改客户端代码，即比如我这边想要增加一个打扫屋子的操作，那么testResponsibility()方法需要改动
 * AbstractPrepareFilter washFaceFilter = new WashFaceFilter(haveBreakfastFilter)这种调用方式不够优雅，客户端需要思考一下，到底真正调用的时候调用三个Filter中的哪个Filter
 * 为此，我们来个终极版的、升级版的责任链模式。
 *
 * 上面我们写了一个责任链模式，这种是一种初级的符合责任链模式的写法，最后也写了，这种写法是有明显的缺点的，那么接着我们看一下升级版的责任链模式如何写，解决上述问题。
 *
 * 以下的写法也是Servlet的实现方式，首先还是抽象一个Filter：
 *
 * @author xujunmeng
 * @date 2023/9/6
 */
public interface StudyPrepareFilter {

    public void doFilter(PreparationList preparationList, FilterChain filterChain);

}
