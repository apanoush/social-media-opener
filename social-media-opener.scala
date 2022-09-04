// je vais (essayer de) coder en functional
import java.awt.Desktop;
import java.io;
import java.net.URI;
import scala.io.StdIn.readLine

class ReseauxSociaux(url: String, choice: Int) {
    
    def make_instagram: String = {
        return "https://instagram.com/".+(this.url)
    }
    def make_twitter: String = {
        return "https://twitter.com/".+(this.url)
    }
    def make_linktree: String = {
        return "https://linktr.ee/".+(this.url)
    }
    
    def makeURL: String = {
        this.choice match {
        case 1 => this.make_instagram
        case 2 => this.make_twitter
        case 3 => this.make_linktree
        case _ => "erreur"}
    }
}

object main {
    def main(args: Array[String]) {
        
        val desk: Desktop = Desktop.getDesktop()

        def input1: String = {
            println("votre @: ")
            readLine
        }

        def input2: Int = {
            println("1. instagram" ) ; println("2. twitter") ; println("3. linktree") ; println("veuillez choisir (1 à 3): ")
            readLine.toInt
        }

        def makeInstance: ReseauxSociaux = {
            args.length match {
                case 0 => new ReseauxSociaux(input1, input2)
                case 1 => new ReseauxSociaux(args(0), input2)
                case 2 => new ReseauxSociaux(args(0), args(1).toInt)
            }
        }

        val instance: ReseauxSociaux = makeInstance

        desk.browse(new URI(instance.makeURL));
    }
}