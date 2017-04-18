import geb.Page

class DefaultPage extends Page {

    static at = { title.startsWith("skysail") }

    static content = {
        //manualsMenu { $("#header-content ul li", 0).module(MenuModule) }
        //loginLink { $("a", 1)}//, href="/_login") }
        //print(loginLink.text())
        loginLink { $("#loginLink") }
        logoutLink { $("#logoutLink") }
    }
}