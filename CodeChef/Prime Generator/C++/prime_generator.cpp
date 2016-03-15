#include <iostream>
using namespace std;

/*
*	@author Jaicomp
*/


bool is_prime(int number);

int main(){

	int num_cases, inum, fnum;

	cout << "Introduce el número de casos: " << endl;
	cin >> num_cases;

	for(int i = 0; i < num_cases; i++){
	
		cout << "Introduce el rango entre que queremos buscar los numeros primos:" << endl;
		cout << "Primer numero: " << endl;
		cin >> inum;
		cout << "Segundo numero: " << endl;
		cin >> fnum;


		if (inum <= fnum){
			for(int j = inum; j <= fnum; j++){
			
				if (is_prime(j)){
					cout << "Primo: " << j << endl;
				}

			}
		}else{
			cout << "Numero incorrectos, vuelva a repetir." << endl;
			i--;
		}

	}


}

bool is_prime(int n){

	for(int i = 2; i * i <= n; i++){

		if ((n%i)==0) return false;

	}
	return true;

}





