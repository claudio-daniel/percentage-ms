package com.server.external.percentage.ms.controller

import com.server.external.percentage.ms.model.response.PercentageResponse
import com.server.external.percentage.ms.service.PercentageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("percentage")
class PercentageController(
    private val percentageService: PercentageService
) {

    @GetMapping
    fun getPercentage(): PercentageResponse {
        return percentageService.getPercentage()
    }
}