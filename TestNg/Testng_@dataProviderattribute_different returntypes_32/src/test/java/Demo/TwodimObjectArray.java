package Demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwodimObjectArray {

    @Test(priority = 1, dataProvider = "cred")
    public void general(Object usermail, Object password) {
        System.out.println(usermail + " | " + password);
    }

    @DataProvider(name = "cred")
    public Object[][] dataset() {

        Object[][] data = {{"2dim-ObjArrray-1", "2"},
        					{"2dim-ObjArrray-3", "4"},
        					{"2dim-ObjArrray-5", "6"}};

        return data;
    }
}
