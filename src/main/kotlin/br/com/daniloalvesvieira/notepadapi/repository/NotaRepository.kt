package br.com.daniloalvesvieira.notepadapi.repository

import br.com.daniloalvesvieira.notepadapi.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface NotaRepository: MongoRepository<Nota, String> {

    //select *
    @Query("{}")
    fun all(): Stream<Nota>

    //select * where
    //fun findByTituloOrConteudo(titulo: String, conteudo: String): Nota
    fun findByTitulo(titulo: String): Nota
}