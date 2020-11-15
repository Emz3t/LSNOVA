#README
For running each of the tasks user needs to write in terminal\
`gradle runTask1`\
`gradle runTask2`\
`gradle runTask3`\
and then provide arguments inside.

Example:

`gradle runTask1 --args '1 10 20 20 2 5'`

##DEV-TEST
The dev-test is all about basic skills of programming, where basic does not mean easy part, but the core of programming. Having your answer will allow us to better understand where you are as a programmer, and what journey is in front of us.\

For the following three tasks, please provide a working java code. For the ease of use, you may write a plain java (8+) console application (that we can run in the terminal) that reads the input from standard I/O. In any case - the final solution is up to you, providing at least small README.md for each of application is mandatory.\

Finally:

in case you need it - use maven over gradle
sharing the code as a github repo is an extra +
please keep the format of the expected output
the input of the tasks can be really large (up to hundreds of thousands of values), so please think about optimum solution in terms of memory and performance
in case you need more pieces of information, feel free to ask (better to create the solution for something that you understand fully, rather than guessing what we have in our minds)


###tasks.Task list
####tasks.Task1
The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order, plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.

Sample:

For the input:

`1 10 20 20 2 5`
expected output is:

`1 2 5 10 20`  
`count: 6`  
`distinct: 5`  
`min: 1`  
`max: 20`  

####tasks.Task2

Again, the input is a long list of integers. Provide a working code that will find all the pairs (in this integer list) that sum up to 13. Each pair in the output should have first number not greater than the second one and lines should be sorted in an ascending order.

Sample:

For the input:

`1 2 10 7 5 3 6 6 13 0`

expected output is:

`0 13`  
`3 10`  
`6 7`  
`6 7`  
####tasks.Task3
The first line of input contains a positive number n, next n lines contains pairs of positive integers, where each pair identifies a connection between two vertices in a graph. Please provide a working code that will give us the answer for the following questions: how many separated graphs are in the input.

Sample:

For the input:

`3
1 2
2 3
5 6`
expected output is:

`2`
Explanation: first graph contains vertices 1, 2 and 3 while the second one contains 5 and 6.
