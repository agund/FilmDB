package de.agund.filme.DB

import com.sun.xml.bind.v2.model.core.ID
import org.springframework.data.repository.CrudRepository
import java.time.DateTimeException
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


    @Column(name = "Filmname", nullable = true)
    var filmName :String =""


    @Column(name = "ErscheinungsJahr", nullable = true)
    var erscheinungsJahr : Date? = null

    var FilmAlter : Double = 0.0
        get() =  0.0





}