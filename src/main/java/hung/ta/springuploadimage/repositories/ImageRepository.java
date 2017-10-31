package hung.ta.springuploadimage.repositories;

import hung.ta.springuploadimage.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HUNGTA on 10/29/17 - 7:15 PM
 * @project spring-upload-image
 */
public interface ImageRepository  extends JpaRepository<Image, Long>{
}
