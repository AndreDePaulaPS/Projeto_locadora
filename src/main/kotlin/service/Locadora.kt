package service

import entity.Veiculo

class Locadora {


    companion object {
        var veiculos: MutableList<Veiculo> = mutableListOf()
        fun registarVeiculo(veiculo: Veiculo) {
            veiculos.add(veiculo)
        }

        fun buscarVeiculos(): List<Veiculo> {
            return veiculos.filter { it.disponibilidade }
        }
    }
}