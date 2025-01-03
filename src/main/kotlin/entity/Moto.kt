package entity

class Moto(
    marca: String, modelo: String, ano: String, disponibilidade: Boolean, val flex: Boolean, val cilindradas: Double
) : Veiculo(marca, modelo, ano, disponibilidade) {
    override fun exibirDetalhe() {
        TODO("Not yet implemented")
    }


}
