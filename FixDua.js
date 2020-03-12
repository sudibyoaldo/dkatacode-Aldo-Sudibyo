//Probelm statement
//Create a function to Percentages an array of percentages to their decimal representations

var PercentagesToDecimal = function PercentagesToDecimal(percentages) {
  let arr_result = []
  percentages.forEach(val => {
    let temp= val.split('%')
    arr_result.push(+temp[0]/100)
  })
  return arr_result
}
console.log(PercentagesToDecimal(["33%", "98.1%", "56.44%", "100%"]))