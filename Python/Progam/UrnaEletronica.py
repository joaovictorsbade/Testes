# Computational Thinking Using Python-Turma: 1TDSB-2024#
# CP2 –Prof. MSc. Luiz W Tavares –03 Abril 2024#
# RM555446 –Nome:João Victor dos Santos Barbosa
eleitores = [111, 222, 333, 444, 555]
ja_votou = [0, 0, 0, 0, 0]

votoNulo = 0

candidatos = []
registro_votos = []
while True:

    candidatoOrFim = input("Número do Candidato ou <fim>: ").lower().strip()
    if candidatoOrFim.isdigit():
        numero = int(candidatoOrFim)

        if 9 < numero < 100:
            candidatos.append(numero)
            registro_votos.append(0)
            print(f"Nome do Candidato...........: Candidato {numero} \n")
        else:
            print("Numero Invaido")

    elif candidatoOrFim.isalpha():
        if candidatoOrFim == "fim":
            break

while 0 in ja_votou:

    tituloOrFim = input("\nDigite o Título do Eleitor ou <fim> para terminar: ").lower().strip()

    if tituloOrFim.isdigit():
        numero = int(tituloOrFim)

        if numero in eleitores:
            posicao_el = eleitores.index(numero)

            if ja_votou[posicao_el] == 1:
                print("\nEleitor já votou!!!")

            elif ja_votou[posicao_el] == 0:
                print("\nInicio do Voto:\n\nCandidatos:")

                for candidato in candidatos:
                    print(f"{candidato} - Candidato {candidato}")

                voto = int(input("\nVoto -Número do Candidato:  "))

                if voto in candidatos:
                    ja_votou[posicao_el] = 1
                    posicao_can = candidatos.index(voto)
                    registro_votos[posicao_can] += 1

                else:
                    votoNulo += 1
                    ja_votou[posicao_el] = 1

        else:
            print("\nEleitor não autorizado para votar")

    elif tituloOrFim.isalpha():
        if tituloOrFim == "fim":
            break

print("\nTodos os eleitores já votaram.\nFIM\n\n=========================================")

print("Total de eleitores: 5\n"
      f"Total de votos ...: {sum(ja_votou)}\n\n"
      f"Candidatos ........:\n"
      f"Votos:   {votoNulo} - 000 -Votos Nulo")

for valor, candidato, registro_voto in zip(candidatos, candidatos, registro_votos):
    print(f"Votos:   {registro_voto} - {candidato} -Candidato {candidato}")

print("\n\nEleitor:")

for valor, eleitores, ja_votou in zip(eleitores, eleitores, ja_votou):
    validacaoVoto = "NÃO"
    if ja_votou == 1:
        validacaoVoto = ""
    print(f"{eleitores} - {validacaoVoto} votou")


