package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame {
            if (game.pointsPlayerOne == 0)
                return TennisGame(1, 0, "Fifteen-Love")
            else return TennisGame(2, 0, "Thirteen-Love")
        }
    }
}
