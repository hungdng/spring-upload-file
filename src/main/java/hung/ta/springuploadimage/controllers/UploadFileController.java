package hung.ta.springuploadimage.controllers;

import hung.ta.springuploadimage.entities.Image;
import hung.ta.springuploadimage.services.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author HUNGTA on 10/29/17 - 7:31 PM
 * @project spring-upload-image
 */
@Controller
public class UploadFileController {

    public static final Logger LOGGER = LoggerFactory.getLogger(UploadFileController.class);
    public static final String UPLOADED_FOLDER = System.getProperty("user.dir") + "/upload-image/";

    @Autowired
    private ImageService imageService;

    @GetMapping("/")
    public String index() {
        LOGGER.info("func index() called");
        return "index";
    }

    @GetMapping("/showList")
    public ModelAndView showList(ModelAndView model) {
        LOGGER.info("func showList() called");

        List<Image> images = imageService.getImages();
        model.addObject("images", images);
        model.setViewName("showList");
        return model;
    }

    @GetMapping("/Dropzone")
    public String dropzone() {
        LOGGER.info("func dropzone() called");
        return "Dropzone";
    }

    //@PostMapping("/Dropzone")
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResponseEntity<?> handleUpload(@RequestParam("file") MultipartFile file) throws IOException {
        LOGGER.info("func handleUpload() called");

        if (file.isEmpty()) {
            throw new RuntimeException();
        }

        byte[] bytes = file.getBytes();
        Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
        String pathName = file.getOriginalFilename();
        imageService.createImage(pathName);
        Files.write(path, bytes);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @ExceptionHandler(IOException.class)
    public ResponseEntity<?> handleIOException(HttpServletRequest req, HttpServletResponse res) {
        res.setStatus(HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.badRequest().build();
    }

}
