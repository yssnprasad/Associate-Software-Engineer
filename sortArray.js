function sortArray(arr) {
    return arr.sort((a, b) => b - a);
}

const inputArray = [5, 3, 9, 1, 4];
const sortedArray = sortArray(inputArray);
console.log(sortedArray);
