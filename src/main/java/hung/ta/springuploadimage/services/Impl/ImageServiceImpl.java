package hung.ta.springuploadimage.services.Impl;

import hung.ta.springuploadimage.entities.Image;
import hung.ta.springuploadimage.repositories.ImageRepository;
import hung.ta.springuploadimage.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author HUNGTA on 10/29/17 - 7:16 PM
 * @project spring-upload-image
 */
@Service
@Transactional
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image createImage(String path) {
        Image image = new Image(path);
        return imageRepository.save(image);
    }

    @Override
    public List<Image> getImages() {
        return imageRepository.findAll();
    }
}
