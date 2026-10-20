package com.kishore.qa.tools;

import java.io.PrintStream;

/** One CLI sub-command. */
public interface Command {

  String name();

  String summary();

  /** Returns the process exit code: 0 success, 1 policy failure, 2 usage error. */
  int run(String[] args, PrintStream out);
}
