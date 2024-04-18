/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    let map = new Map();

    for (i = 0; i < magazine.length; i++) {
        let mChar = magazine[i];
        map[mChar] = mChar in map ? map[mChar] + 1 : 1;
    }
    
    for (j = 0; j < ransomNote.length; j++) {
        let rChar = ransomNote[j];
        if (!(rChar in map) || map[rChar] < 1) {
            return false;
        }
        map[rChar]--;
    }

    return true;
};