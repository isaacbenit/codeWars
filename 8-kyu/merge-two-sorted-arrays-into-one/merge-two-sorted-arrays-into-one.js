function mergeArrays(arr1, arr2) {
  return [... new Set([arr1,arr2].flat())].sort((a,b)=>a-b)
}