create table SUP_GlobalInformation (
	globalInformationId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	date_ DATE null,
	message VARCHAR(75) null,
	display INTEGER,
	status INTEGER
);