# Project-27-Threads
This is the assignment given in the Patika Java course.

The task is:

Create an ArrayList containing numbers from 1 to 10000 (ten thousand). Then, divide this ArrayList into 4 equal parts, each containing 2500 elements. Design 4 separate Threads to find the odd and even numbers within these 4 separate 2500-element ArrayLists.

The 4 Threads will add the even numbers they find to a common ArrayList.

The 4 Threads will add the odd numbers they find to a common ArrayList.

The ArrayLists that hold the odd and even numbers will be empty when first created. There will be two such ArrayLists.

When the 4 Threads start processing their respective 2500-element ArrayLists, they will fill the odd and even number ArrayLists.