package controllers.api

import play.api.mvc._
import javax.inject._
import play.api._


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class ecole @Inject()(
cc : ControllerComponents
) { 

 
  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
 {
 
  }
}
