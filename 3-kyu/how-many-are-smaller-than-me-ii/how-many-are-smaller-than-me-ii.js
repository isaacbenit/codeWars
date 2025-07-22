 
// function smaller(arr) {
//     //code me
//     let z=[]
//     let k=0
//         while(k<arr.length){
//             z.push(arr.filter((n)=>n<arr[0]).length)
//             k++
//             arr=arr.slice(1)
//         }
//         z.push(0)
//         return z
//  }
//  console.log(smaller([1, 1, -1, 0, 0]))
​
function smaller(nums) {
  console.log(nums)
let newArray =[]
for(index in nums){
    newArray.push(BigInt(nums.slice(index).filter(a=>a< nums[index]).length))
}
return newArray
}
console.log(smaller([1, 2, 3]))