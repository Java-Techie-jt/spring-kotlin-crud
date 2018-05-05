package com.javatechie.spring.kotlin.crud.api.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.GeneratedValue

@Entity
@Table
data class Company(
		@Id
		@GeneratedValue
		val id: Int = 0,
		val name: String = "",
		val address: String = "")