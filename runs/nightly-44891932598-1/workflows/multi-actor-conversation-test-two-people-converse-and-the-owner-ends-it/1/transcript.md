# Transcript: Two people exchange messages; an outsider is kept out; closing stops the thread

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiActorConversationTest#twoPeopleConverseAndTheOwnerEndsIt` |
| Features | FEAT-CONV-01, FEAT-CONV-02, FEAT-CONV-03, FEAT-AUTHZ-01, FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 33 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 346 | `qa-b2c7cddb-7fb8-458e-8129-f3f77596b91f` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-da564698-24ca-40a1-9687-cc9059959a23` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-e8261294-18a5-4f18-9145-d93c55ce3617` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-848c19ff-2f92-4d45-ba8d-169b6d4d24b4` |
| 5 | `POST /v1/conversations` | 201 | 34 | `qa-1309c2b8-f676-4407-8355-eac43040f60e` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-84f09591-c580-4be7-87ad-baffa6689a25` |
| 7 | `GET /v1/conversations` | 200 | 25 | `qa-1e76481a-3be8-4ca8-b99a-f58147bb0d68` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 25 | `qa-297ecdc4-3525-4c63-b686-2da543bda110` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-b8d1c272-f2d3-4bae-b361-f6194ef3d62a` |
| 10 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-fd18b0e1-ddf6-4598-9d43-d9509c96e923` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-ede3c18e-d7ba-49cd-9e4c-365954a552d1` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-a18709e4-4be8-4ea1-a38a-3ab9d404a85b` |
| 13 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-28ea19b6-ff5d-4100-8f09-a9ed2338fedc` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 4 | `qa-75428c05-770b-4b4e-821c-85e80f1d9d44` |
| 15 | `GET /v1/credits/balance` | 200 | 3 | `qa-fc95afe7-baf6-456a-aad9-4df49a04f557` |
| 16 | `GET /v1/credits/balance` | 200 | 4 | `qa-b503c7a8-f5d0-4ff3-ae3a-043d883045de` |
| 17 | `POST /v1/auth/token` | 200 | 10 | `qa-4100931e-adb2-4458-8091-bc29bbc4e2b7` |
| 18 | `GET /v1/conversations/{id}` | 403 | 14 | `qa-9837f434-87ba-4a4c-9583-43d8b98f1978` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 9 | `qa-1999a11e-0215-4b96-bd3f-8bb050fabaa4` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 6 | `qa-71b4e725-e9f1-4439-ac39-64891f6b24ef` |
| 21 | `GET /v1/conversations` | 200 | 5 | `qa-722ef0eb-3614-4a0d-8d79-3aac8955a99d` |
| 22 | `GET /v1/credits/balance` | 200 | 4 | `qa-5cd994f1-dcdd-4160-aa81-2c3f2926a174` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-57d0f0da-fac9-4460-b38c-e6c265b7770e` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-9dd9605c-3ef1-49ec-8cd8-a18e620da4e7` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-40fef497-73f2-4c9c-b01e-d09c7ec9748e` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 4 | `qa-d5a5afe1-e003-4100-a80a-ec23a4615510` |
| 27 | `GET /v1/credits/balance` | 200 | 4 | `qa-13806c43-afd6-4143-a606-b3ac3744ce35` |
| 28 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-f1568605-f62f-4322-aa95-c297bf16181f` |
| 29 | `POST /v1/auth/token` | 401 | 5 | `qa-e79448e0-fb72-47c6-be23-5f44494015c9` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-1e288cea-6a6f-4805-93a2-73dcf84121c7` |
| 31 | `POST /v1/auth/token` | 401 | 3 | `qa-5f3a1cfd-28a8-4ae4-bd22-33a9c6eb949e` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-602d553c-ffd2-445e-8edd-7b47622b618f` |
| 33 | `POST /v1/auth/token` | 401 | 3 | `qa-8d1302b8-fdae-4fad-a135-eef0ad396e15` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b2c7cddb-7fb8-458e-8129-f3f77596b91f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2c7cddb-7fb8-458e-8129-f3f77596b91f
Content-Type: application/json

--- request body ---
{"handle":"qa-9436267da1d8","displayName":"QA 9436267da1d8","password":"****","region":"eu"}

--- response: 201 in 346 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2c7cddb-7fb8-458e-8129-f3f77596b91f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-9436267da1d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6b91e95-e10e-4773-adfb-a8b1a401c6f8","handle":"qa-9436267da1d8","displayName":"QA 9436267da1d8","region":"eu","role":"user","createdAt":"2026-11-21T09:57:05.803308588Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-da564698-24ca-40a1-9687-cc9059959a23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da564698-24ca-40a1-9687-cc9059959a23
Content-Type: application/json

--- request body ---
{"handle":"qa-3dcf935fc2f7","displayName":"QA 3dcf935fc2f7","password":"****","region":"us"}

--- response: 201 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-da564698-24ca-40a1-9687-cc9059959a23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-3dcf935fc2f7
X-Served-Region: us
Content-Length: 181

{"id":"acc_ade2aaa5-dd01-439b-8858-73d6dddd238b","handle":"qa-3dcf935fc2f7","displayName":"QA 3dcf935fc2f7","region":"us","role":"user","createdAt":"2026-11-21T09:57:06.166546286Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e8261294-18a5-4f18-9145-d93c55ce3617

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8261294-18a5-4f18-9145-d93c55ce3617
Content-Type: application/json

--- request body ---
{"handle":"qa-3a46dd75e2c4","displayName":"QA 3a46dd75e2c4","password":"****","region":"in"}

--- response: 201 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8261294-18a5-4f18-9145-d93c55ce3617
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Location: /v1/accounts/qa-3a46dd75e2c4
X-Served-Region: in
Content-Length: 181

{"id":"acc_656ff766-e07d-486a-8401-cc6629831c0e","handle":"qa-3a46dd75e2c4","displayName":"QA 3a46dd75e2c4","region":"in","role":"user","createdAt":"2026-11-21T09:57:06.202566951Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-848c19ff-2f92-4d45-ba8d-169b6d4d24b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-848c19ff-2f92-4d45-ba8d-169b6d4d24b4
Content-Type: application/json

--- request body ---
{"handle":"qa-9436267da1d8","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-848c19ff-2f92-4d45-ba8d-169b6d4d24b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6b91e95-e10e-4773-adfb-a8b1a401c6f8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1309c2b8-f676-4407-8355-eac43040f60e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1309c2b8-f676-4407-8355-eac43040f60e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3dcf935fc2f7","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 34 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1309c2b8-f676-4407-8355-eac43040f60e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7
X-Data-Region: us
Content-Length: 238

{"id":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9436267da1d8","qa-3dcf935fc2f7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:06.324619101Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-84f09591-c580-4be7-87ad-baffa6689a25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84f09591-c580-4be7-87ad-baffa6689a25
Content-Type: application/json

--- request body ---
{"handle":"qa-3dcf935fc2f7","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-84f09591-c580-4be7-87ad-baffa6689a25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ade2aaa5-dd01-439b-8858-73d6dddd238b"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-1e76481a-3be8-4ca8-b99a-f58147bb0d68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e76481a-3be8-4ca8-b99a-f58147bb0d68
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e76481a-3be8-4ca8-b99a-f58147bb0d68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 260

{"items":[{"id":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9436267da1d8","qa-3dcf935fc2f7"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-21T09:57:06.324619101Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages
correlation: qa-297ecdc4-3525-4c63-b686-2da543bda110

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-297ecdc4-3525-4c63-b686-2da543bda110
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-297ecdc4-3525-4c63-b686-2da543bda110
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 234

{"items":[{"id":"msg_ff5a1c80-366a-414a-84f9-11e1770e9beb","conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","sender":"qa-9436267da1d8","body":"Hi Ben, got a minute?","createdAt":"2026-11-21T09:57:06.324626715Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/read
correlation: qa-b8d1c272-f2d3-4bae-b361-f6194ef3d62a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8d1c272-f2d3-4bae-b361-f6194ef3d62a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8d1c272-f2d3-4bae-b361-f6194ef3d62a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 77

{"conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7
correlation: qa-fd18b0e1-ddf6-4598-9d43-d9509c96e923

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd18b0e1-ddf6-4598-9d43-d9509c96e923
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd18b0e1-ddf6-4598-9d43-d9509c96e923
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9436267da1d8","qa-3dcf935fc2f7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:06.324619101Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages
correlation: qa-ede3c18e-d7ba-49cd-9e4c-365954a552d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ede3c18e-d7ba-49cd-9e4c-365954a552d1
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-ede3c18e-d7ba-49cd-9e4c-365954a552d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 206

{"id":"msg_44d4057c-f43a-4679-bf42-0a710ae07a6b","conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","sender":"qa-3dcf935fc2f7","body":"Sure, now works","createdAt":"2026-11-21T09:57:06.816128109Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages
correlation: qa-a18709e4-4be8-4ea1-a38a-3ab9d404a85b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a18709e4-4be8-4ea1-a38a-3ab9d404a85b
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a18709e4-4be8-4ea1-a38a-3ab9d404a85b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 202

{"id":"msg_11e217ab-281c-4f1c-ac12-54ce8596e90c","conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","sender":"qa-3dcf935fc2f7","body":"Calling you","createdAt":"2026-11-21T09:57:06.833420571Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7
correlation: qa-28ea19b6-ff5d-4100-8f09-a9ed2338fedc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28ea19b6-ff5d-4100-8f09-a9ed2338fedc
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-28ea19b6-ff5d-4100-8f09-a9ed2338fedc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
X-Data-Region: us
Content-Length: 238

{"id":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","subject":"Project kickoff","status":"open","region":"us","participants":["qa-9436267da1d8","qa-3dcf935fc2f7"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-21T09:57:06.324619101Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages
correlation: qa-75428c05-770b-4b4e-821c-85e80f1d9d44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75428c05-770b-4b4e-821c-85e80f1d9d44
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-75428c05-770b-4b4e-821c-85e80f1d9d44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 644

{"items":[{"id":"msg_ff5a1c80-366a-414a-84f9-11e1770e9beb","conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","sender":"qa-9436267da1d8","body":"Hi Ben, got a minute?","createdAt":"2026-11-21T09:57:06.324626715Z"},{"id":"msg_44d4057c-f43a-4679-bf42-0a710ae07a6b","conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","sender":"qa-3dcf935fc2f7","body":"Sure, now works","createdAt":"2026-11-21T09:57:06.816128109Z"},{"id":"msg_11e217ab-281c-4f1c-ac12-54ce8596e90c","conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","sender":"qa-3dcf935fc2f7","body":"Calling you","createdAt":"2026-11-21T09:57:06.833420571Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-fc95afe7-baf6-456a-aad9-4df49a04f557

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc95afe7-baf6-456a-aad9-4df49a04f557
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc95afe7-baf6-456a-aad9-4df49a04f557
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_e6b91e95-e10e-4773-adfb-a8b1a401c6f8"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-b503c7a8-f5d0-4ff3-ae3a-043d883045de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b503c7a8-f5d0-4ff3-ae3a-043d883045de
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b503c7a8-f5d0-4ff3-ae3a-043d883045de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_ade2aaa5-dd01-439b-8858-73d6dddd238b"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-4100931e-adb2-4458-8091-bc29bbc4e2b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4100931e-adb2-4458-8091-bc29bbc4e2b7
Content-Type: application/json

--- request body ---
{"handle":"qa-3a46dd75e2c4","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4100931e-adb2-4458-8091-bc29bbc4e2b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_656ff766-e07d-486a-8401-cc6629831c0e"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7
correlation: qa-9837f434-87ba-4a4c-9583-43d8b98f1978

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9837f434-87ba-4a4c-9583-43d8b98f1978
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9837f434-87ba-4a4c-9583-43d8b98f1978
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","correlationId":"qa-9837f434-87ba-4a4c-9583-43d8b98f1978"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages
correlation: qa-1999a11e-0215-4b96-bd3f-8bb050fabaa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1999a11e-0215-4b96-bd3f-8bb050fabaa4
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1999a11e-0215-4b96-bd3f-8bb050fabaa4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages","correlationId":"qa-1999a11e-0215-4b96-bd3f-8bb050fabaa4"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages
correlation: qa-71b4e725-e9f1-4439-ac39-64891f6b24ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71b4e725-e9f1-4439-ac39-64891f6b24ef
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71b4e725-e9f1-4439-ac39-64891f6b24ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages","correlationId":"qa-71b4e725-e9f1-4439-ac39-64891f6b24ef"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-722ef0eb-3614-4a0d-8d79-3aac8955a99d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-722ef0eb-3614-4a0d-8d79-3aac8955a99d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-722ef0eb-3614-4a0d-8d79-3aac8955a99d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 22

{"items":[],"total":0}
```

