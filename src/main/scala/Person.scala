package person:

    class Person(val name: String):
        override def toString = s"${getClass.getName}[name=$name]"

    class SecretAgent(codename: String) extends Person(codename):
        override val name: String = "secret"
        override def toString: String = "secret"
