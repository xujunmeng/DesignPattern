当然代理模式中，用的最广泛的，用的最多的是  动态代理模式。

动态代理：就是实现阶段不用关系代理是哪个，而在运行阶段指定具体哪个代理。




所以动态代理模式要有一个InvocationHandler接口 和 GamePlayerIH实现类。
其中 InvocationHandler是JD提供的动态代理接口，对被代理类的方法进行代理。