import java.io.IOException;
/*
******************************************************************
*                      SemEval 2015 task 13                      *
* Multilingual All-Words Sense Disambiguation and Entity Linking *
*                Andrea Moro and Roberto Navigli                 *
******************************************************************


This package contains the test data for the SemEval 2015 task 13
on Multilingual All-Words Sense Disambiguation and Entity Linking.
Other than this readme file, you will find (in the data directory)
three xml files and their dtd specification. The setting of the
task assume that the fragments of text to be linked are unknown.
For this reason, in the xml files you will find an ID for all the
tokenized words. Moreover, we use a simplified tagset for
part-of-speech; we restricted our attention only to the main,
coarse classes which are: nouns (N), verbs (V), adjectives (J)
and adverbs (R). All other words are marked with the X symbol.
Here it is an example of the input file:

<?xml version="1.0" encoding="UTF-8" ?>
<corpus lang="en">
<text id="d001">
...
<sentence id="d001.s010">
<wf id="d001.s010.t001" pos="X">The</wf>
<wf id="d001.s010.t002" lemma="european" pos="J">European</wf>
<wf id="d001.s010.t003" lemma="medicine" pos="N">Medicines</wf>
<wf id="d001.s010.t004" lemma="agency" pos="N">Agency</wf>
<wf id="d001.s010.t005" pos="X">(</wf>
<wf id="d001.s010.t006" lemma="ema" pos="N">EMA</wf>
<wf id="d001.s010.t007" pos="X">)</wf>
<wf id="d001.s010.t008" lemma="be" pos="V">is</wf>
<wf id="d001.s010.t009" pos="X">a</wf>
<wf id="d001.s010.t010" lemma="european" pos="J">European</wf>
<wf id="d001.s010.t011" lemma="union" pos="N">Union</wf>
<wf id="d001.s010.t012" lemma="agency" pos="N">agency</wf>
<wf id="d001.s010.t013" pos="X">for</wf>
<wf id="d001.s010.t014" pos="X">the</wf>
<wf id="d001.s010.t015" lemma="evaluation" pos="N">evaluation</wf>
<wf id="d001.s010.t016" pos="X">of</wf>
<wf id="d001.s010.t017" lemma="medicinal" pos="J">medicinal</wf>
<wf id="d001.s010.t018" lemma="product" pos="N">products</wf>
<wf id="d001.s010.t019" lemma="." pos="X">.</wf>
</sentence>
...
</text>
</corpus>

The goal of the participating teams is to create a key file
for each xml file containing the start and end IDs (which are
inclusive) together with an identifier for the disambiguated
meaning. As identifiers you can use BabelNet (babelnet.org)
id (bn:00000001n), WordNet keys (wn:deal%1:10:00::) and
Wikipedia page titles and redirections (wiki:goal).
Here it is an example of the key file:

d001.s010.t002	d001.s010.t004	wiki:european_medicines_agency
d001.s010.t003	d001.s010.t003	bn:00054128n
d001.s010.t008	d001.s010.t008	wn:be%2:42:03::

Both gold key files and participating systems key files can
be found in the keys directory. Moreover, in the scorer directory
you will find the official scorer of the task. The official
scorer for this task is written in Java and can be run in the
following way:

java Scorer gold_key system_key


To ask for clarifications contact the organizers:
Andrea Moro (moro@di.uniroma1.it)
Roberto Navigli (navigli@di.uniroma1.it)
*/
public class WSDTest {
	public static void main(String [] args) {
		try {
			Scorer.main(new String[] {"Semeval_Gold_Keys/semeval-2015-task-13-en-a-wn.key","System_Keys/oxfordDisambiguateScoreMoakeV2.key"});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
