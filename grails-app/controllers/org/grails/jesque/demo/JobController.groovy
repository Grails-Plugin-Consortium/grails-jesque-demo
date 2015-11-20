package org.grails.jesque.demo

import grails.plugins.jesque.JesqueService

class JobController {

    JesqueService jesqueService

    def index() {
        jesqueService.enqueue(DemoJesqueJob.queue, DemoJesqueJob)
//        jesqueService.enqueue(DemoTwoJesqueJob.queue, DemoTwoJesqueJob)
        render view: '/index'
    }
}
