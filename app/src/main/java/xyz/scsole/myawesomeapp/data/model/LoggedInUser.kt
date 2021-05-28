package xyz.scsole.myawesomeapp.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 *
 * @property userId The user's ID
 * @property displayName The user's display name
 */
data class LoggedInUser(
        val userId: String,
        val displayName: String
)