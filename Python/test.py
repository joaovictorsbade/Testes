# def calcular_somas_possiveis(alvos, alvo, soma_atual, indice, caminho):
#     if soma_atual == alvo:
#         print(caminho)
#         return
#     if soma_atual > alvo:
#         return
#     for i in range(indice, len(alvos)):
#         caminho.append(alvos[i])
#         calcular_somas_possiveis(alvos, alvo, soma_atual + alvos[i], i, caminho)
#         caminho.pop()
#
# alvos = [10, 20, 50, 100]
# alvo = int(input("Digite o valor alvo: "))
#
# calcular_somas_possiveis(alvos, alvo, 0, 0, [])


# def calcular_somas_possiveis(quantidades, saque, soma_atual, indice, caminho):
#     if soma_atual == saque:
#         print(caminho)
#         return
#     if soma_atual > saque:
#         return
#     for i in range(indice, len(quantidades)):
#         caminho.append(quantidades[i])
#         calcular_somas_possiveis(quantidades, saque, soma_atual + quantidades[i], i, caminho)
#         caminho.pop()
#
# quantidades = [10, 20, 50, 100]
# saque = int(input("Digite o valor saque: "))
#
# calcular_somas_possiveis(quantidades, saque, 0, 0, [])

def calcular_somas_possiveis(alvos, alvo, soma_atual, indice, caminho):
    if soma_atual == alvo:
        print("Caminho encontrado:", caminho)
        return
    if soma_atual > alvo:
        return
    for i in range(indice, len(alvos)):
        caminho.append(alvos[i])  # Adiciona o número atual ao caminho
        calcular_somas_possiveis(alvos, alvo, soma_atual + alvos[i], i, caminho)
        caminho.pop()  # Remove o último elemento adicionado ao caminho para explorar outras possibilidades

alvos = [10, 20, 50, 100]
alvo = int(input("Digite o valor alvo: "))

calcular_somas_possiveis(alvos, alvo, 0, 0, [])
