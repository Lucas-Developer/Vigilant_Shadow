#include <iostream>
#include <time.h>

//Função que imprime uma linha
void line()
{
    std::cout << "\n===================================================================" << '\n';
}

//Função que indica a espera da entrada do usuario
void signal()
{
    std::cout << "\n-> ";
}

//Função para capturar a hora atual do sistema
void gettime()
{
  time_t theTime = time(NULL);
  struct tm *aTime = localtime(&theTime);

  int hour=aTime->tm_hour;
  int min=aTime->tm_min;

  std::cout << hour << ":" << min << '\n';

}

//Função para capturar a data do sistema
void getdate()
{
  time_t theTime = time(NULL);
  struct tm *aTime = localtime(&theTime);
  int day = aTime->tm_mday;
  int month = aTime->tm_mon + 1; // O mes é de 0 até 11, some 1 para ter o conceito jan. até dez. (1-12)
  int year = aTime->tm_year + 1900; // Os anos são # anos desde 1900

  std::cout << day << "/" << month << "/" << year << '\n';
}

int main(int argc, char const *argv[])
{
  getdate();
  gettime();

return 0;
}
