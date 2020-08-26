package 单例模式.four;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author james
 * @date 2020/8/25
 */
public class TestMain {

    public static void main(String[] args) {

        LazyInnerClassSingleton s1 = null;

        //通过类本身获得实例对象
        LazyInnerClassSingleton s2 = LazyInnerClassSingleton.getInstance();

        FileOutputStream fos = null;

        try {

            //序列化到文件中
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            //从文件中反序列化为对象
            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);

            s1 = (LazyInnerClassSingleton)ois.readObject();

            //对比结果，这里输出的结果为false
            System.out.println(s1 == s2);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
