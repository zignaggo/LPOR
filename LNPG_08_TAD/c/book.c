#include <stdio.h>
#include <string.h>

typedef struct
{
    char title[50]; 
    char author[20];
    int publishedYear;
    int availableCopies;
} Book;

void initialize(Book *book, char title[50], char author[20], int publishedYear, int availableCopies)
{
    strncpy(book->title, title, sizeof(book->title) - 1);
    book->title[sizeof(book->title) - 1] = '\0'; 
    strncpy(book->author, author, sizeof(book->author) - 1);
    book->author[sizeof(book->author) - 1] = '\0'; 
    book->publishedYear = publishedYear;
    book->availableCopies = availableCopies;
}

int toLend(Book *book)
{
    if (book->availableCopies > 0)
    {
        book->availableCopies--;
        return 1;
    }
    return 0;
}

char *getTitle(Book *book)
{
    return book->title;
}

int main()
{
    Book book1;
    initialize(&book1, "A volta dos que não foram", "Jorge", 1999, 10);
    printf("%s\n", getTitle(&book1)); // Corrected printf statement
    return 0;
}