/**
 * @param {number} x
 * @return {number}
 */

var reverse = function(x) {
    let reversedInt = Math.abs(x).toString().split("").reverse().join("");
    
    if (reversedInt > Math.pow(2, 31) - 1) {
        return 0;
    }

    return Math.sign(x) * reversedInt;
};