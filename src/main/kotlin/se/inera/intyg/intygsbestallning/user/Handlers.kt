package se.inera.intyg.intygsbestallning.user

import org.springframework.stereotype.Component

interface Handler<out T : DtoObject > {
  fun get(): List<T>
}

@Component
class UserHandler : Handler<User> {
  override fun get(): List<User> {

    val defaultUser = User()

    val defaultAddress = Address()
    val customUser = User(id = 2L, firstName = "CustomTolvan", lastName = "Twelvansson", address = defaultAddress)

    val userWithBuildPattern = UserWithBuilderPattern.Builder()
       .id(3L)
       .firstName("firstName")
       .lastName("lastname")
       .address(defaultAddress)
       .build()

    return listOf(defaultUser, customUser, User(userWithBuildPattern))
  }
}
