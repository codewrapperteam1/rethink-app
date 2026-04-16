private var _tunFd: Int? = null

    fun tunFd(): Int? {
        return _tunFd ?: getTunFd().also { _tunFd = it }
    }

    private fun getTunFd(): Int? {
        // Implementation to retrieve current TUN file descriptor
        // Return Int or null based on TUN status
    }