#include "lib.h"

#define noop

void f(bool a, bool b) {
    if(a) {
        if (b) {
            noop;           
        }
    }
}

