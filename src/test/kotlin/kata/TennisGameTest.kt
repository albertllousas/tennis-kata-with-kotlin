package kata

import io.kotest.matchers.shouldBe
import kata.TennisGame.Companion.playerOneWinsPoint
import kata.TennisGame.Companion.playerTwoWinsPoint
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

class TennisGameTest {

    @Test
    fun `should start a game with initial score as Love-Love`() {
        val result = TennisGame(0, 0, "Love-Love")

        result shouldBe TennisGame(pointsPlayerOne = 0, pointsPlayerTwo = 0, score = "Love-Love")
    }

    @TestFactory
    fun `increasing the score when a player wins a point`() =
        listOf(
            Triple(1, 0, "15-Love"),
            Triple(2, 0, "30-Love"),
            Triple(3, 0, "40-Love"),
            Triple(0, 1, "Love-15"),
            Triple(0, 2, "Love-30"),
            Triple(0, 3, "Love-40")
        ).map { (pointsP1, pointsP2, expected) ->
            dynamicTest("should score with $expected when player one scores $pointsP1 and player two scores $pointsP2 ") {
                val result = (1..pointsP1).fold(TennisGame()) { game, _ -> playerOneWinsPoint(game) }
                    .let { (1..pointsP2).fold(it) { game, _ -> playerTwoWinsPoint(game) } }

                result shouldBe TennisGame(pointsP1, pointsP2, expected)
            }
        }
}
