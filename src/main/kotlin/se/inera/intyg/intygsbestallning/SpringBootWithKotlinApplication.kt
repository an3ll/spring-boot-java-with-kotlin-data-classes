package se.inera.intyg.intygsbestallning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringBootWithKotlinApplication

fun main(args: Array<String>) {
	runApplication<se.inera.intyg.intygsbestallning.SpringBootWithKotlinApplication>(*args)
}
