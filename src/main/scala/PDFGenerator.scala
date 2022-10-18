import com.openhtmltopdf.pdfboxout.PdfRendererBuilder

import java.io.{File, FileOutputStream}

object PDFGenerator extends App {
  val fileOutputStream = new FileOutputStream("mrc.pdf")
  val builder = new PdfRendererBuilder()
  builder.useFastMode()
  builder.usePdfUaAccessbility(true)
  builder.usePdfAConformance(PdfRendererBuilder.PdfAConformance.PDFA_3_U)
  builder.useFont(new File("arial.ttf"), "Arial")
  builder.withFile(new File("mrc.html"))
  builder.toStream(fileOutputStream)
  builder.run()
  fileOutputStream.close()
}
