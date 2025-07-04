package z_h_36_template_design_pattern.DataMiningApplication;

import z_h_36_template_design_pattern.DataMiningApplication.dataminer.DataMiner;
import z_h_36_template_design_pattern.DataMiningApplication.dataminer.DocDataMiner;
import z_h_36_template_design_pattern.DataMiningApplication.dataminer.PdfDataMiner;

public class DataMiningClient {
    public static void main(String[] args) {

        DataMiner docMiner = new DocDataMiner();
        DataMiner pdfMiner = new PdfDataMiner();

        System.out.println("=== DOC Mining ===");
        docMiner.mine("documents/report.doc");

        System.out.println("\n=== PDF Mining ===");
        pdfMiner.mine("documents/slides.pdf");


    }
}
