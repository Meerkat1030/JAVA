package sec03.chap11;

class Book{
    int bookNum;
    String bookTitle;

    //책 번호와 타이틀을 매개변수로 입력받는 생성자
    public Book(int bookNum, String bookTitle) {
        this.bookNum = bookNum;
        this.bookTitle = bookTitle;
    }
    public String toString() {
        return bookTitle + "," + bookNum;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book(100, "개미");

        System.out.println(book);//인스턴스 정보(클래스이름, 주소값)
        System.out.println(book.toString());

        String str = new String("new");
        System.out.println(str);

        Integer i1 = new Integer(100);
        System.out.println(i1);
    }
}
