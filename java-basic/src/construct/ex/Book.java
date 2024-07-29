package construct.ex;

public class Book {

    String title; //제목
    String author; //저자
    int page; //페이지 수


    Book() {
        this("", "");
    }

    Book(String title, String author, int page) {

        this.title = title;
        this.author = author;
        this.page = page;

    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    void displayInfo() {
        System.out.println("제목은 : " + title + " ,  저자는 : " + author + " , 페이지 수 " + page);
    }



}
