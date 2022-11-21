public class Main {
    public static void main(String[] args) {

        System.out.println("    Привет, Ольга!");
//        Урок "Объекты и классы"
        // ДЗ
        System.out.println();
        System.out.println("ДЗ");
        Author vilmont = new Author("Ekaterina", "Vilmont");
        Book book1 = new Book("Невероятное везение", vilmont, 2001);
        Author orson = new Author("Orson", "Card");
        Book book2 = new Book("Тень Эндера", orson, 1999);
        book1.setPublishingYear(2002);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());

    }
}