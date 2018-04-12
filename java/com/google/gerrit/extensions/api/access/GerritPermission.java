// Copyright (C) 2018 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.extensions.api.access;

import java.util.Locale;

/** Gerrit permission for hosts, projects, refs, changes, labels and plugins. */
public interface GerritPermission {
  /**
   * @return the permission name used in {@code project.config} permissions if this permission is
   *     exposed. Or else, return a lower camel case string of the permission enum.
   */
  String permissionName();

  /** @return readable identifier of this permission for exception message. */
  default String describeForException() {
    return toString().toLowerCase(Locale.US).replace('_', ' ');
  }
}