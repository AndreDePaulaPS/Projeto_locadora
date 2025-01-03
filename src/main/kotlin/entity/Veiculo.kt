package entity

abstract class Veiculo(
    val marca: String, val modelo: String, val ano: String, var disponibilidade: Boolean
){
    abstract fun exibirDetalhe()
}