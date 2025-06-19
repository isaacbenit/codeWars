function findArray(arr1, arr2){
  // solution
  let newArray= []
  if(arr1.length===0){
      return []
  }
  for (let i=0;i<arr2.length;i++){
      newArray.push(arr1[arr2[i]])
  }
  return newArray
}
console.log(findArray(['a', 'a', 'a', 'a', 'a'], [2, 4]))