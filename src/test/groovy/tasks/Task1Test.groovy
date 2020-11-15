package tasks

import spock.lang.Shared
import spock.lang.Specification

class Task1Test extends Specification {

    @Shared
    def taskService

    def setup() {
        taskService = new Task1()
    }

    def "test execute with good inputs"() {
        given:

        when:
        taskService.execute("1", "10", "20", "20", "2", "5")

        then:

        taskService.getCount() == 6
        taskService.getNumbers().size() == 5
        taskService.getNumbers().first() == 1
        taskService.getNumbers().last() == 20
    }

    def "test execute without any inputs"() {
        given:

        when:
        taskService.execute()

        then:
        taskService.getCount() == 0
    }

    def "test execute with wrong inputs"() {
        given:

        when:
        taskService.execute("1", "kaka", "20", "null", "2", "5")

        then:
        taskService.getCount() == 0
    }
}
