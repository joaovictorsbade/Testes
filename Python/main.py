# # #versão 1.0 Funcionando
# #
# #Quando o valor é invalido o progama finaliza execução
# #Formatar texto
# #tentar no 2.0 com Swtch case
# #organizar os testes anteriores
#
#
# #Contabilizar a quantidade de cada cédula
# quantCed10 = int(input("Quantas cédulas de R$10 serão depositadas: "))
# quantCed20 = int(input("Quantas cédulas de R$20 serão depositadas: "))
# quantCed50 = int(input("Quantas cédulas de R$50 serão depositadas: "))
# quantCed100 = int(input("Quantas cédulas de R$100 serão depositadas: "))
#
# quantidades = {"ced10": quantCed10, "ced20": quantCed20, "ced50": quantCed50, "ced100": quantCed100}
#
#montanteNoCaixa = quantCed10 * 10 + quantCed20 * 20 + quantCed50 * 50 + quantCed100 * 100

#
# print("O valor total do caixa é:", montanteNoCaixa)
#
#
# def VerificarCedulas(saque, quantidades):
#     cedulasDisponiveisEntrega = {"Cédulas de R$100": 0, "Cédulas de R$50": 0, "Cédulas de R$20": 0, "Cédulas de R$10": 0}#Formatar o texto
#
#     # Subtrai o valor do saque até chegar a zero
#     while saque > 0:
#         if saque >= 100 and quantidades["ced100"] > 0:
#             saque -= 100
#             cedulasDisponiveisEntrega["Cédulas de R$100"] += 1
#             quantidades["ced100"] -= 1
#         elif saque >= 50 and quantidades["ced50"] > 0:
#             saque -= 50
#             cedulasDisponiveisEntrega["Cédulas de R$50"] += 1
#             quantidades["ced50"] -= 1
#         elif saque >= 20 and quantidades["ced20"] > 0:
#             saque -= 20
#             cedulasDisponiveisEntrega["Cédulas de R$20"] += 1
#             quantidades["ced20"] -= 1
#         elif saque >= 10 and quantidades["ced10"] > 0:
#             saque -= 10
#             cedulasDisponiveisEntrega["Cédulas de R$10"] += 1
#             quantidades["ced10"] -= 1
#         else:
#             break#num sei
#
#     # Verifica se o saque foi bem-sucedido
#     if saque == 0:
#         return cedulasDisponiveisEntrega
#     #talvez um print aq
#     else:
#         print("Saque indisponível devido à falta de cédulas.")
#         return None
#
#
# saque = int(input("Digite o valor do saque: "))
# def autenticarSaque(saque):
#     return saque <= montanteNoCaixa and saque % 10 == 0 and saque <= 2000
#
#
# cedulasEntregues = VerificarCedulas(saque, quantidades)
# if cedulasEntregues:
#     print("Saque entregue em: ", cedulasEntregues)
def calcular_somas_possiveis(alvos, alvo, soma_atual, indice, caminho):
    if soma_atual == alvo:
        print(caminho)
        return
    if soma_atual > alvo:
        return
    for i in range(indice, len(alvos)):
        caminho.append(alvos[i])
        calcular_somas_possiveis(alvos, alvo, soma_atual + alvos[i], i, caminho)
        caminho.pop()

alvos = [10, 20, 50, 100]
alvo = int(input("Digite o valor alvo: "))

calcular_somas_possiveis(alvos, alvo, 0, 0, [])
