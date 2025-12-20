/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    let matrixLength = matrix.length;

    for (i = 0; i < matrixLength / 2; i++) {
        for (j = i; j < matrixLength - i - 1; j++) {
            let temp = matrix[i][j];
            matrix[i][j] = matrix[matrixLength - 1 - j][i];
            matrix[matrixLength - 1 - j][i] = matrix[matrixLength - 1 - i][matrixLength - 1 - j];
            matrix[matrixLength - 1 - i][matrixLength - 1 - j] = matrix[j][matrixLength - 1 - i];
            matrix[j][matrixLength - 1 - i] = temp;
        }
    }

    return matrix;
};