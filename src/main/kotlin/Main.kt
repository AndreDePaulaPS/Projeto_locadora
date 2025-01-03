import entity.Carro
import service.Locadora

fun main(){
    val carro: Carro = Carro("Nissan",
        "Versa",
        "2021",
        false,
        100,
        false,
        2.0)

    Locadora.registarVeiculo(carro)

    println(Locadora.buscarVeiculos())
}