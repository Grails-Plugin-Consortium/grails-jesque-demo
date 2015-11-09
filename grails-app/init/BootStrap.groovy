import grails.plugins.jesque.JesqueService
import org.grails.jesque.demo.DemoJesqueJob

class BootStrap {

    JesqueService jesqueService

    def init = { servletContext ->
    }
    def destroy = {
    }
}
