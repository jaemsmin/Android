package com.example.myapplication

class Search {

    private val names: String =
        "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌"
    private val kim: String = "김"
    private val lee: String = "이"
    private val leejaeyoung: String = "이재영"

    var familyNameCount: Int = 0
    var nameCount: Int = 0

    fun init() {
        var nameArray: List<String> = names.split(",")
        var nameSet: MutableSet<String> = mutableSetOf()


        for (i in 1 until nameArray.size) {
            if (nameArray[i].startsWith(kim) || nameArray[i].startsWith(lee)) {
                familyNameCount++
            }
            if (nameArray[i].contains(leejaeyoung)) {
                nameCount++
            }
            nameSet.add(nameArray[i])
            println(i)
        }

        println("Kim + Lee? : $familyNameCount")
        println("LeeJaeYoung? : $nameCount")
        println("RemoveRepeat : $nameSet")
        println("Sort : " + nameSet.toList().sorted());

    }

}
