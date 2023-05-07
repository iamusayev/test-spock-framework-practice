package az.iamusayev.util

import spock.lang.Specification

class CalculationUtilTest extends Specification {

    def "should return sum of two numbers"() {
        given:
        def a = 5
        def b = 10

        when:
        def result = CalculationUtil.sum(a, b)

        then:
        result == 15
    }
}