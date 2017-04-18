import geb.spock.GebReportingSpec

class DefaultRootSpec extends GebReportingSpec {

    def setup() {
        //browser.driver.javascriptEnabled = false
    }

    def cleanup() {
       // CachingDriverFactory.clearCache()
    }

    def "can get the index page"() {
        when:
        to DefaultPage

        //assert firstDiv.contains("Login")
        and:
        loginLink.click()

        /*and: //hover over to expand the menu
        interact {
            moveToElement(manualsMenu.toggle)
        }

        then: //first link is for the current manual
        manualsMenu.links[0].text().endsWith("- CURRENT")

        when:
        manualsMenu.links[0].click()*/

        then:
        at DefaultPage
    }
}