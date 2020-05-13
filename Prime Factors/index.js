function primeFactors(num) {
    var array01 = [];
    var divisor = 2;
    while (divisor <= num) {
        if (num % divisor == 0) {
            array01.push(divisor);
            num=num/divisor;
        }
        else {
            divisor += 1;
        }
    }
    return array01;

}
console.log(primeFactors(630));
