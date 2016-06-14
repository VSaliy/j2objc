/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.j2objc.javac;

import org.eclipse.jdt.core.dom.IMemberValuePairBinding;

/**
 * Wrapper class around IMemberValuePairBinding.
 */
public class JdtMemberValuePairBinding extends JdtBinding implements IMemberValuePairBinding {
  private final JdtMethodBinding methodBinding;

  JdtMemberValuePairBinding(IMemberValuePairBinding binding) {
    super(binding);
    methodBinding = BindingConverter.wrapBinding(binding.getMethodBinding());
  }

  public JdtMethodBinding getMethodBinding() {
    return methodBinding;
  }

  public Object getValue() {
    return ((IMemberValuePairBinding) binding).getValue();
  }

  public boolean isDefault() {
    return ((IMemberValuePairBinding) binding).isDefault();
  }
}