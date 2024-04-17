/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    let map = new Map();

    for (i = 0; i < s.length; i++) {
        
        let sChar = s[i];
        let tChar = t[i];

        if (map.has(sChar)) {
            if(map.get(sChar) != tChar) {
                return false;
            }
        } else {
            map.set(sChar, tChar);
        }
    }

    return true;
};