version = 11


cloudstream {
    language = "hi"
    // All of these properties are optional, you can safely remove them

    description = "Hard to scrap, dropped"
    authors = listOf("dontseehere")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 0// will be 3 if unspecified
    tvTypes = listOf(
        "TvSeries",
        "Movie",
        "Anime",
        "Cartoon"
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=deadtoons.co/&sz=%size%"
}
