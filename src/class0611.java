import geometrypackage.NoStateClass;
import geometrypackage.StaticClass;

import java.io.FileNotFoundException;
import java.io.FilePermission;

public class class0611 {
    public static void main(String[] args) {

        try {


            {
                NoStateClass noStateObj = new NoStateClass();
                if (noStateObj.doSomething1()) {
                    if (noStateObj.doSomething2()) {
                        noStateObj.doSomething3();
                    }
                }
            }

            {
                if (StaticClass.doSomething1()) {
                    if (StaticClass.doSomething2()) {
                        StaticClass.doSomething3();
                    }
                }
            }

            StaticClass.checkFile("wrwer");
        } catch (FileNotFoundException ex) {
            System.out.println("");
        } catch (Exception ex) {
            System.out.println("");
        }
    }
}
