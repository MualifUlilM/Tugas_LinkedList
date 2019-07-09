package com.tugas;
import java.util.Scanner;

public class LList {
    Scanner scan = new Scanner(System.in);
    Node first;
    public boolean x = true;

    public LList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = first;
        first = node;
    }
    public void addLast(int data){
        Node node, help;
        node = new Node(data);
        node.next = null;

        if (isEmpty()){
            first = node;
            first.next = null;
        }else{
            help =first;
            while(help.next!=null){
                help = help.next;
            }
            help.next = node;
        }
    }
    public Node deleteFirst(){
        if(!isEmpty()){
            Node temp = first;
            first = first.next;
            return temp;
        }else{
            return null;
        }
    }
    public Node deleteLast(){
        if(!isEmpty()){
            Node temp, current;
            current = first;

            while(current.next.next != null){
                current = current.next;
            }
            temp = current.next;
            current.next = null;
            return temp;
        }else{
            Node temp = first;
            first = null;
            return temp;
        }
    }
    public void tampilkan(){
        Node current = first;
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
    public void inputDepan(char input){
        int data;

        switch (input){
            case '1':
                System.out.print("Masukkan data : ");
                data = scan.nextInt();
                addFirst(data);
                break;
            case '2':
                deleteFirst();
                break;
            case '3':
                tampilkan();
                break;
            case '4':
                x = false;
                break;
            default:
                System.out.println("Pilihan tidak ditemukan");
                break;
        }
    }

    public void inputBelakang(char input){
        int data;

        switch (input){
            case '1':
                System.out.print("Masukkan data : ");
                data = scan.nextInt();
                addLast(data);
                break;
            case '2':
                deleteLast();
                break;
            case '3':
                tampilkan();
                break;
            case '4':
                x = false;
                break;
            default:
                System.out.println("Pilihan tidak ditemukan");
                break;
        }
    }

    public void menu(String app){
        char input;

        System.out.println("==========================================");
        System.out.println("Program LinkedList | "+app);
        System.out.println("==========================================");
        System.out.println("1.Masukkan data");
        System.out.println("2.Hapus data");
        System.out.println("3.Tampilkan data");
        System.out.println("4.Keluar");
        System.out.println("==========================================");
        System.out.print("Masukkan Pilihan anda : ");
        input = scan.next().charAt(0);
        if (app.equals("Input dari depan")){
            inputDepan(input);
        }else{
            inputBelakang(input);
        }
    }
}
