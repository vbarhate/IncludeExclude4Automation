
package com.cx.automation.test.maven;


/**
 * Created by galn on 19/09/2016.
 */

public class StamFile {
    String user;
    String password;

    public StamFile() {
    }

    public StamFile(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof StamFile)) return false;
        if (!super.equals(object)) return false;

        StamFile stamFile = (StamFile) object;

        if (getUser() != null ? !getUser().equals(stamFile.getUser()) : stamFile.getUser() != null) return false;
        if (getPassword() != null ? !getPassword().equals(stamFile.getPassword()) : stamFile.getPassword() != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }

    public static void doAbsolutePathTraversal_medium(HttpServletRequest request)
    {
        String fileName = request.getParameter("FileName");
        FileReader fr = new FileReader(fileName);
    }

    public static void doCodeInjection_high(String name, WebSession session)
    {
        String newClass = session.getParser().name;
        Class cls = Class.forName(newClass);
    }

}

