package in.ashokit.demo.repository;

import in.ashokit.demo.binding.Book;

import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book ,Integer> {

}
