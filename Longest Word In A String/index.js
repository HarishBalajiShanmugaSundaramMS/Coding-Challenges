function findLongestWordLength(str) {
    var words = str.split(" ");
    var array01 = [];
    var len = words.length;
    for (var i = 0; i < len; i++) {
        //console.log(words[i] +" "+words[i].length);
        array01.push(words[i].length);
    }
    //console.log(array01);
    //console.log(Math.max(...array01));
    return Math.max(...array01);
}

console.log(findLongestWordLength("The quick brown fox jumped over the lazy dog"));
