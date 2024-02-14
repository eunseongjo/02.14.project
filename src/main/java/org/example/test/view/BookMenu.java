package org.example.test.view;

import org.example.test.controller.BookManager;
import org.example.test.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.Scanner;

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
            System.out.println("4. 도서 정보 출력");
            System.out.println("5. 도서목록 전체 출력");
            System.out.println("6. 도서 정보 출력");

            System.out.print("메뉴를 선택하세요: ");

            int choice1 = sc.nextInt();

            switch (choice1) {

                case 1:
                    bm.addBook();
                    break;
                case 2:
                    bm.deleteBook();
                    break;
                case 3:
                    bm.printBook();
                case 4:
                    while(true){
                        System.out.println("1. 도서 목록 전체 출력");
                        System.out.println("2. 카테고리순으로 정렬해서 출력");

                        int choice2 = sc.nextInt();

                        switch (choice2){
                            case 1:

                        }
                    }


            }

        }


    }

    public BookDTO inputBook() {
        return null;
    }

    public String inputBookTitle() {

        return null;
    }
}
