#include "learner.h"
using namespace std;

int getPhrase(string userInput) {
    ifstream brainFile("brain/brain.txt");

    string phrase;
    string response;

    while(getline(brainFile, phrase, '|')) {
        getline(brainFile, response);

        if(userInput == phrase) {
            cout << "[Bobby]: " << response << endl;
            brainFile.close();
            return 1;
        }
    }
    // Quit if the user types "Quit"
    if((userInput == "Quit") || (userInput == "quit")) {
        exit(0);
    }
    // Cannot find the phrase, so need to go to the other function
    // After done with the file, always close it out.
    brainFile.close();
    return 0;
}