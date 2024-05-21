package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame {
            val playersOnePoints = game.pointsPlayerOne.inc()
            val playersOneScore = toScore(playersOnePoints)
            val playersTwoScore = toScore(game.pointsPlayerTwo)
            return TennisGame(playersOnePoints, game.pointsPlayerTwo, "$playersOneScore-$playersTwoScore")
        }

        fun playerTwoWinsPoint(game: TennisGame): TennisGame {
            val playersTwoPoints = game.pointsPlayerTwo.inc()
            val playersTwoScore = toScore(playersTwoPoints)
            val playersOneScore = toScore(game.pointsPlayerOne)
            return TennisGame(game.pointsPlayerOne, playersTwoPoints, "$playersOneScore-$playersTwoScore")
        }

        private fun toScore(points: Int) = when (points) {
            0 -> "Love"
            1 -> "15"
            2 -> "30"
            else -> "40"
        }
    }
}
