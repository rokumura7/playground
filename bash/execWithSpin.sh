#!/bin/bash

function execCmd() {
  cmd=$1
  `$cmd` &> /dev/null &
  PID=$!
  local chars=('/' '-' '\' '|') i=0 mod=0
  echo;
  while :; do
    sleep .1
    printf "\r $cmd %2s" ${chars[mod]}
    mod=$(( ++i % ${#chars[@]} ))
    cnt=`ps -p $PID | grep $PID | wc -l`
    if [ $cnt -eq 0 ]; then
      printf "\r $cmd DONE"
      break;
    fi
  done
  echo;
  echo;
}