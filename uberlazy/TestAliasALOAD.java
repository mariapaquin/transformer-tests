/*
 * Copyright (C) 2014, United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 *
 * Symbolic Pathfinder (jpf-symbc) is licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0. 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package uberlazy;

public class TestAliasALOAD {

	@Symbolic("true")
	Node m;

	public void run(Node n) {
		if (m != null) {
			if (n != null) {
				System.out.println("the object n is not null");
				if (n.elem > 10) {
					System.out.println("the value of the elem is greater than 10");
				} else {
					System.out.println("the value of elem is less than 10");
				}
			} else {
				System.out.println("n is null");
			}
		}
	}

	public static void main(String[] args) {
		TestAliasALOAD aload = new TestAliasALOAD();
		Node n = null;
		aload.run(n);
	}

}