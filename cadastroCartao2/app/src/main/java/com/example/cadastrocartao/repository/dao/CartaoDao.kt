package com.example.cadastrocartao.repository.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.cadastrocartao.model.CartaoModel

@Dao
interface CartaoDao {
    @Insert
    fun insertCartao(cartao: CartaoModel) : Long

    @Update
    fun updateCartao(cartao: CartaoModel) : Int

    @Delete
    fun deleteCartao(cartao: CartaoModel) : Int

    @Query("SELECT * FROM Cartao WHERE id_cartao = :id")
    fun get (id: Int) :CartaoModel

    @Query("SELECT * FROM cartao")
    fun getAll(): List<CartaoModel>
}
//15- copiar esses codigos e adaptar para as caracteristicas do projeto
//16- dar enter para os imports
//17- instrucoes no MainActivity