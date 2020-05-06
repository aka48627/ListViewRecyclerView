package com.example.listviewrecyclerview.MyServices

import com.example.listviewrecyclerview.Model.MyCategory
import com.example.listviewrecyclerview.Model.MyProducts

//this is singleton type
object MyDataService {
    val categories_lis= listOf(){
        MyCategory("SHIRTS","shirtimage")
        MyCategory("HOODIES","hoodieimage")
        MyCategory("HATS","hatimage")
        MyCategory("DIGITAL","digitalgoodimage")
    }
    val hats_list= listOf(){
        MyProducts("Hat 1","$20","hat1")
        MyProducts("Hat 2","$22","hat2")
        MyProducts("Hat 3","$23","hat3")
        MyProducts("Hat 4","$24","hat4")
    }

    val shirt_list= listOf(){
        MyProducts("Shirt 1","$30","shirt1")
        MyProducts("Shirt 2","$32","shirt2")
        MyProducts("Shirt 3","$33","shirt3")
        MyProducts("Shirt 4","$34","shirt4")
        MyProducts("Shirt 5","$35","shirt5")
    }
    val  hoodies_list= listOf(){
        MyProducts("Hoodie 1","$25","hoodie1")
        MyProducts("Hoodie 2","$22","hoodie2")
        MyProducts("Hoodie 3","$24","hoodie3")
        MyProducts("Hoodie 4","$23","hoodie4")
    }
}