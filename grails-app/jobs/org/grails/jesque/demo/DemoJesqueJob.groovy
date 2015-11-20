package org.grails.jesque.demo

import groovy.util.logging.Slf4j

@Slf4j
class DemoJesqueJob {

    static queue = 'DemoJesqueJobQueue'
    static workerPool = 'DemoJesqueJobPool'

    static triggers = {
        cron name: 'DemoJesqueJobTrigger', cronExpression: '*/5 * * * * ? *'
    }

    def perform() {
        log.info ">>>>> Executing Job"
    }
}