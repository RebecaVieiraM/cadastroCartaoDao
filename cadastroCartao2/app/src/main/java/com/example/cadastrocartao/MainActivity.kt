package com.example.cadastrocartao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.cadastrocartao.model.CartaoModel
import com.example.cadastrocartao.repository.AppDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cartaoDatabase = AppDatabase.getDataBase(this).cartaoDAO()

        val retornoInsert = cartaoDatabase.insertCartao(CartaoModel().apply {
            this.numero_cartao = "19199191"
            this.titular = "Rebeca Vieira Maia"
            this.cvv = "123"
            this.data_vencimento = "31/06/2024"
        })

        val retornoSelectMultiplo = cartaoDatabase.getAll()

        for (item in retornoSelectMultiplo) {
            Log.d(
                "Retorno",
                "id_cartao: ${item.id_cartao}, n°: ${item.numero_cartao}," +
                "titular: ${item.titular}, cvv: ${item.cvv}, data: ${item.data_vencimento}"
            )
        }
    }
}

//1- gradle scripts -> build.gradles.kts(Module :app), instrucoes la

//7- botao direito no com.example.cadastrocartao / new / package / colocar o nome model
//8- botao direito na pasta model / new / kotlin class/file  / nome CartaoModel
//9- botao direito no com.example.cadastrocartao / new / package / colocar o nome repository
//10-botao direito na pasta repository / new / kotlin class/file  / nome AppDatabase
//11-instrucoes no CartaoModel

//14-instrucoes no AppDatabase

//18-copiar esses codigos e alterar as informacoes de acordo com o projeto
//19- dar alt enter para os imports
