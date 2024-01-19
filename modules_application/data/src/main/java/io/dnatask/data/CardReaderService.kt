package io.dnatask.data

import kotlinx.coroutines.delay
import java.util.Calendar
import java.util.Calendar.SECOND
import java.util.UUID

class CardReaderService {

    suspend fun readCard(): CardData {
        val second = Calendar.getInstance().get(SECOND)

        if (second <= 5) {
            // User will need some time to use the card
            delay(4000)
            return CardData(UUID.randomUUID().toString())
        }

        throw CardReaderException()
    }
}

data class CardData(val token: String)

class CardReaderException : Throwable("Could not read card data")

