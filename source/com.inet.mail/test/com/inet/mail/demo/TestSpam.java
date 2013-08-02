/*****************************************************************
   Copyright 2006 by Hien Nguyen (hiennguyen@truthinet.com)

   Licensed under the iNet Solutions Corp.,;
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.truthinet.com/licenses

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*****************************************************************/
package com.inet.mail.demo;

import com.inet.mail.spam.SpamMain;
import com.inet.mail.spam.SpamScanResult;

/**
 * TestSpam.
 * 
 * @author <a href="mailto:hiennguyen@truthinet.com">Hien Nguyen</a>
 * @version 0.2i
 */
public class TestSpam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// we have to see this email is blocked by spam mail or not
		try {
			SpamScanResult spamResult = SpamMain.getInstance().scan("Test".getBytes(),null);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}