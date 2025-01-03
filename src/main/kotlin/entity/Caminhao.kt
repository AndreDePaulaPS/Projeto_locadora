package entity

class Caminhao(
    marca: String, modelo:String, ano: String, disponibilidade: Boolean, val trucado: Boolean, val cilindrada: Double
): Veiculo(marca, modelo, ano, disponibilidade) {
    override fun exibirDetalhe() {
        TODO("Not yet implemented")
    }
}