package service;

import app.BookDao;

public class BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void sava(){
        System.out.println("bookservice is running saving");
        bookDao.save();
    }
}
