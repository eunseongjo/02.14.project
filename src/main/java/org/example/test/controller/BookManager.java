package org.example.test.controller;

import org.example.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
Scanner sc = new Scanner(System.in);

    public BookManager(){
        ArrayList<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1,1, "인문의 길", "허균"));
        bookList.add(new BookDTO(2,2, "자연과학의 정석", "허균"));
        bookList.add(new BookDTO(3,3, "의료란 무엇인가", "허균"));
        bookList.add(new BookDTO(4,4, "기타치는 법", "허균"));
        bookList.add(new BookDTO(5,1, "인문에 입문", "허균"));

    }

    public void addBook(BookDTO bookList){
        System.out.println("도서번호 : ");
        int bookNumber = sc.nextInt();

    }
    public void deleteBook(int index){
        System.out.println("도서 번호 : ");
        int bookNumber = sc.nextInt();

//        ArrayList 객체에 삭제

    }
    public int searchBook(String title){


    }
    public void printBook(int index){

    }
    public ArrayList<BookDTO> displayAll(){
        return

    }
    public ArrayList<BookDTO> sortedBookList(int select){

    }
    public void printBookList(ArrayList<BookDTO> br){

    }
}
