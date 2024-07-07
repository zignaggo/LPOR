# Declaração do problema: Dadas duas matrizes, multiplique-as e retorne a matriz resultante.

def matrix_multiply(A, B):
    print(A)
    print(B)
    rows_A = len(A)
    cols_A = len(A[0])
    rows_B = len(B)
    cols_B = len(B[0])

    if cols_A != rows_B:
        print("Cannot multiply matrices: incompatible dimensions.")
        return None
    # Result rows = rows_a
    # Result coluns = cols_b
    # Initialize the result matrix with zeros
    result = [[0 for _ in range(cols_B)] for _ in range(rows_A)]

    # Perform matrix multiplication
    for i in range(rows_A):
        for j in range(cols_B):
            # Correção iterar as colunas de A em vez das colunas de B
            # Erro tratado: out of range K
            for k in range(cols_A):
                result[i][j] += A[i][k] * B[k][j]
    return result


def read_matrix():
    try:
        rows = int(input("Enter the number of rows: "))
        cols = int(input("Enter the number of columns: "))
        print("Enter the matrix elements row-wise:")
        matrix = []
        for _ in range(rows):
            row = list(map(int, input().split()))
            if len(row) != cols:
                print("Invalid row length.")
                return None
            matrix.append(row)
        return matrix
    except ValueError:
        print("Invalid input. Please enter integers only.")
        return None


def main():
    print("Matrix A:")
    A = read_matrix()
    if A is None:
        return

    print("Matrix B:")
    B = read_matrix()
    if B is None:
        return

    result = matrix_multiply(A, B)
    if result is not None:
        print("Resultant matrix:")
        for row in result:
            print(' '.join(map(str, row)))


if __name__ == "__main__":
    main()
