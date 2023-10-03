package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook(){
        System.out.println("Mы берем книгу на UniLibrary");
    }
    public void getMagazine(){
        System.out.println("Mы берем журнал на UniLibrary");
    }
    public void returnBook(Book book){
        int a = 10 / 0;
        System.out.println("Mы возвращаем книгу на UniLibrary" + book.getName());
    }
}
