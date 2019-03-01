package se.inera.intyg.intygsbestallning.user

data class User(
   val id: Long = 1,
   val firstName: String = "Tolvan",
   val lastName: String = "Tolvansson",
   val address: Address = Address()
) {

  constructor(userEntity: UserEntity) : this(
   id = userEntity.id ?: 1,
   firstName = userEntity.firstName ?: "inget",
   lastName = userEntity.lastName ?: "inget",
   address = Address()
  )
}

data class Address(
   val streetName: String = "TolvGatan",
   val streetNumber: Int = 12,
   val city: String = "Tolvköping",
   val country: Country = Country.TWELVELAND
)

enum class Country {
  SWEDEN,
  TWELVELAND
}
