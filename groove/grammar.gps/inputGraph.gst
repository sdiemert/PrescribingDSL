<?xml version="1.0" encoding="UTF-8" standalone="no"?><gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd"><graph edgeids="false" edgemode="directed" id="prescription_Tue Mar 24 15:35:36 PDT 2015" role="graph"><version name="$version"><string>curly</string></version><node id="prescription0"/><edge from="prescription0" to="prescription0"><attr name="label"><string>let:medication="aspirin"</string></attr></edge><edge from="prescription0" to="prescription0"><attr name="label"><string>let:action="TAKE"</string></attr></edge><edge from="prescription0" to="prescription0"><attr name="label"><string>let:repeats=0</string></attr></edge><edge from="prescription0" to="prescription0"><attr name="label"><string>type:Prescription</string></attr></edge><node id="prescriptionTiming0"/><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:duration=10</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:unit="DAY"</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:frequency=1</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>type:Timing</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:order=0</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:count=0</string></attr></edge><edge from="prescriptionTiming0" to="prescriptionTiming0"><attr name="label"><string>let:offset=0</string></attr></edge><node id="0instant8"/><edge from="0instant8" to="0instant8"><attr name="label"><string>let:instant=8</string></attr></edge><edge from="0instant8" to="0instant8"><attr name="label"><string>let:n=0</string></attr></edge><edge from="0instant8" to="0instant8"><attr name="label"><string>type:Instant</string></attr></edge><edge from="prescriptionTiming0" to="0instant8"><attr name="label"><string>instant</string></attr></edge><edge from="prescription0" to="prescriptionTiming0"><attr name="label"><string>timing</string></attr></edge><node id="dose0_0"/><edge from="dose0_0" to="dose0_0"><attr name="label"><string>type:Dosing</string></attr></edge><edge from="dose0_0" to="dose0_0"><attr name="label"><string>let:amount=81</string></attr></edge><edge from="dose0_0" to="dose0_0"><attr name="label"><string>let:unit="MG"</string></attr></edge><edge from="dose0_0" to="dose0_0"><attr name="label"><string>let:n=0</string></attr></edge><edge from="prescription0" to="dose0_0"><attr name="label"><string>dosing</string></attr></edge></graph></gxl>