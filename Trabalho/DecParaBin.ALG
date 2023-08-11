Algoritmo "Converter Decimal para Binário"

Var
   resto, decimal: inteiro
   binary: caractere
Inicio
   escreval("Programa criado para converter um número decimal para um número binário utilizando o resto de divisões curtas por 2.")
   escreva("Digite um número decimal: ")
   leia(decimal)

   binary <- ""

   enquanto decimal > 0 faça
      resto <- decimal % 2
      binary <- Numpcarac(resto) + binary
      decimal <- decimal \ 2
   fimenquanto

   escreva("O número binário equivalente é: ", binary, ".")

Fimalgoritmo