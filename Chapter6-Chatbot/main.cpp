#include "learner.h"
using namespace std;

void showMessage();
int getPhrase(string phrase);
void learner(string storePhase);
int main() {
    showMessage();
    string userInput;
    do {
        cout << "[You]: ";
        getline(cin, userInput);
        // x or X will close out the program
        if(userInput != "x" && userInput != "X") {
            if(getPhrase(userInput)) {
              // Keep going  
            }
            else {
                // Need to learn this phrase and response
                learner(userInput);
            }
        }
    }
    while(userInput != "x" && userInput != "X");
    return 0;
}