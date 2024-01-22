def inverter_lista(lista): 
    tamanho = len(lista)
    limite = tamanho//2
    for i in range(limite):
        aux = lista[i]
        lista[i] = lista[n-i]
        lista[tamanho-i] = aux

# 4 + N complexidade de espaço 
# 2 + 2*N - Complexidade de tempo = O(n)
        
def inverter_lista2(lista):
    nova_lista = []
    tamanho = len(lista)
    for i in range(tamanho):
        nova_lista.append(lista[tamanho-i])
    return nova_lista

# 2 + N tempo
# 3 + 2*N

def tem_duplicados(lista):
    for i in range(len(lista)-1):
        for j in range(i+1, len(lista)):
            if lista[i] == lista[j]:
                return True
    return False

# Progressão Aritmética
# N-1 + N-2 + N-3 + ... + 1 = N*(N-1)/2 
# (N^2 - N)/2 + 1 = O(n^2)

