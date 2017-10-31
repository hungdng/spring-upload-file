package hung.ta.springuploadimage;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author HUNGTA on 10/29/17 - 8:09 PM
 * @project spring-upload-image
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringUploadImageApplication.class);
    }
}
