package hung.ta.springuploadimage.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author HUNGTA on 10/29/17 - 7:12 PM
 * @project spring-upload-image
 */
@Entity
public class Image {
    private Long id;
    private String path;

    public Image() {
    }

    public Image(String path) {
        this.path = path;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
