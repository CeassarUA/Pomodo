package com.kirik.pomodo
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>