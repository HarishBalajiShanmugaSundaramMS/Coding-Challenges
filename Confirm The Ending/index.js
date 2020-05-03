function confirmEnding(str, target) {
    var words = str.split(" ");
    var len01 = words.length;
    var len02 = target.length;

    for (var i = 0; i < len01; i++) {
        console.log(words);
        console.log(target);
        var str2 = str.slice(-len02);
        var n = str2.includes(target);
        if (str2 === target) {
            return true;
        } else {
            return false;
        }
    }
}

console.log(confirmEnding("He has to give me a new name", "name"));
