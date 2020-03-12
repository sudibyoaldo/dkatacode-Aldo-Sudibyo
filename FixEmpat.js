//Problem statement
//Write a program that uses a single asynchronous filesystem operation 
//to read a file and print the number of newlines it contains to the console (stdout), 
//similar to running  wc -l file. Bonus point: extend the program to count words

var fs = require('fs');
let enter = "\n"
// Or
// let enter = "\x0D";
fs.readFile('FiXEmpat.js', 'utf8', function(err, contents) {
    if (err) {
        return console.log(err)
    } else {
        var new_line = contents.split(enter);
        console.log(new_line.length);
    }
});