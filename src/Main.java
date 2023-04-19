import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * OOM 测试1
 */
public class Main {
    static class OOMObject {

    }

    public static void main(String[] args) {
       List<OOMObject> list=new ArrayList<>();
       while (true)
       {
           list.add(new OOMObject());
       }
    }
}