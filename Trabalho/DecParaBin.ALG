Algoritmo "Converter Decimal para Bin�rio"

Var
   resto, decimal: inteiro
   binary: caractere
Inicio
   escreval("Programa criado para converter um n�mero decimal para um n�mero bin�rio utilizando o resto de divis�es curtas por 2.")
   escreva("Digite um n�mero decimal: ")
   leia(decimal)

   binary <- ""

   enquanto decimal > 0 fa�a
      resto <- decimal % 2
      binary <- Numpcarac(resto) + binary
      decimal <- decimal \ 2
   fimenquanto

   escreva("O n�mero bin�rio equivalente �: ", binary, ".")

Fimalgoritmo