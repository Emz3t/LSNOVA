package tasks

import spock.lang.Shared
import spock.lang.Specification

class Task3Test extends Specification {

    @Shared
    def taskService

    def setup() {
        taskService = new Task3()
    }

    def "test execute with good inputs"() {
        given:

        when:
        taskService.execute("3","1","2","2","3","5","6")

        then:
        taskService.getGraphs().size() == 2
        taskService.getPointsNumber() == 6
    }

    def "test execute without any inputs"() {
        given:

        when:
        taskService.execute()

        then:
        taskService.getGraphs().size() == 0
        taskService.getPointsNumber() == 0
    }

    def "test execute with wrong inputs"() {
        given:

        when:
        taskService.execute("1", "kaka", "20", "null", "2", "5")

        then:
        taskService.getGraphs().size() == 0
        taskService.getPointsNumber() == 0
    }
}
