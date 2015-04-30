package no.koteng.janne.controller;

import no.koteng.janne.model.Item;
import no.koteng.janne.repository.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Raymond Koteng.
 */
@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    public List findItems() {
        System.out.println("Page view!");
        return repo.findAll();
    }
}
