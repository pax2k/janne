package no.koteng.janne.repository;

import no.koteng.janne.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Raymond Koteng.
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
