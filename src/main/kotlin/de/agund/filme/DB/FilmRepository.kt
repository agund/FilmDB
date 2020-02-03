package de.agund.filme.DB

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Repository
interface FilmRepository :CrudRepository<Film,Long> {
    fun findAllByFilmNameLike(name : String) : List<Film>?
    fun findById(id : Int): Film?
    @Transactional
    fun deleteAllByFilmNameLike(name: String)


}