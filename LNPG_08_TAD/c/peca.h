#include <stdio.h>
#include <string.h>

typedef struct {
    char tipo[30];
    char cor[30];
    char posicao[3];
} peca;

void moverPeca(peca *pont, char* novaPosicao) {
    strcpy(pont->posicao, novaPosicao);
}

char* capturarPeca(char* nomePeca) {
    strcat(nomePeca, " foi capturado");
    return nomePeca;
}

int podeMover(peca *pont) {
    if (strcmp(pont->posicao, "8x8") != 0) {
        return 1;
    } else {
        return 0;
    }
}

void ObterInfo(peca *pont) {
    printf("Tipo: %s\n", pont->tipo);
    printf("Cor: %s\n", pont->cor);
    printf("Posição: %s\n", pont->posicao);
}

