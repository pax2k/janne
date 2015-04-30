package no.koteng.janne.model;

import javax.persistence.*;

/**
 * @author Raymond Koteng.
 */
@Entity
public class ImageShow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Lob
    private byte[] thumbnail;

    public ImageShow() {
    }

    public ImageShow(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }
}
