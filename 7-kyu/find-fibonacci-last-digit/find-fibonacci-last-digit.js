 
function getLastDigit(index) {
    // write your code below. Good luck!
   let array =[1,1]
     while(array.length !== index){
​
        array.push(array.slice(-2).reduce((a,b)=> a+b)
    }
    return array.slice(-1)[0].toString().slice(-1)
}