/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    let map = new Map();
    let set = new Set();

    for (i = 0; i < s.length; i++) {

        let sChar = s[i];
        let tChar = t[i];

        if (map.has(sChar)) {
            if (map.get(sChar) != tChar) {
                return false;
            }
        } else {
            if (set.has(tChar)) {
                return false;
            }
            map.set(sChar, tChar);
            set.add(tChar);
        }
    }

    return true;
};