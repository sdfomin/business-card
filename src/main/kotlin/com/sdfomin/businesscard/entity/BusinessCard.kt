package com.sdfomin.businesscard.entity

data class BusinessCard(
    val id: Int = 0,
    val userId: Int,
    val handle: String,
    val logoImage: String?,
    val description: String,
    val businessContacts: Contacts,
    val personContacts: Contacts,
    val appleCardAttributes: AppleCardAttributes,
)
