package kata

import io.kotest.matchers.shouldBe
import kata.TennisGame.Companion.playerOneWinsPoint
import org.junit.jupiter.api.Test

class TennisGameTest {

    @Test
    fun `should start a game with initial score as Love-Love`() {
        val result = TennisGame(0, 0, "Love-Love")

        result shouldBe TennisGame(pointsPlayerOne = 0, pointsPlayerTwo = 0, score = "Love-Love")
    }

    @Test
    fun `should increase the score from Love to Fifteen when a player wins the first point`() {
        val game = TennisGame()

        val result = playerOneWinsPoint(game)

        result shouldBe TennisGame(1, 0, "Fifteen-Love")
    }

    @Test
    fun `should increase the score from Fifteen to Thirteen when a player wins the second point`() {
        val result = TennisGame()
            .let(::playerOneWinsPoint)
            .let(::playerOneWinsPoint)

        result shouldBe TennisGame(2, 0, "Thirteen-Love")
    }
}
