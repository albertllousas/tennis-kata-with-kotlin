package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame =
            playerWinsPoint(game.pointsPlayerOne.inc(), game.pointsPlayerTwo)

        fun playerTwoWinsPoint(game: TennisGame): TennisGame =
            playerWinsPoint(game.pointsPlayerOne, game.pointsPlayerTwo.inc())

        private fun playerWinsPoint(p1: Int, p2: Int): TennisGame =
            when {
                p1 >= 4 && p1 >= p2 + 2 -> "Player one wins"
                p2 >= 4 && p2 >= p1 + 2 -> "Player two wins"
                p1 >= 3 && p2 >= 3 && p1 == p2 -> "Deuce"
                p1 >= 3 && p2 >= 3 && p1.dec() == p2 -> "Advantage player one"
                p1 >= 3 && p2 >= 3 && p1 == p2.dec() -> "Advantage player two"
                else -> "${toScore(p1)}-${toScore(p2)}"
            }.let { score -> TennisGame(p1, p2, score) }

        private fun toScore(points: Int) = when (points) {
            0 -> "Love"
            1 -> "15"
            2 -> "30"
            else -> "40"
        }
    }
}
