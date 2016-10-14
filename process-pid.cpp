#include <iostream>
#include <unistd.h>//Tutti i S.O. capiscono queste funzioni

int main(void)
{
	int number;
	std::cout<<"The PID of this process is: "<<getpid()<<std::endl;
	//The following instrction will block the process waiting for input
	std::cin>>number;
	return 0;
}
