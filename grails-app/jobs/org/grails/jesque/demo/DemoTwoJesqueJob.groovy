package org.grails.jesque.demo

import groovy.util.logging.Slf4j

@Slf4j
class DemoTwoJesqueJob implements Runnable {

    static triggers = {
        cron name: 'DemoTwoJesqueJobTrigger', cronExpression: '0/10 * * * * ? *'
    }

    def perform() {
        println "Executing Two Job"
    }

    @Override
    void run() {
        perform()
    }
}