package service

import entity.Veiculo

class Locadora {
    private var veicluos: MutableList<Veiculo> = mutableListOf()

    fun registarVeiculo(veiculo: Veiculo){
        listaDeVeicluos.add(veiculo)
    }

    fun buscarVeiculos(): List<Veiculo>{
        return veicluos.filter {it.disponibilidade}.forEach(it.exibirDetalhes())
    }
}