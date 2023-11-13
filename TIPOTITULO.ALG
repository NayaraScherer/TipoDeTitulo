Algoritmo "TipoTitulo"
// Projeto   : Tipo de Titulo BartDigital
// Instrutores   : Erick Thomaz e Daniel Setton
// Descrição   : Projeto para a insercao de Tipo de Titulo(CPR ou Documento) e minuta
// Autor(a)    : Nayara Scherer
// Data atual  : 13/11/2023
Var
   tipoTitulo: caractere
   respMinuta,minutaAss, nomeArq:caractere

Inicio


   Enquanto (tipoTitulo <> "CPR" ) Faca
      Escreva("Digite o tipo de Titulo que ira inserir (CPR ou Documento): ")
      Leia(tipoTitulo)

      tipoTitulo <- maiusc(tipoTitulo)

      Se(tipoTitulo = "CPR")entao
         Escreval("CPR criada com sucesso.")
      Senao
         Se (tipoTitulo ="DOCUMENTO") entao
            Escreval("Documento criado com sucesso.")
            interrompa

         Senao
            Escreval("Documento Invalido. Tente novamente.")
         FimSe
      FimSe
   FimEnquanto

   // var respMinuta,minutaAss, nomeArq
   Repita
      Escreva( "Deseja inserir uma Minuta? (S ou N) ")
      Leia(respMinuta)
      respMinuta<-maiusc(respMinuta)

      Se (respMinuta = "S")entao
         Escreva("A minuta esta assinada? (S ou N)")
         Leia(minutaAss)
         minutaAss <- maiusc(minutaAss)
         Se minutaAss="S" entao
            Escreva("Digite o nome do Arquivo que deseja inserir?")
            Leia(nomeArq)
            Escreval("Minuta assinada inserida na plataforma")

         Senao
            Escreval("Minuta nao assinada inserida. Esse documento passara por assinatura do nosso assinador.")
         FimSe
      Senao
         Escreval("Minuta nao inserida. Futuramente sera possivel inserir uma minuta ou gerar uma Minuta Parametrizada.")
      Escreva("Deseja inserir outra Minuta? (S ou N)?")
      Leia(respMinuta)
      FimSe
Ate(  respMinuta <> "S")
limpaTela
FimAlgoritmo



