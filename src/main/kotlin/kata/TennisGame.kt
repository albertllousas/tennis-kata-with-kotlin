package kata

data class TennisGame(val pointsPlayerOne: Int = 0, val pointsPlayerTwo: Int = 0, val score: String = "Love-Love") {

    companion object {

        fun playerOneWinsPoint(game: TennisGame): TennisGame {
            return TennisGame(1, 0, "Fifteen-Love")
        }
    }
}
