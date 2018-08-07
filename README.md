# modifiedSemevalWSDScorer

Scores based on if the sense provided is contained in the correct senses. You don't need to provide every sense of the word.

### How to use

1. Upload Semeval formatted document to System_Keys directory.

2. In WSDTest change first parameter of Scorer to be the path to the golden key you want to score against, and the second parameter to be the path to the uploaded key.

3. Run WSDTest to get results.
