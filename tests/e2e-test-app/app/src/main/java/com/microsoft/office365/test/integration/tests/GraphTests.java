package com.microsoft.office365.test.integration.tests;


import com.microsoft.services.graph.*;
import com.microsoft.services.graph.fetchers.GraphServiceClient;
import com.microsoft.office365.test.integration.ApplicationContext;
import com.microsoft.office365.test.integration.framework.TestCase;
import com.microsoft.office365.test.integration.framework.TestGroup;
import com.microsoft.office365.test.integration.framework.TestResult;
import com.microsoft.office365.test.integration.framework.TestStatus;
import com.microsoft.services.graph.fetchers.ProfilePhotoFetcher;
import com.microsoft.services.orc.core.Constants;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GraphTests extends TestGroup {

    public GraphTests() {
        super("Graph tests");

        this.addTest(canGetApplications("Can get applications", true));
        this.addTest(canGetContacts("Can get contacts", true));
        this.addTest(canGetDeviceConfiguration("Can get deviceConfiguration", true));
        this.addTest(canGetDevices("Can get devices", true));
        this.addTest(canGetGroups("Can get groups", true));
        this.addTest(canGetDirectoryRoles("Can get directoryRoles", true));
        this.addTest(canGetDirectoryRoleTemplates("Can get directoryRoleTemplates", true));
        this.addTest(canGetServicePrincipals("Can get servicePrincipals", true));
        this.addTest(canGetTenantDetails("Can get tenantDetails", true));
        this.addTest(canGetUsers("Can get users", true));
        this.addTest(canGetSubscribedSkus("Can get SubscribedSkus", true));

        //Get User's information
        this.addTest(canGetUserAppRoleAssignments("Can get user's appRoleAssignments", true));
        this.addTest(canGetUserOauth2PermissionGrants("Can get user's oauth2PermissionGrants", true));
        this.addTest(canGetUserOwnedDevices("Can get user's ownedDevices", true));
        this.addTest(canGetUserRegisteredDevices("Can get user's registeredDevices", true));
        this.addTest(canGetUserDirectReports("Can get user's directReports", true));
        this.addTest(canGetUserMemberOf("Can get user's memberOf", true));
        this.addTest(canGetUserMemberOfById("Can get user's memberOf by id", true));
        this.addTest(canGetUserCreatedObjects("Can get user's createdObjects", true));
        this.addTest(canGetUserOwnedObjects("Can get user's ownedObjects", true));
        this.addTest(canGetUserOwnedObjectsById("Can get user's ownedObject by id", true));
        this.addTest(canGetUserMessages("Can get user's Messages", true));
        this.addTest(canGetUserMessagesById("Can get user's Message by id", true));
        this.addTest(canSendMessage("Can send message", true));
        this.addTest(canGetUserCalendars("Can get user's Calendars", true));
        this.addTest(canGetUserCalendarsById("Can get user's Calendar by id", true));
        this.addTest(canGetUserCalendar("Can get user's default Calendar", true));
        this.addTest(canGetUserCalendarGroups("Can get user's CalendarGroups", true));
        this.addTest(canGetUserCalendarGroupsById("Can get user's CalendarGroup by id", true));
        this.addTest(canGetUserEvents("Can get user's Events", true));
        this.addTest(canGetUserEventsById("Can get user's Event by id", true));
        this.addTest(canCreateUserEvent("Can create user's Event", true));
        this.addTest(canUpdateUserEvent("Can update user's Event", true));
        this.addTest(canDeleteUserEvent("Can delete user's Event", true));
        this.addTest(canGetUserCalendarView("Can get user's CalendarView", true));
        this.addTest(canGetUserUserPhoto("Can get user's UserPhoto", true));
        this.addTest(canGetUserDrive("Can get user's drive", true));
        this.addTest(canGetUserFiles("Can get user's files", true));
        this.addTest(canGetUserFilesById("Can get user's file by id", true));
        //this.addTest(canCreateUserFiles("Can create user's files", true));
        //this.addTest(canUpdateUserFiles("Can update user's files", true));
        this.addTest(canDeleteUserFiles("Can delete user's files", true));
        this.addTest(canRetrieveConversation("Can retrieve conversation from group", true));

        this.addTest(canRetrievePrivilegedRoleSettings("Can retrieve privileged role settings", true));
    }

    private TestCase canGetApplications(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<Application> applications = client.getApplications().read().get();

                    //Assert
                    if (applications != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetContacts(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<OrgContact> contacts = client.getContacts().read().get();

                    //Assert
                    if (contacts != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetDeviceConfiguration(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<DeviceConfiguration> deviceConfiguration = client.getDeviceConfiguration().read().get();

                    //Assert
                    if (deviceConfiguration != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetDevices(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<Device> devices = client.getDevices().read().get();

                    //Assert
                    if (devices != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetGroups(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<Group> groups = client.getGroups().read().get();

                    //Assert
                    if (groups != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetDirectoryRoles(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<DirectoryRole> directoryRoles = client.getDirectoryRoles().read().get();

                    //Assert
                    if (directoryRoles != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetDirectoryRoleTemplates(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<DirectoryRoleTemplate> directoryRoleTemplates = client.getDirectoryRoleTemplates().read().get();

                    //Assert
                    if (directoryRoleTemplates != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetServicePrincipals(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<ServicePrincipal> servicePrincipals = client.getServicePrincipals().read().get();

                    //Assert
                    if (servicePrincipals != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetTenantDetails(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<TenantDetail> tenantDetails = client.getTenantDetails().read().get();

                    //Assert
                    if (tenantDetails != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUsers(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<User> users = client.getUsers().read().get();

                    //Assert
                    if (users != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetSubscribedSkus(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<SubscribedSku> SubscribedSkus = client.getSubscribedSkus().read().get();

                    //Assert
                    if (SubscribedSkus != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }


    //***********************

    private TestCase canGetUserAppRoleAssignments(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<AppRoleAssignment> appRoleAssignments = client.getUsers().getById(ApplicationContext.getTestMail()).getAppRoleAssignments().read().get();

                    //Assert
                    if (appRoleAssignments != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserOauth2PermissionGrants(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<OAuth2PermissionGrant> oauth2PermissionGrants = client.getUsers().getById(ApplicationContext.getTestMail()).getOauth2PermissionGrants().read().get();

                    //Assert
                    if (oauth2PermissionGrants != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserOwnedDevices(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<DirectoryObject> ownedDevices = client.getUsers().getById(ApplicationContext.getTestMail()).getOwnedDevices().read().get();

                    //Assert
                    if (ownedDevices != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserRegisteredDevices(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<DirectoryObject> registeredDevices = client.getUsers().getById(ApplicationContext.getTestMail()).getRegisteredDevices().read().get();

                    //Assert
                    if (registeredDevices != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserDirectReports(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<DirectoryObject> directReports = client.getUsers().getById(ApplicationContext.getTestMail()).getDirectReports().read().get();

                    //Assert
                    if (directReports != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserDirectReportsById(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Prepare
                    List<DirectoryObject> directReports = client.getUsers().getById(ApplicationContext.getTestMail()).getDirectReports().top(1).read().get();
                    String directReportId;
                    if (directReports != null && directReports.size() > 0) {
                        directReportId = directReports.get(0).getObjectId().toString();
                        //Act
                        DirectoryObject directReport = client.getUsers().getById(ApplicationContext.getTestMail())
                                .getDirectReport(directReportId).read().get();
                        //Assert
                        if (directReport != null)
                            result.setStatus(TestStatus.Passed);
                    } else {
                        result.setException(new Exception("No available DirectReports"));
                    }
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserMemberOf(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<DirectoryObject> memberOf = client.getUsers().getById(ApplicationContext.getTestMail()).getMemberOf().read().get();

                    //Assert
                    if (memberOf != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserMemberOfById(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

//Prepare
                    List<DirectoryObject> memberOf = client.getUsers().getById(ApplicationContext.getTestMail()).getMemberOf().top(1).read().get();
                    String memberOfId;
                    if (memberOf != null && memberOf.size() > 0) {
                        memberOfId = memberOf.get(0).getObjectId().toString();
                        //Act
                        DirectoryObject memberOfItem = client.getUsers().getById(ApplicationContext.getTestMail())
                                .getMemberOf(memberOfId).read().get();
                        //Assert
                        if (memberOfItem != null)
                            result.setStatus(TestStatus.Passed);
                    } else {
                        result.setException(new Exception("No available MemberOf"));
                    }
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserCreatedObjects(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<DirectoryObject> createdObjects = client.getUsers().getById(ApplicationContext.getTestMail()).getCreatedObjects().read().get();

                    //Assert
                    if (createdObjects != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserOwnedObjects(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<DirectoryObject> ownedObjects = client.getUsers().getById(ApplicationContext.getTestMail()).getOwnedObjects().read().get();

                    //Assert
                    if (ownedObjects != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserOwnedObjectsById(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

//Prepare
                    List<DirectoryObject> ownedObjects = client.getUsers().getById(ApplicationContext.getTestMail()).getOwnedObjects().top(1).read().get();
                    String ownedObjectId;
                    if (ownedObjects != null && ownedObjects.size() > 0) {
                        ownedObjectId = ownedObjects.get(0).getObjectId().toString();
                        //Act
                        DirectoryObject ownedObject = client.getUsers().getById(ApplicationContext.getTestMail())
                                .getOwnedObject(ownedObjectId).read().get();
                        //Assert
                        if (ownedObject != null)
                            result.setStatus(TestStatus.Passed);
                    } else {
                        result.setException(new Exception("No available OwnedObjects"));
                    }
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserMessages(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<Message> Messages = client.getUsers().getById(ApplicationContext.getTestMail()).getMessages().read().get();

                    //Assert
                    if (Messages != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserMessagesById(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Prepare
                    List<Message> Messages = client.getUsers().getById(ApplicationContext.getTestMail()).getMessages().top(1).read().get();
                    String messageId;
                    if (Messages != null && Messages.size() > 0) {
                        messageId = Messages.get(0).getId();
                        //Act
                        Message message = client.getUsers().getById(ApplicationContext.getTestMail())
                                .getMessage(messageId).read().get();
                        //Assert
                        if (message != null)
                            result.setStatus(TestStatus.Passed);
                    } else {
                        result.setException(new Exception("No available Messages"));
                    }
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canSendMessage(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Passed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();
                    Message message = getSampleMessage("Mail sent using graph", ApplicationContext.getTestMail(), "");
                    //Act
                    client.getUsers().getById(ApplicationContext.getTestMail()).getOperations().sendMail(message, true).get();

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserCalendars(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<Calendar> Calendars = client.getUsers().getById(ApplicationContext.getTestMail()).getCalendars().read().get();

                    //Assert
                    if (Calendars != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserCalendarsById(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Prepare
                    List<Calendar> Calendars = client.getUsers().getById(ApplicationContext.getTestMail()).getCalendars().top(1).read().get();
                    String calendarId;
                    if (Calendars != null && Calendars.size() > 0) {
                        calendarId = Calendars.get(0).getId().toString();
                        //Act
                        Calendar calendar = client.getUsers().getById(ApplicationContext.getTestMail())
                                .getCalendar(calendarId).read().get();
                        //Assert
                        if (calendar != null)
                            result.setStatus(TestStatus.Passed);
                    } else {
                        result.setException(new Exception("No available Calendars"));
                    }
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserCalendar(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    Calendar calendar = client.getUsers().getById(ApplicationContext.getTestMail()).getCalendar().read().get();

                    //Assert
                    if (calendar != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserCalendarGroups(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<CalendarGroup> CalendarGroups = client.getUsers().getById(ApplicationContext.getTestMail()).getCalendarGroups().read().get();

                    //Assert
                    if (CalendarGroups != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserCalendarGroupsById(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

//Prepare
                    List<CalendarGroup> CalendarGroups = client.getUsers().getById(ApplicationContext.getTestMail()).getCalendarGroups().top(1).read().get();
                    String calendarGroupId;
                    if (CalendarGroups != null && CalendarGroups.size() > 0) {
                        calendarGroupId = CalendarGroups.get(0).getId().toString();
                        //Act
                        CalendarGroup calendarGroup = client.getUsers().getById(ApplicationContext.getTestMail())
                                .getCalendarGroup(calendarGroupId).read().get();
                        //Assert
                        if (calendarGroup != null)
                            result.setStatus(TestStatus.Passed);
                    } else {
                        result.setException(new Exception("No available CalendarGroups"));
                    }
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserEvents(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<Event> Events = client.getUsers().getById(ApplicationContext.getTestMail()).getEvents().read().get();

                    //Assert
                    if (Events != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserEventsById(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Prepare
                    List<Event> Events = client.getUsers().getById(ApplicationContext.getTestMail()).getEvents().top(1).read().get();
                    String eventId;
                    if (Events != null && Events.size() > 0) {
                        eventId = Events.get(0).getId().toString();
                        //Act
                        Event event = client.getUsers().getById(ApplicationContext.getTestMail())
                                .getEvent(eventId).read().get();
                        //Assert
                        if (event != null)
                            result.setStatus(TestStatus.Passed);
                    } else {
                        result.setException(new Exception("No available Events"));
                    }
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canCreateUserEvent(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Passed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    // Prepare
                    Event event = getSampleEvent();

                    // Act
                    Event addedEvent = client.getUsers().getById(ApplicationContext.getTestMail()).getEvents().add(event).get();

                    //Assert
                    if (!addedEvent.getSubject().equals(event.getSubject()))
                        result.setStatus(TestStatus.Failed);

                    //Cleanup
                    client.getUsers().getById(ApplicationContext.getTestMail())
                            .getEvents()
                            .getById(addedEvent.getId())
                            .delete().get();
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canUpdateUserEvent(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Passed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    // Prepare
                    Event event = getSampleEvent();
                    Event addedEvent = client.getUsers().getById(ApplicationContext.getTestMail()).getEvents().add(event).get();

                    // Act
                    event.setSubject("Updated Subject");
                    event.setImportance(Importance.Low);

                    Event updatedEvent = client.getUsers()
                            .getById(ApplicationContext.getTestMail())
                            .getEvents()
                            .getById(addedEvent.getId())
                            .update(event).get();

                    //Assert
                    if (updatedEvent.getImportance() != Importance.Low || !updatedEvent.getSubject().equals("Updated Subject"))
                        result.setStatus(TestStatus.Failed);

                    //Cleanup
                    client.getUsers()
                            .getById(ApplicationContext.getTestMail())
                            .getEvents()
                            .getById(addedEvent.getId())
                            .delete().get();

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canDeleteUserEvent(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    // Prepare
                    Event event = getSampleEvent();
                    Event addedEvent = client.getUsers()
                            .getById(ApplicationContext.getTestMail())
                            .getEvents().add(event).get();

                    // Act
                    client.getUsers()
                            .getById(ApplicationContext.getTestMail())
                            .getEvents()
                            .getById(addedEvent.getId())
                            .delete().get();

                    //Assert
                    try {
                        client.getUsers()
                                .getById(ApplicationContext.getTestMail())
                                .getEvents()
                                .getById(addedEvent.getId()).read().get();
                    } catch (Exception e) {
                        //It's supposed to fail
                        result.setStatus(TestStatus.Passed);
                    }

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserCalendarView(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();


                    //format date properly
                    java.util.Calendar dateStart = java.util.Calendar.getInstance();
                    dateStart.add(java.util.Calendar.HOUR, -2);

                    java.util.Calendar dateEnd = java.util.Calendar.getInstance();
                    dateStart.add(java.util.Calendar.HOUR, 2);

                    //Act
                    List<Event> calendarView = client.getUsers().getById(ApplicationContext.getTestMail()).getCalendarView()
                            .addParameter("startdatetime", dateStart)
                            .addParameter("enddatetime", dateEnd)
                            .read().get();

                    //Assert
                    if (calendarView != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserUserPhoto(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    ProfilePhoto userPhoto = client.getUsers().getById(ApplicationContext.getTestMail()).getPhoto().read().get();

                    //Assert
                    if (userPhoto != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserDrive(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    Drive drive = client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().read().get();

                    //Assert
                    if (drive != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserFiles(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Act
                    List<Item> files = client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getRoot().getChildren().read().get();

                    //Assert
                    if (files != null)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetUserFilesById(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Prepare
                    List<Item> files = client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getRoot().getChildren().top(1).read().get();
                    String fileId;
                    if (files != null && files.size() > 0) {
                        fileId = files.get(0).getId().toString();
                        //Act
                        Item file = client.getUsers().getById(ApplicationContext.getTestMail())
                                .getDrive().getItem(fileId).read().get();
                        //Assert
                        if (file != null)
                            result.setStatus(TestStatus.Passed);
                    } else {
                        result.setException(new Exception("No available Files"));
                    }
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }
    /*
    private TestCase canCreateUserFiles(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Passed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Prepare
                    Item newFile = new Item();

                    File file = new File();
                    newFile.setFile(file);
                    newFile.setName(UUID.randomUUID().toString() + ".txt");

                    Item addedFile = client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().add(newFile).get();
                    client.getUsers().getById(ApplicationContext.getTestMail())
                            .getDrive().getItems().getById(addedFile.getId())
                            .getContent().uploadContent("My Content".getBytes()).get();

                    byte[] content = client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().getById(addedFile.getId()).getOperations().content().get();

                    //Assert
                    if (addedFile == null)
                        result.setStatus(TestStatus.Failed);

                    if (content.length == 0)
                        result.setStatus(TestStatus.Failed);

                    //Cleanup
                    client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().getById(addedFile.getId()).addHeader(Constants.IF_MATCH_HEADER, "*").delete().get();


                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canUpdateUserFiles(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Prepare
                    Item newFile = new Item();
                    File file = new File();
                    newFile.setFile(file);
                    newFile.setName(UUID.randomUUID().toString() + ".txt");

                    Item addedFile = client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().add(newFile).get();
                    //Prepare
                    client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().getById(addedFile.getId()).getOperations().uploadContent("My Content".getBytes()).get();

                    //Act
                    client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().getById(addedFile.getId()).getOperations().uploadContent("My other Content".getBytes()).get();

                    //Assert
                    byte[] content = client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().getById(addedFile.getId()).getOperations().content().get();

                    String strContent = new String(content);

                    if (addedFile != null && strContent.equals("{\"contentStream\":\"TXkgb3RoZXIgQ29udGVudA==\\n\"}"))
                        result.setStatus(TestStatus.Passed);

                    //Cleanup
                    client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().getById(addedFile.getId()).addHeader(Constants.IF_MATCH_HEADER, "*").delete().get();


                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }
    */
    private TestCase canDeleteUserFiles(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Passed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    //Prepare
                    Item newFile = new Item();
                    File file = new File();
                    newFile.setFile(file);
                    newFile.setName(UUID.randomUUID().toString() + ".txt");

                    Item addedFile = client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().add(newFile).get();

                    //Act
                    client.getUsers().getById(ApplicationContext.getTestMail()).getDrive().getItems().getById(addedFile.getId()).addHeader(Constants.IF_MATCH_HEADER, "*").delete().get();


                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canRetrieveConversation(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Passed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    List<Group> groups = client.getUsers().getById(ApplicationContext.getTestMail()).getJoinedGroups().read().get();

                    if (groups.isEmpty()) {

                    }
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;

    }

    private TestCase canRetrievePrivilegedRoleSettings(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    GraphServiceClient client = ApplicationContext.getGraphServiceClient();

                    List<PrivilegedRole> privilegedRoles = client.getPrivilegedRoles().top(1).read().get();
                    if(privilegedRoles != null){
                        PrivilegedRoleSettings settings = client.getPrivilegedRoles().getById(privilegedRoles.get(0).getId()).getSetting().read().get();
                        if(settings != null){
                            result.setStatus(TestStatus.Passed);
                        }
                    }

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };
        test.setName(name);
        test.setEnabled(enabled);
        return test;

    }

    private Message getSampleMessage(String subject, String to, String cc) {
        Message m = new Message();
        // To Recipient
        final Recipient toRecipient = new Recipient();
        EmailAddress toEmailAddress = new EmailAddress();
        toEmailAddress.setAddress(to);
        toRecipient.setEmailAddress(toEmailAddress);
        ArrayList<Recipient> toRecipients = new ArrayList<Recipient>();
        toRecipients.add(toRecipient);
        m.setToRecipients(toRecipients);

        // CC recipient
        if (!cc.isEmpty()) {
            final Recipient ccRecipient = new Recipient();
            EmailAddress ccEmailAddress = new EmailAddress();
            ccEmailAddress.setAddress(cc);
            ccRecipient.setEmailAddress(ccEmailAddress);
            ArrayList<Recipient> ccRecipients = new ArrayList<Recipient>();
            ccRecipients.add(ccRecipient);
            m.setCcRecipients(ccRecipients);
        }
        //Body and subject
        m.setSubject(subject);
        ItemBody body = new ItemBody();
        body.setContent("This is the email's body");
        m.setBody(body);

        return m;
    }

    private Event getSampleEvent() {
        Event event = new Event();
        event.setSubject("Today's appointment");
        event.setStart(java.util.Calendar.getInstance());
        event.setImportance(Importance.High);

        //Event body
        ItemBody itemBody = new ItemBody();
        itemBody.setContent("This is the appointment info");
        itemBody.setContentType(BodyType.Text);

        event.setBody(itemBody);

        //Attendees
        Attendee attendee1 = new Attendee();
        EmailAddress email = new EmailAddress();
        email.setAddress(ApplicationContext.getTestMail());
        attendee1.setEmailAddress(email);
        List<Attendee> listAttendees = new ArrayList<Attendee>();
        listAttendees.add(attendee1);
        event.setAttendees(listAttendees);

        return event;
    }
}
