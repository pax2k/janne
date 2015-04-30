package no.koteng.janne.controller;

import no.koteng.janne.repository.ImageShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Raymond Koteng.
 */
@RestController
@RequestMapping("/imageShow")
public class ImageShowController {

    @Autowired
    private ImageShowRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    public List findItems() {
        return repo.findAll();
    }
}
