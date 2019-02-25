package se.inera.intyg.intygsbestallning.user

import java.lang.IllegalArgumentException

class UserWithBuilderPattern private constructor(builder: UserWithBuilderPattern.Builder) {

  val id: Long
  val firstName: String
  val lastName: String
  val address: Address

  init {
    this.id = builder.id ?: throw IllegalArgumentException()
    this.firstName = builder.firstName ?: throw IllegalArgumentException()
    this.lastName = builder.lastName ?: throw IllegalArgumentException()
    this.address = builder.address ?: throw IllegalArgumentException()
  }

  class Builder {
    var id: Long? = null
    var firstName: String? = null
    var lastName: String? = null
    var address: Address? = null

    fun id(id: Long) = apply { this.id = id }
    fun firstName(firstName: String) = apply { this.firstName = firstName }
    fun lastName(lastName: String) = apply { this.lastName = lastName }
    fun address(address: Address) = apply { this.address = address }
    fun build() = UserWithBuilderPattern(this)
  }
}
