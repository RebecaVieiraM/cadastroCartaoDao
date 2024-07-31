package com.example.cadastrocartao.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "Cartao")
class CartaoModel {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_cartao")
    var id_cartao: Int = 0

    @ColumnInfo(name = "numero_cartao")
    var numero_cartao: String = ""

    @ColumnInfo(name = "titular")
    var titular: String = ""

    @ColumnInfo(name = "cvv")
    var cvv: String = ""

    @ColumnInfo(name = "data_vencimento")
    var data_vencimento: String = ""
}
//12- colocar esses codigos e dar enter para fazer os imports
//13- instrucoes no MainActivity