## 22. GET /v1/credits/balance

```text
#22 GET http://localhost:7070/v1/credits/balance
correlation: qa-5cd994f1-dcdd-4160-aa81-2c3f2926a174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cd994f1-dcdd-4160-aa81-2c3f2926a174
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cd994f1-dcdd-4160-aa81-2c3f2926a174
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_656ff766-e07d-486a-8401-cc6629831c0e"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/close
correlation: qa-57d0f0da-fac9-4460-b38c-e6c265b7770e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57d0f0da-fac9-4460-b38c-e6c265b7770e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-57d0f0da-fac9-4460-b38c-e6c265b7770e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-9436267da1d8","qa-3dcf935fc2f7"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-21T09:57:06.324619101Z","closedAt":"2026-11-21T09:57:07.232389123Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/close
correlation: qa-9dd9605c-3ef1-49ec-8cd8-a18e620da4e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dd9605c-3ef1-49ec-8cd8-a18e620da4e7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dd9605c-3ef1-49ec-8cd8-a18e620da4e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-9436267da1d8","qa-3dcf935fc2f7"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-21T09:57:06.324619101Z","closedAt":"2026-11-21T09:57:07.232389123Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages
correlation: qa-40fef497-73f2-4c9c-b01e-d09c7ec9748e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40fef497-73f2-4c9c-b01e-d09c7ec9748e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-40fef497-73f2-4c9c-b01e-d09c7ec9748e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_ff5a1c80-366a-414a-84f9-11e1770e9beb","conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","sender":"qa-9436267da1d8","body":"Hi Ben, got a minute?","createdAt":"2026-11-21T09:57:06.324626715Z"},{"id":"msg_44d4057c-f43a-4679-bf42-0a710ae07a6b","conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","sender":"qa-3dcf935fc2f7","body":"Sure, now works","createdAt":"2026-11-21T09:57:06.816128109Z"},{"id":"msg_11e217ab-281c-4f1c-ac12-54ce8596e90c","conversationId":"cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7","sender":"qa-3dcf935fc2f7","body":"Calling you","createdAt":"2026-11-21T09:57:06.833420571Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages
correlation: qa-d5a5afe1-e003-4100-a80a-ec23a4615510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5a5afe1-e003-4100-a80a-ec23a4615510
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5a5afe1-e003-4100-a80a-ec23a4615510
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_8697d4e5-54d8-4e10-b586-78fb77a814c7/messages","correlationId":"qa-d5a5afe1-e003-4100-a80a-ec23a4615510"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-13806c43-afd6-4143-a606-b3ac3744ce35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13806c43-afd6-4143-a606-b3ac3744ce35
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-13806c43-afd6-4143-a606-b3ac3744ce35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_ade2aaa5-dd01-439b-8858-73d6dddd238b"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1568605-f62f-4322-aa95-c297bf16181f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1568605-f62f-4322-aa95-c297bf16181f
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1568605-f62f-4322-aa95-c297bf16181f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: in
```

