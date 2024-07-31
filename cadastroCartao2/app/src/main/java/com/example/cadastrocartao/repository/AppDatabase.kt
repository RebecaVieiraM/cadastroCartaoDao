package com.example.cadastrocartao.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.cadastrocartao.model.CartaoModel
import com.example.cadastrocartao.repository.dao.CartaoDao

@Database(entities = [CartaoModel::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun cartaoDAO(): CartaoDao//Referência de UsuarioDAO, pois iremos selecionar essa classe por meio da instancia do banco

    companion object{
        private lateinit var INSTANCE: AppDatabase

        fun getDataBase(context: Context): AppDatabase{
            if(!::INSTANCE.isInitialized) {
                synchronized(AppDatabase::class) {
                    INSTANCE =
                        Room.databaseBuilder(context, AppDatabase::class.java, "cartodb").addMigrations(
                            MIGRATION_1_2, MIGRATION_2_3).allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }

        private val MIGRATION_1_2: Migration = object : Migration(1, 2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("")
            }
        }

        private val MIGRATION_2_3: Migration = object : Migration(2, 3){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("")
            }
        }

    }
}

//15- colocar esses codigos e fazer as alteracoes para os nomes do projeto, alt enter para os imports
//16- botao direito no repository / new / package / nome dao
//17- botao direito no dao / new / kotlin class/file / tipo interface / nome CartaoDao
//18- dar enter no cartaoDao da linha 14
//19- insttrucoes no Cartaodao
