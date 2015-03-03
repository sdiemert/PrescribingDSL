<?xml version="1.0" encoding="UTF-8" standalone="no"?><gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd"><graph edgeids="false" edgemode="directed" id="prescription_Mon Mar 02 14:49:40 PST 2015" role="graph"><version name="$version"><string>curly</string></version><node id="prescription0"/><edge from="prescription0" to="prescription0"><attr name="label"><string>let:medication="aspirin"</string></attr></edge><edge from="prescription0" to="prescription0"><attr name="label"><string>let:action="TAKE"</string></attr></edge><edge from="prescription0" to="prescription0"><attr name="label"><string>type:Prescription</string></attr></edge><node id="prescriptionTiming0"/><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:duration=5</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:unit="DAY"</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:frequency=2</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>type:Timing</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:order=0</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:count=0</string></attr></edge><node id="0instant8"/><edge from="0instant8" to="0instant8"><attr name="label"><string>let:instant=8</string></attr></edge><edge from="0instant8" to="0instant8"><attr name="label"><string>let:n=0</string></attr></edge><edge from="0instant8" to="0instant8"><attr name="label"><string>type:Instant</string></attr></edge><edge from="prescriptionTiming0" to="0instant8"><attr name="label"><string>instant</string></attr></edge><node id="0instant15"/><edge from="0instant15" to="0instant15"><attr name="label"><string>let:instant=15</string></attr></edge><edge from="0instant15" to="0instant15"><attr name="label"><string>let:n=1</string></attr></edge><edge from="0instant15" to="0instant15"><attr name="label"><string>type:Instant</string></attr></edge><edge from="prescriptionTiming0" to="0instant15"><attr name="label"><string>instant</string></attr></edge><edge from="prescription0" to="prescriptionTiming0"><attr name="label"><string>timing</string></attr></edge><node id="prescriptionDose"/><edge from="prescriptionDose" to="prescriptionDose"><attr name="label"><string>type:FixedDosing</string></attr></edge><node id="dose0_0"/><edge from="dose0_0" to="dose0_0"><attr name="label"><string>type:Dose</string></attr></edge><edge from="dose0_0" to="dose0_0"><attr name="label"><string>let:amount=81</string></attr></edge><edge from="dose0_0" to="dose0_0"><attr name="label"><string>let:unit="MG"</string></attr></edge><edge from="dose0_0" to="dose0_0"><attr name="label"><string>let:n=0</string></attr></edge><edge from="prescriptionDose" to="dose0_0"><attr name="label"><string>dose</string></attr></edge><node id="dose0_1"/><edge from="dose0_1" to="dose0_1"><attr name="label"><string>type:Dose</string></attr></edge><edge from="dose0_1" to="dose0_1"><attr name="label"><string>let:amount=81</string></attr></edge><edge from="dose0_1" to="dose0_1"><attr name="label"><string>let:unit="MG"</string></attr></edge><edge from="dose0_1" to="dose0_1"><attr name="label"><string>let:n=1</string></attr></edge><edge from="prescriptionDose" to="dose0_1"><attr name="label"><string>dose</string></attr></edge><edge from="prescription0" to="prescriptionDose"><attr name="label"><string>dosing</string></attr></edge></graph></gxl>