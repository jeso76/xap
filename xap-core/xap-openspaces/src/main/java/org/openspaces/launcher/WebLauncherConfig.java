/*
 * Copyright (c) 2008-2016, GigaSpaces Technologies, Inc. All Rights Reserved.
 *
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

package org.openspaces.launcher;

/**
 * @author Niv Ingberg
 * @since 10.0.0
 */
public class WebLauncherConfig {

    private int port;
    private String warFilePath;
    private String tempDirPath;
    /**
     * @since 10.1 GS-12102
     */
    private String hostAddress;

    /**
    * @since 12.1
    */
    private String sslKeyStorePath;

    /**
     * @since 12.1
     */
    private String sslKeyStorePassword;
    /**
     * @since 12.1
     */
    private String sslKeyManagerPassword;
    /**
     * @since 12.1
     */
    private String sslTrustStorePassword;
    /**
     * @since 12.1
     */
    private String sslTrustStorePath;

    private boolean sslEnabled=false;

    public WebLauncherConfig() {
        this.port = Integer.getInteger("org.openspaces.launcher.port", 8099);
        this.warFilePath = System.getProperty("org.openspaces.launcher.path", null);
        //this.warFilePath = System.getProperty("org.openspaces.launcher.path", "D:\\GigaSpaces\\gigaspaces-xap-premium-10.0.0-m2\\tools\\gs-webui");
        this.tempDirPath = System.getProperty("org.openspaces.launcher.work", "./work");
        this.hostAddress = System.getProperty("org.openspaces.launcher.bind-address", "0.0.0.0");
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getTempDirPath() {
        return tempDirPath;
    }

    public void setTempDirPath(String tempDirPath) {
        this.tempDirPath = tempDirPath;
    }

    public String getWarFilePath() {
        return warFilePath;
    }

    public void setWarFilePath(String warFilePath) {
        this.warFilePath = warFilePath;
    }

    /**
     * `   `* @since 10.1
     *
     * @author evgenyf
     */
    public String getHostAddress() {
        return hostAddress;
    }

    /**
     * @author evgenyf
     * @since 10.1
     */
    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    /**
     * @since 12.1
     */
     public String getSslKeyStorePath() {
        return sslKeyStorePath;
    }

    /**
     * @since 12.1
     */
    public void setSslKeyStorePath(String sslKeyStorePath) {
        this.sslKeyStorePath = sslKeyStorePath;
    }

    /**
     * @since 12.1
     */
    public String getSslKeyStorePassword() {
        return sslKeyStorePassword;
    }

    /**
     * @since 12.1
     */
    public void setSslKeyStorePassword(String sslKeyStorePassword) {
        this.sslKeyStorePassword = sslKeyStorePassword;
    }

    /**
     * @since 12.1
     */
    public String getSslKeyManagerPassword() {
        return sslKeyManagerPassword;
    }

    /**
     * @since 12.1
     */
    public void setSslKeyManagerPassword(String sslKeyManagerPassword) {
        this.sslKeyManagerPassword = sslKeyManagerPassword;
    }

    /**
     * @since 12.1
     */
    public String getSslTrustStorePassword() {
        return sslTrustStorePassword;
    }

    /**
     * @since 12.1
     */
    public void setSslTrustStorePassword(String sslTrustStorePassword) {
        this.sslTrustStorePassword = sslTrustStorePassword;
    }

    /**
     * @since 12.1
     */
    public String getSslTrustStorePath() {
        return sslTrustStorePath;
    }

    /**
     * @since 12.1
     */
    public void setSslTrustStorePath(String sslTrustStorePath) {
        this.sslTrustStorePath = sslTrustStorePath;
    }

    /**
     * @since 12.1
     */
    public boolean isSslEnabled() {
        return sslEnabled;
    }

    /**
     * @since 12.1
     */
    public void setSslEnabled(boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }
}