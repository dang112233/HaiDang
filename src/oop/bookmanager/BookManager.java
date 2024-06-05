package oop.bookmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new LinkedList<>();package oop.bookmanager;

public class Book {
    private String title;
    private String genre;
    private int price;

    public Book(String title, String genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
}package oop.bookmanager;

public class Book {
    private String title;
    private String genre;
    private int price;

    public Book(String title, String genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
}package oop.bookmanager;

public class Book {
    private String title;
    private String genre;
    private int price;

    public Book(String title, String genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
}package oop.bookmanager;

public class Book {
    private String title;
    private String genre;
    private int price;

    public Book(String title, String genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
}package oop.bookmanager;

public class Book {
    private String title;
    private String genre;
    private int price;

    public Book(String title, String genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
}
    }

    public List<Book> getBookList() {
        return bookList;
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        return index >= 0 && index <= limit;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void append(Book book) {
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        if (checkBoundaries(index, bookList.size())) {
            bookList.add(index, book);
        }
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        if (checkBoundaries(index, bookList.size() - 1)) {
            bookList.remove(index);
        }
    }

    /**
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        bookList.remove(book);
    }
    public Book bookAt(int index) {
        if (checkBoundaries(index, bookList.size() - 1)) {
            return bookList.get(index);
        }
        return null;
    }

    public List<Book> sortIncreasingByGenreAndTitle() {
        List<Book> sortedList = new LinkedList<>(bookList);
        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getGenre().compareTo(o2.getGenre()) == 0) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
                return o1.getGenre().compareTo(o2.getGenre());
            }
        });
        return sortedList;
    }

    public List<Book> sortIncreasingGenreAndPrice() {
        List<Book> sortedList = new LinkedList<>(bookList);
        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getGenre().compareTo(o2.getGenre()) == 0) {
                    return o1.getPrice() - o2.getPrice();
                }
                return o1.getGenre().compareTo(o2.getGenre());
            }
        });
        return sortedList;
    }

    public List<Book> sortDecreasingByGenreAndTitle() {
        List<Book> sortedList = new LinkedList<>(bookList);
        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getGenre().compareTo(o2.getGenre()) == 0) {
                    return o2.getTitle().compareTo(o1.getTitle());
                }
                return o2.getGenre().compareTo(o1.getGenre());
            }
        });
        return sortedList;
    }

    public List<Book> sortDecreasingGenreAndPrice() {
        List<Book> sortedList = new LinkedList<>(bookList);
        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getGenre().compareTo(o2.getGenre()) == 0) {
                    return o2.getPrice() - o1.getPrice();
                }
                return o2.getGenre().compareTo(o1.getGenre());
            }
        });
        return sortedList;
    }

    public List<Book> sortIncreasingByTitle() {
        List<Book> sortedList = new LinkedList<>(bookList);
        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        return sortedList;
    }
    public
}
