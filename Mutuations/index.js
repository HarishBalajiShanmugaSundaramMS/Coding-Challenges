function mutation(arr) {
    var string01 = arr[0].toLowerCase();
    var string02 = arr[1].toLowerCase();
    var length = string02.length;
    var bool = true;
    for (var i = 0; i < length; i++) {
        bool *= string01.includes(string02[i]);
    }
    if (bool) {
        return true;
    }
    else {
        return false;
    }
}

console.log(mutation(["hello", "loh"]));
