package tasks

import spock.lang.Shared
import spock.lang.Specification

class Task2Test extends Specification {

    @Shared
    def taskService

    def setup() {
        taskService = new Task2()
    }

    def "test execute with good inputs"() {
        given:

        when:
        taskService.execute("1", "2", "10", "7", "5", "3", "6", "6", "13", "0")

        then:

        taskService.getNumbers().size() == 10
        taskService.getPairs() == 4
    }

    def "test execute without any inputs"() {
        given:

        when:
        taskService.execute()

        then:
        taskService.getNumbers().size() == 0
        taskService.getPairs() == 0
    }

    def "test execute with wrong inputs"() {
        given:

        when:
        taskService.execute("1", "kaka", "20", "null", "2", "5")

        then:
        taskService.getNumbers().size() == 0
        taskService.getPairs() == 0    }
}
