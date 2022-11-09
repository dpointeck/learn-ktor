package plugins

import routes.customerRouting
import io.ktor.server.routing.*
import io.ktor.server.application.*
import routes.getOrderRoute
import routes.listOrdersRoute
import routes.totalizeOrderRoute

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
