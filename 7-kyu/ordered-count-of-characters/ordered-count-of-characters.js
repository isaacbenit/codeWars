const orderedCount = function (text) {
  let array1=[...new Set(text.split(''))]
  return array1.map(val => [val, text.split('').filter(v=> v===val).length])
}