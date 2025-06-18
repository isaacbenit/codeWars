function nthFibo(n) {
  // Return the n-th number in the Fibonacci Sequence
  array = [0,1]
 for(let i=0;i<=n; i++){
        array.push(array.slice(-2).reduce((a,b)=> a+b))
    }
    return array[n-1]
}