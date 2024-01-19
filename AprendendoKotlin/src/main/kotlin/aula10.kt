class aula10 {
    fun main (args: Array<String>) {

        var listaCompras = arrayOf("Arroz","Feijão","Batata","Uva","Banana","Carne","Leite","Ovos",100,2.5)

        var indice = 0

        /* while (indice <= 8) {
             println(listaCompras[indice])
             indice++
           } */

        for(indice in 0..listaCompras.size -1) {
            println(listaCompras[indice])
        }

    }
}