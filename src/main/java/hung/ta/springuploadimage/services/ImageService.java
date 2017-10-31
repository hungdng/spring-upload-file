package hung.ta.springuploadimage.services;

import hung.ta.springuploadimage.entities.Image;

import java.util.List;

/**
 * @author HUNGTA on 10/29/17 - 7:16 PM
 * @project spring-upload-image
 */
public interface ImageService {
    Image createImage(String path);
    List<Image> getImages();
}
