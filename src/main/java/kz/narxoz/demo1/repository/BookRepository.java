package kz.narxoz.demo1.repository;

import kz.narxoz.demo1.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Long> {
}
