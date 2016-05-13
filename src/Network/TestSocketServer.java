/* Copyright [2016] [Will Shen]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author muyousome
 * @since 2016-5-13 08:09:17
 *  模拟Socket服务端
 */
import java.net.*;
import java.io.*;

class TestSocketServer{
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		while(true){
			Socket sc = ss.accept();
		 	System.out.printf("A client connected ! ");
		 	DataInputStream dis = new DataInputStream(sc.getInputStream());
		 	System.out.printf(dis.readUTF());
		 	dis.close();
		 	sc.close();
		}
	}
}