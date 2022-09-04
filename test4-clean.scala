// je vais (essayer de) coder en functional
import java.awt.Desktop;
import java.io;
import java.net.URI;
import scala.io.StdIn.readLine

class ResauxSociaux(url: String) {
    
    def make_instagram: String = {
        return "https://instagram.com/".+(url)
    }
    def make_twitter: String = {
        return "https://twitter.com/".+(url)
    }
    def make_linktree: String = {
        return "https://linktr.ee/".+(url)
    }
}

object test2 {
    def main(args: Array[String]) {
        
        val desk: Desktop = Desktop.getDesktop()

        def input: Int = {
            println("1. instagram" ) ; println("2. twitter") ; println("3. linktree") ; println("veuillez choisir (1 à 3): ")
            readLine.toInt
        }
        
        def makeChoice: Int = {
            args.length match {
                case 1 => input
                case 2 => args(1).toInt
            }
        }
        val choice: Int = makeChoice
        
        def makeURL(choice: Int): String = {
            choice match {
            case 1 => instance.make_instagram
            case 2 => instance.make_twitter
            case 3 => instance.make_linktree
            case _ => "erreur"}
        }

        desk.browse(new URI(makeURL(choice)));
    }
}