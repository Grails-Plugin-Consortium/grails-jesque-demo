package org.grails.jesque.demo

import groovy.util.logging.Slf4j

@Slf4j
class JobWithNoQueueJob {

    static queue = 'JobWithNoQueueJobQueue'
    static workerPool = 'DemoJesqueJobPool'

    static triggers = {
        cron name: 'JobWithNoQueueJobTrigger', cronExpression: '*/8 * * * * ? *'
    }

    def perform() {
        log.info ">>>>> Executing JobWithNoQueueJob"
    }
}
