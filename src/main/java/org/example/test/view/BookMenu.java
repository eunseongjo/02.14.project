package org.example.test.view;

import org.example.test.controller.BookManager;
import org.example.test.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.Scanner;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {

        while (true) {
            System.out.println("도서 관리 프로그램");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 출력");
            System.out.println("5. 도서목록 전체 출력");
            System.out.println("6. 해당 카테고리순으로 정렬");
            System.out.println("7. 향상된 for문을 이용하여 출력(?)");

            System.out.print("메뉴를 선택하세요: ");

            int choice1 = sc.nextInt();

            switch (choice1) {

                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    bm.deleteBook(bm.searchBook(inputBookTitle()));
                    break;
                case 3:
                    bm.searchBook(inputBookTitle());
                    break;
                case 4:
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:

                    break;
                case 7:

                    break;


            }
        }

    }


    public BookDTO inputBook() {

        System.out.println("책 번호 : ");
        int bNo = sc.nextInt();
        System.out.println("카테고리 번호 : ");
        int categoryNumber = sc.nextInt();
        System.out.println("책 제목 : ");
        String bookTitle = sc.next();
        System.out.println("저자 : ");
        String bookAuthor = sc.next();

        BookDTO newBook = new BookDTO(bNo, categoryNumber, bookTitle, bookAuthor);

        return newBook;
    }

    public String inputBookTitle() {

        System.out.println("도서 제목 : ");
        String bookTitle = sc.next();

        return bookTitle;
    }
}
