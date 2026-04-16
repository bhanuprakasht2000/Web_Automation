// custom-reporter.ts
import type { FullConfig, FullResult, Reporter, TestCase, TestResult } from '@playwright/test/reporter';
import * as fs from 'fs';
import * as path from 'path';

class MyCustomReporter implements Reporter {
  private results: any[] = [];

  onTestEnd(test: TestCase, result: TestResult) {
    this.results.push({
      title: test.title,
      status: result.status,
      duration: result.duration,
      errors: result.errors,
    });
  }

  onEnd(result: FullResult) {
    console.log(`\nCustom Report: ${result.status}`);
    const outputPath = path.join(process.cwd(), 'custom-report.json');
    fs.writeFileSync(outputPath, JSON.stringify(this.results, null, 2));
    console.log(`Custom report generated at ${outputPath}`);
  }
}

export default MyCustomReporter;
