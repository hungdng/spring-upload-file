package hung.ta.springuploadimage;

import hung.ta.springuploadimage.controllers.UploadFileController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class SpringUploadImageApplication {

	public static void main(String[] args) throws IOException {
		new File(UploadFileController.UPLOADED_FOLDER).mkdirs();
		SpringApplication.run(SpringUploadImageApplication.class, args);
	}

}
