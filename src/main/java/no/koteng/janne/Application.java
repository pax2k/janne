package no.koteng.janne;

import no.koteng.janne.model.ImageShow;
import no.koteng.janne.model.Item;
import no.koteng.janne.repository.ImageShowRepository;
import no.koteng.janne.repository.ItemRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Raymond Koteng.
 */
@SpringBootApplication
public class Application implements InitializingBean {

    @Autowired
    ItemRepository repository;

    @Autowired
    ImageShowRepository imageShowRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        initItems();
        initImageShow();
    }

    private void initImageShow() throws IOException {
        imageShowRepository.saveAndFlush(new ImageShow(getBytesForImage("/Users/pax2k/Desktop/testdata/webgalleri/raymond.jpg")));
        imageShowRepository.saveAndFlush(new ImageShow(getBytesForImage("/Users/pax2k/Desktop/testdata/webgalleri/fram.jpg")));
        imageShowRepository.saveAndFlush(new ImageShow(getBytesForImage("/Users/pax2k/Desktop/testdata/webgalleri/galleri.jpg")));
        imageShowRepository.saveAndFlush(new ImageShow(getBytesForImage("/Users/pax2k/Desktop/testdata/webgalleri/skal_bare.png")));
    }

    private void initItems() throws IOException {
        repository.saveAndFlush(
                new Item(
                        "Education",
                        new ArrayList<String>(Arrays.asList("Bachelor Computer Engineering", "Bachelor Multimedia technology and design")),
                        getBytesForImage("/Users/pax2k/Desktop/testdata/ambulanse_orginal.png")));

        repository.saveAndFlush(
                new Item(
                        "Design",
                        new ArrayList<String>(Arrays.asList("Photoshop", "Illustrator", "InDesign", "LightRoom")),
                        getBytesForImage("/Users/pax2k/Desktop/testdata/brann_orginal.png")));

        repository.saveAndFlush(
                new Item(
                        "Code",
                        new ArrayList<String>(Arrays.asList("HTML", "CSS", "Java", "Javascript", "PLS", "SQL")),
                        getBytesForImage("/Users/pax2k/Desktop/testdata/politi_orginal.png")));
    }


    private byte[] getBytesForImage(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readAllBytes(path);
    }
}
