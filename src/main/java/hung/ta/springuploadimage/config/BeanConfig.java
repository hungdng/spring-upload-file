package hung.ta.springuploadimage.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author HUNGTA on 10/30/17 - 11:19 PM
 * @project spring-upload-image
 */
@Configuration
//@EnableWebMvc
@ComponentScan
public class BeanConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/upload/**")
                .addResourceLocations(System.getProperty("user.dir") + "/upload-image/");
    }
}
