package kata

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class TennisGameTest {

    @Test
    fun `should start a game with initial score as Love-Love`() {
        val result = TennisGame(0, 0, "Love-Love")

        result shouldBe TennisGame(pointsPlayerOne = 0, pointsPlayerTwo = 0, score = "Love-Love")
    }
}
