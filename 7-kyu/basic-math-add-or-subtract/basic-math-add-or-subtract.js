function calculate(str) {
 let newStr1 = str.replaceAll("plus", "+");
let ar = newStr1.replaceAll("minus", "-")
let solution = eval(ar)
  return String(solution);
}