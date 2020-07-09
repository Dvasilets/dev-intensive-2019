package com.skillbranch.devintensive

import com.skillbranch.devintensive.models.User
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun test_instance() {
//        val user1 = User("1")
//        val user2 = User("2", "Sined", "NotV")
//        val user3 = User("3", "Jeff", "IsMyName", null, lastVisit = null, isOnline = true)
//        user1.printMe()
//        user2.printMe()
//        user3.printMe()
//        println("$user1 $user2 $user3")
    }
    @Test
    fun test_factory(){
//        val testUser = User.makeUser("Hui Mocheniy")
//        val testUser2 = User.makeUser("Hui Mocheniy2")
        val testUser3 = User.makeUser("Dick poop")
        val testUser = testUser3.copy(id = "2", lastName = "check")
        print("$testUser3 \n$testUser")
    }
}
