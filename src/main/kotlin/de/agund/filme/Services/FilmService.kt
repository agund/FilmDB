package de.agund.filme.Services

import de.agund.filme.DB.Film
import de.agund.filme.DB.FilmRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.servlet.ModelAndView

@Service
class FilmService{

    @Autowired
    var _filmRepository : FilmRepository? = null




    fun AddFilm(name :String)
    {
        var f = Film()
        f.filmName=name
        _filmRepository?.save(f)
    }

    fun GetAllFilms() : List<Film>?
    {
        return _filmRepository?.findAllByFilmNameLike("%%")?.toList()
    }

    fun RemoveAll()
    {
        try {
            _filmRepository?.deleteAllByFilmNameLike("%%")
        } catch (ex : Exception)
        {
            println(ex.message)
        }
    }

    fun getModel() : ModelAndView
    {
        var v = ModelAndView("index");
        v.addObject("title","test")
        v.addObject("filme",GetAllFilms())
        return v
    }
}