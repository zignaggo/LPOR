package LNPG_08_TAD.java;

public class Book {
    private String title;
    private String author;
    private int publishedYear = 0;
    private int availableCopys = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Book(String title, String author, int publishedYear, int availableCopys) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.availableCopys = availableCopys;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getAvailableCopys() {
        return this.availableCopys;
    }

    public void setAvailableCopys(int availableCopys) {
        this.availableCopys = availableCopys;
    }

    public void toLend() throws Exception {
        if(this.availableCopys > 0) {
            this.availableCopys -= 1;
            return;
        }
        throw new Exception("Doesn't have available copys");
    }

    public void returnCopy() {
        this.availableCopys += 1;
    }

    public boolean hasAvailable() {
        return this.availableCopys > 0;
    }

    public String getInfo() {
        return String.format("Title: %s\nAuthor: %s\nPublished year: %d\nAvailable copys: %d", this.title, this.author, this.publishedYear, this.availableCopys);
    }

    @Override
    public String toString() {
        return this.getInfo();
    }

    public static void main(String[] args) {
        Book book1 = new Book("A ida dos que não vão", "Zignago");
        Book book2 = new Book("A ida dos que não vão", "Zignago", 2002, 0);
        book1.setPublishedYear(1995);
        book1.setAvailableCopys(1_000_000);
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        try {
            System.out.printf("Old copys: %d\n", book2.getAvailableCopys());
            book2.toLend();
            System.out.printf("\nnew copys: %d", book2.getAvailableCopys());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}