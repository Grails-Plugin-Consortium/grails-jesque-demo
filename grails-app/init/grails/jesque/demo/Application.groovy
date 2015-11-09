package grails.jesque.demo

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import grails.plugins.jesque.JesqueService
import org.springframework.beans.factory.annotation.Autowired

class Application extends GrailsAutoConfiguration {

    @Autowired
    JesqueService jesqueService

    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}