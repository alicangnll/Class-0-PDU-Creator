# Class-0-PDU-Creator
PDU Creator for Class 0 SMS
<br><br>
<img src="android_modem.png" />
<br><br>
<b>Send Code to Android</b>
<br><br>
<pre>Example : 
ls -la /dev | grep -a smd 
cat /dev/smd11
echo -e "AT+CMGS=47\r" > /dev/smd11
cat /dev/smd11
07215063993856F8040b215063931049F000002290118050330c20CDB21C1D16875920711D244ECB41C76913442EBBCBEDF23C4D4ECB5D
</pre>
<br><br>
<table style="width: 99.82%; border-collapse: collapse;" border="1" width="99%" cellspacing="0" cellpadding="0">
<tbody>
<tr>
<td style="width: 48.2%; border-width: 1pt medium 1pt 1pt; border-style: solid none solid solid; border-color: #b3cc82 -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #9bbb59; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="color: #ffffff;"><strong><span style="font-size: small;"><span style="font-family: Arial;">Command</span></span></strong></span></div>
</td>
<td style="width: 51.8%; border-width: 1pt 1pt 1pt medium; border-style: solid solid solid none; border-color: #b3cc82 #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #9bbb59; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="color: #ffffff;"><strong><span style="font-size: small;"><span style="font-family: Arial;">Description</span></span></strong></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CSMS</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Select message service</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CPMS</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Preferred message storage</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGF</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Message format</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CSCA</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Service centre address</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CSMP</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Set text mode parameters</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CSDH</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Show text mode parameters</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CSCB</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Select cell broadcast message types</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CSAS</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Save settings</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CRES</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Restore settings</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CNMI</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">New message indications to TE</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGL</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">List messages</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGR</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Read message</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGS</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Send message</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMSS</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Send message from storage</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGW</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Write message to memory</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.2%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGD</span></span></div>
</td>
<td style="width: 51.8%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Delete message</span></span></div>
</td>
</tr>
</tbody>
</table>

<table style="width: 99.82%; border-collapse: collapse;" border="1" width="99%" cellspacing="0" cellpadding="0">
<tbody>
<tr>
<td style="width: 48.22%; border-width: 1pt medium 1pt 1pt; border-style: solid none solid solid; border-color: #b3cc82 -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #9bbb59; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="color: #ffffff;"><strong><span style="font-size: small;"><span style="font-family: Arial;">Command</span></span></strong></span></div>
</td>
<td style="width: 51.78%; border-width: 1pt 1pt 1pt medium; border-style: solid solid solid none; border-color: #b3cc82 #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #9bbb59; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="color: #ffffff;"><strong><span style="font-size: small;"><span style="font-family: Arial;">Description</span></span></strong></span></div>
</td>
</tr>
<tr>
<td style="width: 48.22%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGL</span></span></div>
</td>
<td style="width: 51.78%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">List Messages</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.22%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGR</span></span></div>
</td>
<td style="width: 51.78%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Read message</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.22%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGS</span></span></div>
</td>
<td style="width: 51.78%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; background: none repeat scroll 0% 0% #e6eed5; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Send message</span></span></div>
</td>
</tr>
<tr>
<td style="width: 48.22%; border-width: medium medium 1pt 1pt; border-style: none none solid solid; border-color: -moz-use-text-color -moz-use-text-color #b3cc82 #b3cc82; padding: 0cm 5.4pt;" valign="top" width="48%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">AT+CMGW</span></span></div>
</td>
<td style="width: 51.78%; border-width: medium 1pt 1pt medium; border-style: none solid solid none; border-color: -moz-use-text-color #b3cc82 #b3cc82 -moz-use-text-color; padding: 0cm 5.4pt;" valign="top" width="51%">
<div style="margin-bottom: 0.0001pt; text-align: justify; line-height: normal;"><span style="font-size: small;"><span style="font-family: Arial;">Write message to memory</span></span></div>
</td>
</tr>
</tbody>
</table>

Source : https://www.engineersgarage.com/at-commands-gsm-at-command-set/

