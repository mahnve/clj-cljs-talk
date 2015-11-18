SRC=$(wildcard src/*.java)

BUILD=$(patsubst src/%.java, build/%.class, ${SRC})

${BUILD}: ${SRC}
	javac $? -d build

.PHONY: run clean compile

compile: ${BUILD}

run:
	java -cp build HelloWorld

clean:
	rm -rf build/*
