/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let words = s.trim().split(" ");
    let wordsLength = words.length;
    return words[wordsLength - 1].length;
};
