package com.bukalapak.hero.repositories

import com.bukalapak.hero.models.Disaster
import org.springframework.data.repository.PagingAndSortingRepository

interface DisasterRepository extends PagingAndSortingRepository<Disaster, Long> {}