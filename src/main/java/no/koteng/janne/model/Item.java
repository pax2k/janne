package no.koteng.janne.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Raymond Koteng.
 */
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String header;

    @ElementCollection
    private List<String> description = new ArrayList<String>();

    @Lob
    private byte[] image;


    public Item() {
    }

    public Item(String header, List<String> description, byte[] image) {
        this.header = header;
        this.description = description;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
