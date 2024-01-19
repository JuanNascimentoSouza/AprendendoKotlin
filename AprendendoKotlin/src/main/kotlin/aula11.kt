class aula11 {

    fun main(args:Array<String>) {

    var opcao = 1

    when(opcao) {

        1 -> println("Suco de laranja")
        2 -> println("Suco de uva")
        3 -> println("Suco de abacaxi")
        else -> println("nenuma opção foi selecionada")

      }

        var mensagem = when (opcao) {
            1 -> "Suco de laranja"
            2 -> "Suco de uva"
            3 -> "Suco de abacaxi"
            else -> "nenuma opção foi selecionada"

        }

    }
}