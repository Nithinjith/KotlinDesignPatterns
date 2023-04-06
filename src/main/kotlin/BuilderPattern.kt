import org.jetbrains.annotations.TestOnly
import java.nio.file.attribute.AclEntry.Builder

class User private constructor(builder: Builder) {
    var userName: String? = null
    var userAge: Int? = null
    var userGender: String? = null
    var userBio: String? = null

    class Builder {
        private var userName: String? = null
        private var userAge: Int? = null
        private var userGender: String? = null
        private var userBio: String? = null

        fun setUserName(userName: String) = apply { this.userName = userName }
        fun setUserAge(userAge: Int) = apply { this.userAge = userAge }
        fun setUserGender(userGender: String) = apply { this.userGender = userGender }
        fun setUserBio(userBio: String) = apply { this.userBio = userBio }

        fun getUserName() = this.userName
        fun getUserAge() = this.userAge
        fun getUserGender() = this.userGender
        fun getUserBio() = this.userBio

        fun build() = User(this)
    }

    init {
        userName = builder.getUserName()
        userAge = builder.getUserAge()
        userGender = builder.getUserGender()
        userBio = builder.getUserBio()
    }
}

fun main() {
    val user: User =
        User.Builder().setUserName("Nithinjith").setUserAge(34).setUserGender("Male").setUserBio("Good User").build()
    println(user.userName)
}