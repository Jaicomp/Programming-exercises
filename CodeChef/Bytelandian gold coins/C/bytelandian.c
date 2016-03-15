#include <stdio.h>
#include <stdlib.h>

/*
*	@author: Jaicomp
*/

int main(){

	int coins;
	int garbage;
	short correct_answer = 0;


	printf("Welcome to Bytelandian, please enter your coins: ");
	garbage = scanf("%d", &coins);

	if (garbage == EOF || garbage == 0 || coins < 0 || coins > 1000000){
			perror("Incorrect input!!!");
			exit(EXIT_FAILURE);
	}


	printf("Result: %d\n", coins/2 + coins/3 + coins/4);

	return 0;
}





