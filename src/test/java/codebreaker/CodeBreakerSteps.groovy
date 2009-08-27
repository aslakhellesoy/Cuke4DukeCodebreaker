this.metaClass.mixin(cuke4duke.GroovyDsl)

import codebreaker.Game
import cuke4duke.*
import static org.junit.Assert.*

Given(~/the secret code is (.*)/) { String code ->
    game = new Game(stripSpace(code))
}

When(~/I guess (.*)/) { String code ->
    mark = game.guess(stripSpace(code))
}

Then(~/the mark should be (.*)/) { String code ->
    assertEquals(code, mark)
}

def stripSpace(s) {
   return s.replaceAll(" ", "")   
}
