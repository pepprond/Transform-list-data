fun main(args: Array<String>) {
    val list1= listOf(1,2,3,4,5,6,7,8,9)
    list1.map { it -> it.toString()}.forEach{it -> println("list to string: $it")}

    println("${list1.toTypedArray()}")
}