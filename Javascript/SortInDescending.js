// Question: Perform sorting of an array in descending order

function bubbleSortDescending(arr) {
    const n = arr.length;

    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {
                const temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

const arr1 = [5, 2, 9, 1, 5, 6];
arr1.sort((a, b) => b - a);
console.log('Array after sorting in descending order using inbuilt method: ', arr1);

const arr2 = [5, 4, 9, 1, 0, 3];
bubbleSortDescending(arr2);
console.log('Array after sorting in descending order without using inbuilt method: ', arr2);
