function counterEffect(hitCount) {
 //do your thing
  let array1= hitCount.split('')
    let newArray=[]
    let a=[0,1,2,3,4,5,6,7,8,9]
    for(index of array1)
    {
     newArray.push(a.slice(0,+index+1))   
    }
    return newArray
}