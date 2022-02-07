dir := $(shell pwd)

CC=clang
LD=ld

CFLAGS +=-c -g -fprofile-arcs -ftest-coverage
LDFLAGS+=-g -fprofile-arcs -ftest-coverage

BINS = lib test

lib: lib.o

lib.o: lib.cpp lib.h
	$(CC) $(CFLAGS) $(dir)/$<

test: test.o lib.o

test.o: test.cpp
	$(CC) $(CFLAGS) $(dir)/$<

coverage: test
	./test
	lcov --rc lcov_branch_coverage=1 -t sample_test -o sample_test.info -c -d .

clean:
	rm -f *.o *.img *.gcno *.gcda $(BINS)
