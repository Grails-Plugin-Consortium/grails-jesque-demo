package org.grails.jesque.demo

import groovy.util.logging.Slf4j

@Slf4j
class DemoTwoJesqueJob {

    static queue = 'DemoJesqueJobQueue'
    static workerPool = 'DemoJesqueJobPool'

    static triggers = {
        cron name: 'DemoTwoJesqueJobTrigger', cronExpression: '*/10 * * * * ? *'
    }

    def perform() {
        log.info ">>>>> Executing Two Job"
    }
}