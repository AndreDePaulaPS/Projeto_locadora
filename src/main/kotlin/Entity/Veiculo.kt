package Entity


interface Veiculo {
    val marca: String
    val modelo: String
    val ano: String
    var disponibilidade: Boolean


    fun registrar()

    fun buscar()

    fun atualizar()
}