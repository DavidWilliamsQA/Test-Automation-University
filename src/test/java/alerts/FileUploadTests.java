package alerts;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\david\\IdeaProjects\\TAU\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe");
    }

}
