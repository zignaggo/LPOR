#include <stdio.h>

double somar(double x, double y) {
    return x + y;
};
double subtrair(double x, double y) {
    return x - y;
};
double mutiplicar(double x, double y) {
    return x * y;
};
double dividir(double x, double y) {
    if (y == 0) {
        printf("\nDivisão por 0 não é valida, Logo:");
        return 0.0;
    }
    return x / y;
};
void mostrarResultado(double x, double y, double resultado, char operacao) {
    printf("%.2f %c %.2f = %.2f", x, operacao, y, resultado);
}

int main() {
	char operador;
	float num1, num2;
	printf("Digite a operação (+, -, *, /): ");
	scanf("%c", &operador);
	printf("Digite o primeiro número: ");
	scanf("%f", &num1);
	printf("Digite o segundo número: ");
	scanf("%f", &num2);
	switch (operador) {
    	case '+':
        	mostrarResultado(num1, num2, somar(num1, num2), operador);
        	break;
    	case '-':
        	mostrarResultado(num1, num2, subtrair(num1, num2), operador);
        	break;
    	case '*':
        	mostrarResultado(num1, num2, mutiplicar(num1, num2), operador);
        	break;
    	case '/':
        	mostrarResultado(num1, num2, dividir(num1, num2), operador);
        	break;
    	default:
        	printf("Operador inválido.\n");
	}
	return 0;}