/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.toLowerCase().replace(/[^A-Za-z0-9]/g, '');
    
    let sLen = s.length;

    for (i = 0; i < sLen / 2; i++) {
        if (s[i] !== s[sLen - 1 - i]) {
            return false;
        }
    }

    return true;
};