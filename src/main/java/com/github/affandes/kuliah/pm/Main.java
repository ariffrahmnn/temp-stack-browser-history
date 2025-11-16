package com.github.affandes.kuliah.pm;
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tulis kode disini
        Stack<String> history = new Stack<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Browser History ===");
            System.out.println("1. browse");
            System.out.println("2. back");
            System.out.println("3. view");
            System.out.println("4. exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine(); // biar enter ga ikut kebaca

            switch (menu) {
                case 1:
                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();
                    history.push(url);
                    System.out.println(">> Browsing ke: " + url);
                    break;

                case 2:
                    if (history.empty()) {
                        System.out.println(">> Tidak ada history untuk kembali!");
                    } else {
                        String removed = history.pop();
                        System.out.println(">> Kembali dari: " + removed);
                        if (!history.empty()) {
                            System.out.println(">> Sekarang di: " + history.peek());
                        } else {
                            System.out.println(">> History kosong.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== History (paling baru di atas) ===");
                    if (history.empty()) {
                        System.out.println("History masih kosong!");
                    } else {
                        for (int i = history.size() - 1; i >= 0; i--) {
                            System.out.println(history.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Keluar...");
                    return;

                default:
                    System.out.println("Menu tidak valid!");
            }
        }

    }
}   