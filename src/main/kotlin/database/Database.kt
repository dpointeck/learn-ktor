package dao

import io.github.cdimascio.dotenv.Dotenv
import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.transaction

object Database {
    fun init() {
        val dotenv = Dotenv.load()
        val dbPath = dotenv.get("DATABASE_URL")
        val database = Database.connect("jdbc:sqlite:$dbPath", driver = "org.sqlite.JDBC")
    }
}

