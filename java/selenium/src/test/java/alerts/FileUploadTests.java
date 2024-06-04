package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/home/andreza/Studying/java/selenium/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFile(), "chromedriver", "Uploaded files incorrect");
    }



}
