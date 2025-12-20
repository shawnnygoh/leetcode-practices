/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    let matrixRows = matrix.length;
    let matrixCols = matrix[0].length;

    for (i = 0; i < matrixRows; i++) {
        for (j = 0; j < matrixCols; j++) {
            if (matrix[i][j] == target) {
                return true;
            }
        }
    }

    return false;
};