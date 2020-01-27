package de.agund.filme.DB

import com.sun.xml.bind.v2.model.core.ID
import org.springframework.data.repository.CrudRepository
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "FILME")
public class Film
{
    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    var id : Long = 0
    var PID: Long? = null
        get() = this.id

    @Column(name = "Filmname", nullable = true)
    var filmName :String =""
    var PFilmName :String
        get() = this.filmName
        set(value) { this.filmName = value}

    @Column(name = "ErscheinungsJahr", nullable = true)
    var erscheinungsJahr : Date? = null
    var PErscheinungsJahr : Date?
        get() = this.erscheinungsJahr
        set(value) {this.erscheinungsJahr = value}




}