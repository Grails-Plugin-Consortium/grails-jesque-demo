package org.grails.jesque.demo

import groovy.util.logging.Slf4j

@Slf4j
class DemoTwoJesqueJob {

    static queue = 'DemoJesqueJobQueue'
    static workerPool = 'DemoJesqueJobPool'

    static triggers = {
        cron name: 'DemoTwoJesqueJobTrigger', cronExpression: '0/10 * * * * ? *'
    }

    def perform() {
        println "Executing Two Job"
    }
}