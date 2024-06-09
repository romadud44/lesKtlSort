data class Employee(val name:String, val age:Byte, val salary: Int) {
    override fun toString(): String {
        return "$name, $age, З/П: $salary\n"
    }


}