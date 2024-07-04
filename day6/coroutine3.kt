import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        withTimeout(2000L) {
            println("Starting task...")
    		delay(3000L)
    		println("task completed.")
        }
    } catch (e: TimeoutCancellationException) {
        println("IT WAS CANCELLED AS IT TAKING SO LONG DURATION.")
    }
}
