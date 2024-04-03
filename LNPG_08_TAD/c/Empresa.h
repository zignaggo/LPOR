#include <stdio.h>
#include <string.h>

typedef struct {
    char nome[30];
    int id;
    char cargo[30];
    float salario;
    char departamento[30];
} empregado;

typedef struct {
    char nome[30];
    int qntDeEmpregados;
    int id;
    char localizacao[30];
} departamento;

void atualizarInfo(empregado *pont, char* nome, int id, float salario, char* cargo){
    strcpy(pont->nome, nome);
    pont->id = id;
    pont->salario = salario;
    strcpy(pont->cargo, cargo);
}

void transferirDeDepartamento(empregado *pont1, char* novoDepartamento){
    strcpy(pont1->departamento, novoDepartamento);
}

void adicionarEmpregados(departamento *pont){
    pont->qntDeEmpregados += 1;
}

void removerEmpregados(departamento *pont){
    pont->qntDeEmpregados -= 1;
}

int infoEmpregados(departamento *pont){
    return pont->qntDeEmpregados;
}