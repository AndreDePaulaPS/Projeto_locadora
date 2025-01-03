package entity

class Carro(
    marca: String,
    modelo: String,
    ano: String,
    disponibilidade: Boolean,
    val volumePortaMalas: Int,
    val flex: Boolean,
    val cilindradas: Double
) : Veiculo(marca, modelo, ano, disponibilidade) {
    override fun exibirDetalhe() {
        println("Carro: $marca, modelo: $modelo, ano: $ano, cobustivel flex: $flex")
    }
}