## 29. POST /v1/auth/token

```text
#29 POST http://localhost:7070/v1/auth/token
correlation: qa-e79448e0-fb72-47c6-be23-5f44494015c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e79448e0-fb72-47c6-be23-5f44494015c9
Content-Type: application/json

--- request body ---
{"handle":"qa-3a46dd75e2c4","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e79448e0-fb72-47c6-be23-5f44494015c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e79448e0-fb72-47c6-be23-5f44494015c9"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e288cea-6a6f-4805-93a2-73dcf84121c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e288cea-6a6f-4805-93a2-73dcf84121c7
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e288cea-6a6f-4805-93a2-73dcf84121c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-5f3a1cfd-28a8-4ae4-bd22-33a9c6eb949e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f3a1cfd-28a8-4ae4-bd22-33a9c6eb949e
Content-Type: application/json

--- request body ---
{"handle":"qa-3dcf935fc2f7","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f3a1cfd-28a8-4ae4-bd22-33a9c6eb949e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f3a1cfd-28a8-4ae4-bd22-33a9c6eb949e"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-602d553c-ffd2-445e-8edd-7b47622b618f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-602d553c-ffd2-445e-8edd-7b47622b618f
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-602d553c-ffd2-445e-8edd-7b47622b618f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 9
X-Served-Region: eu
```

## 33. POST /v1/auth/token

```text
#33 POST http://localhost:7070/v1/auth/token
correlation: qa-8d1302b8-fdae-4fad-a135-eef0ad396e15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d1302b8-fdae-4fad-a135-eef0ad396e15
Content-Type: application/json

--- request body ---
{"handle":"qa-9436267da1d8","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d1302b8-fdae-4fad-a135-eef0ad396e15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d1302b8-fdae-4fad-a135-eef0ad396e15"}
```
