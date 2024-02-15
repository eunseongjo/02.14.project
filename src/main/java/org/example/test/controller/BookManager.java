package org.example.test.controller;

import org.example.test.model.dto.BookDTO;

import java.util.*;

public class BookManager {
    ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
        bookList.add(new BookDTO(1, 1, "인문의 길", "허균"));
        bookList.add(new BookDTO(2, 2, "자연과학의 정석", "허균"));
        bookList.add(new BookDTO(3, 3, "의료란 무엇인가", "허균"));
        bookList.add(new BookDTO(4, 4, "기타치는 법", "허균"));
        bookList.add(new BookDTO(5, 1, "인문에 입문", "허균"));

    }

    public void addBook(BookDTO bookList) {
        this.bookList.add(bookList);
        System.out.println(bookList + "다음과 같은 책이 추가되었습니다.");
    }

    public void deleteBook(int index) {
        Iterator<BookDTO> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            BookDTO book = iterator.next();
            if (book.getbNo() == index) {
                iterator.remove();
                System.out.println("도서가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 도서 번호를 가진 책을 찾을 수 없습니다.");
    }

    public int searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            BookDTO book = bookList.get(i);
            if (book.getTitle().equals(title)) {
                System.out.println(book);
                return i; // 찾은 책의 인덱스 반환
            }
        }
        return -1; // 책을 찾지 못한 경우 -1 반환
    }


    public void printBook(int index) {

        if (index >= 0 && index < bookList.size()) {
            BookDTO book = bookList.get(index);
            System.out.println("책 번호 : " + book.getbNo());
            System.out.println("카테고리 번호 : " + book.getCategory());
            System.out.println("제목 : " + book.getTitle());
            System.out.println("저자 : " + book.getAuthor());

        } else {
            System.out.println("해당 인덱스에 도서 정보가 존재하지 않습니다.");
        }

    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("도서 목록이 비어 있습니다.");
            return;
        }
        System.out.println("도서 목록 : ");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {

        return null;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        br = bookList;
        for (BookDTO book : br) {
            System.out.println(bookList);

        }
    }

}

