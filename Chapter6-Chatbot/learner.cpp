#include "learner.h"
using namespace std;

void learner(string inputPhrase) {
    string storePhrase = inputPhrase;
    cout << "Not Found! Tell me what to enter for '" << storePhrase << "' : ";
    string learningResponse;
    getline(cin, learningResponse);
    cout << learningResponse << endl;
    
    // Open file for writing: parameters indicate that you will APPEND to the end
    ofstream saveBrain;
    saveBrain.open("brain/brain.txt", std::ios::out | std::ios::app);
    if(!saveBrain.is_open()) {
        cout << "Error! File is open..." << endl;
    }
    else {
        saveBrain << endl << storePhrase << "|" << learningResponse;
        saveBrain.close();
    }
    return;
}