this.metaClass.mixin(cuke4duke.GroovyDsl)

import codebreaker.Game
import cuke4duke.*
import static org.junit.Assert.*

Given(~/YYthe secret code is (.*)/) { String code ->
    game = new Game(stripSpace(code))
}

When(~/YYI guess (.*)/) { String code ->
    mark = game.guess(stripSpace(code))
}

Then(~/YYthe mark should be (.*)/) { String code ->
    assertEquals(code, mark)
}

def stripSpace(s) {
   return s.replaceAll(" ", "")   
}
