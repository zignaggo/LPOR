#include <stdio.h>
#include <string.h>

typedef struct{
    char autor[30];
    char titulo[30];
    int AnoDePublicacao;
    int CopiasDisponiveis;
}  Book;

const char* getAutor(Book *pont) {
    return pont->autor;
}
void setAutor(Book *pont, char* nomeDoAutor){
    strcpy(pont->autor, nomeDoAutor);
}
const char* getAutor(Book *pont) {
    return pont->autor;
}
void setAutor(Book *pont, char* nomeDoAutor){
    strcpy(pont->autor, nomeDoAutor);
}
