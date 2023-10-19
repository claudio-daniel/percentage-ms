package com.server.external.percentage.ms.service

import com.server.external.percentage.ms.model.response.PercentageResponse

interface PercentageService {
    fun getPercentage(): PercentageResponse
}