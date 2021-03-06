package lv.tele2ssc.bookshelf;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
    
    public List<Book> findByTerm(String text) {
        return bookRepository.findByTerm(text.toLowerCase());
    }

    public Book findById(long bookId) {
        return bookRepository.findOne(bookId);
    }

    public void save(Book book) {
        bookRepository.save(book);
    }
}
