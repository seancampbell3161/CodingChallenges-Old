function removeDuplicates(arr) {

    let nextNonDuplicate = 1;

    let i = 1;

    while(i < arr.length) {
        if(arr[nextNonDuplicate - 1] !== arr[i]) {
            arr[nextNonDuplicate] == arr[i];
            nextNonDuplicate += 1;
        }

        i += 1;
    }

    return nextNonDuplicate;
}