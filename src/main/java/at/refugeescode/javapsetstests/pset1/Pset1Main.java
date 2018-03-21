package at.refugeescode.javapsetstests.pset1;

import oop.opencoding.pset1.controller.MovieDatabaseSummarizer;
import oop.opencoding.pset1.model.Summary;
import oop.opencoding.pset1.view.SummaryDisplayer;

public class Pset1Main {

    public static void main(String[] args) {
        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
        SummaryDisplayer displayer = new SummaryDisplayer();

        // this part is going to do the logic
        // the result will be stored in the summary
        Summary summary = summarizer.summarize();

        // this part will only display the stuff
        displayer.display(summary);
    }
}
