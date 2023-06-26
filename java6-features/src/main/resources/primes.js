function calcPrimeNumbers(limit) {
	for (var i = 2; i < limit; i += 1) {
		for (var j = 2; j * j <= i; j += 1) {
			rem = i % j;
			if (rem == 0.0)
				break;
		}
		if (j * j > i) {
			print(i + ", ");
		}
	}
}
calcPrimeNumbers(100);