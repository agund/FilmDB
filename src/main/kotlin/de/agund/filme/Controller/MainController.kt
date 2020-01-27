package de.agund.filme.Controller

import de.agund.filme.Services.FilmService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView
import javax.print.DocFlavor


@Controller
class HtmlController {

    @Autowired
    var  _filmService : FilmService? = null


    @GetMapping("/")
    fun Index(): ModelAndView? {
        return _filmService?.getModel()
    }

    @GetMapping("/error")
    fun Error() : ModelAndView
    {
        return ModelAndView("error")
    }

    @RequestMapping(value = ["/action/film"], method = [RequestMethod.POST], params = ["action=delAll"])
    fun dellAll(name :String): ModelAndView? {
        _filmService?.RemoveAll();
        var m = _filmService?.getModel()
        return m
    }

    @RequestMapping(value = ["/action/film"], method = [RequestMethod.POST], params = ["action=add"])
    fun add(name :String): ModelAndView? {
        _filmService?.AddFilm(name);
        var m = _filmService?.getModel()
        return m
    }


    // @RequestMapping(value = ["/edit"], method = [RequestMethod.POST])
    // fun edit(@ModelAttribute model: SomeModel?,
    //          @RequestParam(value = "action", required = true) action: String?): ModelAndView? {
    //     when (action) {
    //         "save" -> {
    //         }
    //         "cancel" -> {
    //         }
    //         "newthing" -> {
    //         }
    //         else -> {
    //         }
    //     }
    // }



}