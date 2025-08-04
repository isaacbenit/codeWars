function reverseWords(str) {
  return str.split(' ').map(a=> a.split('').reverse().join('')).join(' ')
}
console.log(reverseWords('isaac'))