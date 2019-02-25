package se.inera.intyg.intygsbestallning.user

interface DtoObject

data class User(
   val id: Long = 1,
   val firstName: String = "Tolvan",
   val lastName: String = "Tolvansson",
   val address: Address = Address()) : DtoObject {

  constructor(userWithBuilderPattern: UserWithBuilderPattern) : this(
     id = userWithBuilderPattern.id,
     firstName = userWithBuilderPattern.firstName,
     lastName = userWithBuilderPattern.lastName,
     address = userWithBuilderPattern.address
  )
}

data class Address(
   val streetName: String = "TolvGatan",
   val streetNumber: Int = 12,
   val city: String = "Tolvköping",
   val country: Country = Country.TWELVELAND
) : DtoObject

enum class Country {
  SWEDEN,
  TWELVELAND
}
