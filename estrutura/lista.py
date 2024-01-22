def inverter_lista(lista): 
    tamanho = len(lista)
    limite = tamanho//2
    for i in range(limite):
        aux = lista[i]
        lista[i] = lista[n-i]
        lista[tamanho-i] = aux

# 4 + N complexidade de espaço 
# 2 + 3*(N/2) - Complexidade de tempo
        
def inverter_lista2(lista):
    nova_lista = []
    tamanho = len(lista)
    for i in range(tamanho):
        nova_lista.append(lista[tamanho-i])
    return nova_lista

# 2 + N tempo
# 3 + 2*N