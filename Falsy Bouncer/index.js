function bouncer(arr) {
    var arr02 = [];
    for (var i = 0; i < arr.length; i++) {
        if (Boolean(arr[i])) {
            arr02.push(arr[i]);
        }

    }
    return arr02;
}
bouncer([7, "ate", "", false, 9]);
