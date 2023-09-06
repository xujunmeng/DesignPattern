package 责任链模式.实例四升级版V2;

/**
 * @author xujunmeng
 * @date 2023/9/6
 */
public class TestMain {

    public static void main(String[] args) {

        LoginFilter loginFilter = new LoginFilter() ;

        CharFilter charFilter = new CharFilter() ;

        GrantFilter grantFilter = new GrantFilter() ;

        FilterChain chain = new FilterChain() ;
        chain.addFilter(loginFilter).addFilter(charFilter).addFilter(grantFilter) ;

        Request request = new Request() ;
        Response response = new Response() ;
        chain.doFilter(request, response, null) ;
    }

}
