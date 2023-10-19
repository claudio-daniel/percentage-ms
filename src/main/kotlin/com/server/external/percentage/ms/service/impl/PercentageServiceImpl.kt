package com.server.external.percentage.ms.service.impl

import com.server.external.percentage.ms.model.response.PercentageResponse
import com.server.external.percentage.ms.service.PercentageService
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class PercentageServiceImpl : PercentageService {
    companion object {
        private const val MAX_PERCENTAGE = 100
        private const val MIN_PERCENTAGE = 0

    }

    override fun getPercentage(): PercentageResponse {
        val randomPercentage = Random.nextInt(from = MIN_PERCENTAGE, until = MAX_PERCENTAGE)

        return PercentageResponse(percentage = randomPercentage)
    }
}