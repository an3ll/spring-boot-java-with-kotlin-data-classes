package se.inera.intyg.intygsbestallning.user

import javax.persistence.*

@Entity
@Table(name = "user_entity")
data class UserEntity(

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   val id: Long? = null,

   @Column(name = "first_name", nullable = false)
   val firstName: String? = null,

   @Column(name = "last_name", nullable = false)
   val lastName: String? = null,

   @Column(name = "age", nullable = false)
   val age: Int? = null
)
