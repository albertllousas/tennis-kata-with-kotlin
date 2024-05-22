package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame =
            playerWinsPoint(game.pointsPlayerOne.inc(), game.pointsPlayerTwo)

        fun playerTwoWinsPoint(game: TennisGame): TennisGame =
            playerWinsPoint(game.pointsPlayerOne, game.pointsPlayerTwo.inc())

        private fun playerWinsPoint(p1: Int, p2: Int): TennisGame {
            if (p1 >= 4 && p1 > p2 + 2) return TennisGame(p1, p2, "Player one wins")
            if (p1 >= 3 && p2 >= 3 && p1 == p2) return TennisGame(p1, p2, "Deuce")
            if (p1 >= 3 && p2 >= 3 && p1.dec() == p2) return TennisGame(p1, p2, "Advantage player one")
            if (p1 >= 3 && p2 >= 3 && p1 == p2.dec()) return TennisGame(p1, p2, "Advantage player two")
            return TennisGame(p1, p2, "${toScore(p1)}-${toScore(p2)}")
        }

        private fun toScore(points: Int) = when (points) {
            0 -> "Love"
            1 -> "15"
            2 -> "30"
            else -> "40"
        }
    }
}
