package com.StreamPi.Util.Version;


import com.StreamPi.Util.Exception.MinorException;

public class Version {
    private int major, minor, revision;

    public Version()
    {
        major = 0;
        minor = 0;
        revision = 0;
    }

    public Version(int major, int minor, int revision)
    {
        this.major = major;
        this.minor = minor;
        this.revision = revision;
    }

    public Version(String version) throws MinorException
    {
        String[] v = version.trim().split("\\.");
        if(v.length == 3)
        {
            try
            {
                major = Integer.parseInt(v[0]);
                minor = Integer.parseInt(v[1]);
                revision = Integer.parseInt(v[2]);
            }
            catch (NumberFormatException e)
            {
                throw new MinorException("Invalid versioning!");
            }
        }
        else
        {
            throw new MinorException("Invalid versioning!");
        }
    }

    public int getMajor()
    {
        return major;
    }

    public int getMinor()
    {
        return minor;
    }

    public int getRevision()
    {
        return minor;
    }

    public String getText()
    {
        return this.major+"."+this.minor+"."+this.revision;
    }

    public void setMajor(int major)
    {
        this.major = major;
    }

    public void setMinor(int minor)
    {
        this.minor = minor;
    }

    public void setRevision(int revision)
    {
        this.revision = revision;
    }

    public boolean isBiggerThan(Version version)
    {
        if(major>version.major)
            return true;
        else
        {
            if(minor > version.minor)
                return true;
            else
            {
                return revision > version.revision;
            }
        }
    }

}
