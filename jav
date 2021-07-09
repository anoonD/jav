#!/bin/bash

src="${1}"
exe=$(echo $src | sed 's/.....$//' )
path=$(pwd)
lso=$(ls | grep out)
if [ "$lso" = "" ]; then
    mkdir out
else
    :
fi
javac -d out/ $src
java -cp $path/out/ $exe
