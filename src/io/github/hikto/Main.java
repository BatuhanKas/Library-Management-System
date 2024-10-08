package io.github.hikto;

import io.github.hikto.test.Animal;
import io.github.hikto.test.Bat;

public class Main {
    public static void main(String[] args) {
        User Batuhan = new User("Batuhan");

        Book Jujutsu = new Book("Jujutsu Kaisen", "Gege Akutami", 9117151, 2018);
        Batuhan.AddBorrowedBooks(Jujutsu);

        Book KnY = new Book("Kimetsu no Yaiba", "Koyoharu Gotouge", 9462145, 2019);
        Batuhan.AddBorrowedBooks(KnY);

        Batuhan.DisplayInfos();

        User Hamza = new User("Hamza");

        Book Berserk = new Book("Berserk", "Kentaro Miura", 9567351, 1997);
        Hamza.AddBorrowedBooks(Berserk);

        Book NGNL = new Book("No Game No Life", "Yuu Kamiya", 9461354, 2014);
        Hamza.AddBorrowedBooks(NGNL);

        Book Bleach = new Book("Bleach", "Tite Kubo", 9564728, 2004);
        Hamza.AddBorrowedBooks(Bleach);
//        Hamza.AddBorrowedBooks(Bleach);

//        io.github.hikto.Book AOT = new io.github.hikto.Book("Attack on Titan", "Hajime Isayama", 9586241, 2013);
//        Hamza.AddBorrowedBooks(AOT);
        Hamza.DisplayInfos();
        despawn(new Bat());
    }

    public static void despawn(Animal animal) {

    }
}
