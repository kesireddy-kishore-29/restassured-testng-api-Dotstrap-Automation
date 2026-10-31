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
| 1 | `POST /v1/accounts` | 201 | 480 | `qa-ef1eb2d2-c672-4790-a75c-1ffd883ffc5d` |
| 2 | `POST /v1/accounts` | 201 | 94 | `qa-5704d5d1-14f3-4cd8-b666-f3506b68fba7` |
| 3 | `POST /v1/accounts` | 201 | 52 | `qa-293b0022-f9e1-44d2-9dda-d19ef6bcaf05` |
| 4 | `POST /v1/auth/token` | 200 | 54 | `qa-ef8deb33-b6d2-4ab0-8938-f3a368387cb1` |
| 5 | `POST /v1/conversations` | 201 | 17 | `qa-437bc646-413b-413f-9b6a-b2d8b2b123c7` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-b9cdd6b3-0188-4236-8b46-0473519c4cbe` |
| 7 | `GET /v1/conversations` | 200 | 21 | `qa-71b79dba-7bea-4161-a65e-78c8956f03b0` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 23 | `qa-211f6e79-b0eb-4934-8752-681a5d0d10ee` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 16 | `qa-2e213090-8ad3-43b8-8cb4-3612b4eb274b` |
| 10 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-427e2af4-1779-4213-97e1-6411071d1144` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-3793c3e9-aba2-4f72-996d-bd2b595d2993` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-4ab62ece-0a2a-4f1c-852e-8dc419391349` |
| 13 | `GET /v1/conversations/{id}` | 200 | 24 | `qa-7c9ca683-87da-4e4d-a3a1-f78963e19253` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 20 | `qa-c9c6556e-4c53-451a-9979-5a153f460210` |
| 15 | `GET /v1/credits/balance` | 200 | 21 | `qa-e1a7dcb9-474c-4775-bf91-bae61f0ba3c1` |
| 16 | `GET /v1/credits/balance` | 200 | 12 | `qa-c64c2314-fae4-4e14-9067-0c23012b2330` |
| 17 | `POST /v1/auth/token` | 200 | 28 | `qa-273d1975-d502-4eae-b74c-ff88a9b09d94` |
| 18 | `GET /v1/conversations/{id}` | 403 | 11 | `qa-c711cf1c-2c36-45b5-a2ec-c3698a55801b` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-d5967370-1b66-49a6-b353-34a67315a3db` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 10 | `qa-af05e3ee-4b38-48ac-9d18-1977c90f838c` |
| 21 | `GET /v1/conversations` | 200 | 8 | `qa-635c212d-2598-4089-8467-1000048c36c3` |
| 22 | `GET /v1/credits/balance` | 200 | 7 | `qa-6dd08fd9-91da-4539-846d-4ece25f45a5b` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-bf99190c-afad-41a4-a5d5-ceefa6458f51` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-9d47c455-b733-453a-9823-913c29c65947` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-4fc49bc9-2a6b-4a06-88cc-15489597380c` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 6 | `qa-3d73c9e1-cd4c-49ba-a121-7fe1388de96a` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-6c2ea3be-57ed-4bae-8e47-fa23b13ff994` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d1122597-1f10-430f-b814-37f0a36184a8` |
| 29 | `POST /v1/auth/token` | 401 | 10 | `qa-d738ffbb-8478-4276-b73e-f41f930fdb03` |
| 30 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d57ef7e8-ce3e-4ec8-8213-6dbe91664119` |
| 31 | `POST /v1/auth/token` | 401 | 6 | `qa-f69585da-7833-489b-bfed-9441d77dda5a` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-a36c7752-d7e1-48b0-9e0d-906834d56db8` |
| 33 | `POST /v1/auth/token` | 401 | 6 | `qa-1876cbf3-706a-4983-ac5a-c115099ce4b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ef1eb2d2-c672-4790-a75c-1ffd883ffc5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef1eb2d2-c672-4790-a75c-1ffd883ffc5d
Content-Type: application/json

--- request body ---
{"handle":"qa-af0710dc4e08","displayName":"QA af0710dc4e08","password":"****","region":"eu"}

--- response: 201 in 480 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef1eb2d2-c672-4790-a75c-1ffd883ffc5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-af0710dc4e08
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6f253e6-e833-4194-aa04-d1f79a804337","handle":"qa-af0710dc4e08","displayName":"QA af0710dc4e08","region":"eu","role":"user","createdAt":"2026-10-27T08:00:33.303908976Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5704d5d1-14f3-4cd8-b666-f3506b68fba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5704d5d1-14f3-4cd8-b666-f3506b68fba7
Content-Type: application/json

--- request body ---
{"handle":"qa-7088ee3206c9","displayName":"QA 7088ee3206c9","password":"****","region":"us"}

--- response: 201 in 94 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5704d5d1-14f3-4cd8-b666-f3506b68fba7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-7088ee3206c9
X-Served-Region: us
Content-Length: 181

{"id":"acc_5e842e8b-123a-4dcc-9b58-3a1f5021cfdd","handle":"qa-7088ee3206c9","displayName":"QA 7088ee3206c9","region":"us","role":"user","createdAt":"2026-10-27T08:00:33.812367726Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-293b0022-f9e1-44d2-9dda-d19ef6bcaf05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-293b0022-f9e1-44d2-9dda-d19ef6bcaf05
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e04c6cffad","displayName":"QA c0e04c6cffad","password":"****","region":"in"}

--- response: 201 in 52 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-293b0022-f9e1-44d2-9dda-d19ef6bcaf05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-c0e04c6cffad
X-Served-Region: in
Content-Length: 181

{"id":"acc_2c95306f-af72-4411-93ba-1a683a004823","handle":"qa-c0e04c6cffad","displayName":"QA c0e04c6cffad","region":"in","role":"user","createdAt":"2026-10-27T08:00:33.924792149Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ef8deb33-b6d2-4ab0-8938-f3a368387cb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef8deb33-b6d2-4ab0-8938-f3a368387cb1
Content-Type: application/json

--- request body ---
{"handle":"qa-af0710dc4e08","password":"****"}

--- response: 200 in 54 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef8deb33-b6d2-4ab0-8938-f3a368387cb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6f253e6-e833-4194-aa04-d1f79a804337"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-437bc646-413b-413f-9b6a-b2d8b2b123c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-437bc646-413b-413f-9b6a-b2d8b2b123c7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7088ee3206c9","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-437bc646-413b-413f-9b6a-b2d8b2b123c7
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
Location: /v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862
X-Data-Region: us
Content-Length: 238

{"id":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","subject":"Project kickoff","status":"open","region":"us","participants":["qa-af0710dc4e08","qa-7088ee3206c9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.069525485Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9cdd6b3-0188-4236-8b46-0473519c4cbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9cdd6b3-0188-4236-8b46-0473519c4cbe
Content-Type: application/json

--- request body ---
{"handle":"qa-7088ee3206c9","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9cdd6b3-0188-4236-8b46-0473519c4cbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e842e8b-123a-4dcc-9b58-3a1f5021cfdd"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-71b79dba-7bea-4161-a65e-78c8956f03b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71b79dba-7bea-4161-a65e-78c8956f03b0
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-71b79dba-7bea-4161-a65e-78c8956f03b0
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

{"items":[{"id":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","subject":"Project kickoff","status":"open","region":"us","participants":["qa-af0710dc4e08","qa-7088ee3206c9"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-27T08:00:34.069525485Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages
correlation: qa-211f6e79-b0eb-4934-8752-681a5d0d10ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-211f6e79-b0eb-4934-8752-681a5d0d10ee
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-211f6e79-b0eb-4934-8752-681a5d0d10ee
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

{"items":[{"id":"msg_78a0c13a-3052-4b41-ae7d-2a997d60ac3a","conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","sender":"qa-af0710dc4e08","body":"Hi Ben, got a minute?","createdAt":"2026-10-27T08:00:34.069562284Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/read
correlation: qa-2e213090-8ad3-43b8-8cb4-3612b4eb274b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e213090-8ad3-43b8-8cb4-3612b4eb274b
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e213090-8ad3-43b8-8cb4-3612b4eb274b
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

{"conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862
correlation: qa-427e2af4-1779-4213-97e1-6411071d1144

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-427e2af4-1779-4213-97e1-6411071d1144
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-427e2af4-1779-4213-97e1-6411071d1144
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

{"id":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","subject":"Project kickoff","status":"open","region":"us","participants":["qa-af0710dc4e08","qa-7088ee3206c9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.069525485Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages
correlation: qa-3793c3e9-aba2-4f72-996d-bd2b595d2993

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3793c3e9-aba2-4f72-996d-bd2b595d2993
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3793c3e9-aba2-4f72-996d-bd2b595d2993
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

{"id":"msg_035149d4-072b-4b6b-93b3-8498e1828bc2","conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","sender":"qa-7088ee3206c9","body":"Sure, now works","createdAt":"2026-10-27T08:00:34.578100437Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages
correlation: qa-4ab62ece-0a2a-4f1c-852e-8dc419391349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ab62ece-0a2a-4f1c-852e-8dc419391349
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ab62ece-0a2a-4f1c-852e-8dc419391349
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

{"id":"msg_96c973b8-637a-460a-9565-1ea0496d0ce6","conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","sender":"qa-7088ee3206c9","body":"Calling you","createdAt":"2026-10-27T08:00:34.622104279Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862
correlation: qa-7c9ca683-87da-4e4d-a3a1-f78963e19253

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c9ca683-87da-4e4d-a3a1-f78963e19253
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c9ca683-87da-4e4d-a3a1-f78963e19253
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

{"id":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","subject":"Project kickoff","status":"open","region":"us","participants":["qa-af0710dc4e08","qa-7088ee3206c9"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-27T08:00:34.069525485Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages
correlation: qa-c9c6556e-4c53-451a-9979-5a153f460210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9c6556e-4c53-451a-9979-5a153f460210
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9c6556e-4c53-451a-9979-5a153f460210
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

{"items":[{"id":"msg_78a0c13a-3052-4b41-ae7d-2a997d60ac3a","conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","sender":"qa-af0710dc4e08","body":"Hi Ben, got a minute?","createdAt":"2026-10-27T08:00:34.069562284Z"},{"id":"msg_035149d4-072b-4b6b-93b3-8498e1828bc2","conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","sender":"qa-7088ee3206c9","body":"Sure, now works","createdAt":"2026-10-27T08:00:34.578100437Z"},{"id":"msg_96c973b8-637a-460a-9565-1ea0496d0ce6","conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","sender":"qa-7088ee3206c9","body":"Calling you","createdAt":"2026-10-27T08:00:34.622104279Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-e1a7dcb9-474c-4775-bf91-bae61f0ba3c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1a7dcb9-474c-4775-bf91-bae61f0ba3c1
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1a7dcb9-474c-4775-bf91-bae61f0ba3c1
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

{"balance":4,"currency":"credits","accountId":"acc_e6f253e6-e833-4194-aa04-d1f79a804337"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-c64c2314-fae4-4e14-9067-0c23012b2330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c64c2314-fae4-4e14-9067-0c23012b2330
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c64c2314-fae4-4e14-9067-0c23012b2330
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

{"balance":3,"currency":"credits","accountId":"acc_5e842e8b-123a-4dcc-9b58-3a1f5021cfdd"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-273d1975-d502-4eae-b74c-ff88a9b09d94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-273d1975-d502-4eae-b74c-ff88a9b09d94
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e04c6cffad","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-273d1975-d502-4eae-b74c-ff88a9b09d94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c95306f-af72-4411-93ba-1a683a004823"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862
correlation: qa-c711cf1c-2c36-45b5-a2ec-c3698a55801b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c711cf1c-2c36-45b5-a2ec-c3698a55801b
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c711cf1c-2c36-45b5-a2ec-c3698a55801b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","correlationId":"qa-c711cf1c-2c36-45b5-a2ec-c3698a55801b"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages
correlation: qa-d5967370-1b66-49a6-b353-34a67315a3db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5967370-1b66-49a6-b353-34a67315a3db
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5967370-1b66-49a6-b353-34a67315a3db
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages","correlationId":"qa-d5967370-1b66-49a6-b353-34a67315a3db"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages
correlation: qa-af05e3ee-4b38-48ac-9d18-1977c90f838c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af05e3ee-4b38-48ac-9d18-1977c90f838c
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af05e3ee-4b38-48ac-9d18-1977c90f838c
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages","correlationId":"qa-af05e3ee-4b38-48ac-9d18-1977c90f838c"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-635c212d-2598-4089-8467-1000048c36c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-635c212d-2598-4089-8467-1000048c36c3
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-635c212d-2598-4089-8467-1000048c36c3
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
correlation: qa-6dd08fd9-91da-4539-846d-4ece25f45a5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd08fd9-91da-4539-846d-4ece25f45a5b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dd08fd9-91da-4539-846d-4ece25f45a5b
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

{"balance":5,"currency":"credits","accountId":"acc_2c95306f-af72-4411-93ba-1a683a004823"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/close
correlation: qa-bf99190c-afad-41a4-a5d5-ceefa6458f51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf99190c-afad-41a4-a5d5-ceefa6458f51
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf99190c-afad-41a4-a5d5-ceefa6458f51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-af0710dc4e08","qa-7088ee3206c9"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-27T08:00:34.069525485Z","closedAt":"2026-10-27T08:00:35.629120388Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/close
correlation: qa-9d47c455-b733-453a-9823-913c29c65947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d47c455-b733-453a-9823-913c29c65947
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d47c455-b733-453a-9823-913c29c65947
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-af0710dc4e08","qa-7088ee3206c9"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-27T08:00:34.069525485Z","closedAt":"2026-10-27T08:00:35.629120388Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages
correlation: qa-4fc49bc9-2a6b-4a06-88cc-15489597380c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fc49bc9-2a6b-4a06-88cc-15489597380c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fc49bc9-2a6b-4a06-88cc-15489597380c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_78a0c13a-3052-4b41-ae7d-2a997d60ac3a","conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","sender":"qa-af0710dc4e08","body":"Hi Ben, got a minute?","createdAt":"2026-10-27T08:00:34.069562284Z"},{"id":"msg_035149d4-072b-4b6b-93b3-8498e1828bc2","conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","sender":"qa-7088ee3206c9","body":"Sure, now works","createdAt":"2026-10-27T08:00:34.578100437Z"},{"id":"msg_96c973b8-637a-460a-9565-1ea0496d0ce6","conversationId":"cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862","sender":"qa-7088ee3206c9","body":"Calling you","createdAt":"2026-10-27T08:00:34.622104279Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages
correlation: qa-3d73c9e1-cd4c-49ba-a121-7fe1388de96a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d73c9e1-cd4c-49ba-a121-7fe1388de96a
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d73c9e1-cd4c-49ba-a121-7fe1388de96a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_85a4eb09-aec1-419c-a01c-bb367cbd0862/messages","correlationId":"qa-3d73c9e1-cd4c-49ba-a121-7fe1388de96a"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-6c2ea3be-57ed-4bae-8e47-fa23b13ff994

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2ea3be-57ed-4bae-8e47-fa23b13ff994
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c2ea3be-57ed-4bae-8e47-fa23b13ff994
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_5e842e8b-123a-4dcc-9b58-3a1f5021cfdd"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1122597-1f10-430f-b814-37f0a36184a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1122597-1f10-430f-b814-37f0a36184a8
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1122597-1f10-430f-b814-37f0a36184a8
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
correlation: qa-d738ffbb-8478-4276-b73e-f41f930fdb03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d738ffbb-8478-4276-b73e-f41f930fdb03
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e04c6cffad","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d738ffbb-8478-4276-b73e-f41f930fdb03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d738ffbb-8478-4276-b73e-f41f930fdb03"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d57ef7e8-ce3e-4ec8-8213-6dbe91664119

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d57ef7e8-ce3e-4ec8-8213-6dbe91664119
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d57ef7e8-ce3e-4ec8-8213-6dbe91664119
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 9
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-f69585da-7833-489b-bfed-9441d77dda5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f69585da-7833-489b-bfed-9441d77dda5a
Content-Type: application/json

--- request body ---
{"handle":"qa-7088ee3206c9","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f69585da-7833-489b-bfed-9441d77dda5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f69585da-7833-489b-bfed-9441d77dda5a"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a36c7752-d7e1-48b0-9e0d-906834d56db8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a36c7752-d7e1-48b0-9e0d-906834d56db8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a36c7752-d7e1-48b0-9e0d-906834d56db8
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
correlation: qa-1876cbf3-706a-4983-ac5a-c115099ce4b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1876cbf3-706a-4983-ac5a-c115099ce4b2
Content-Type: application/json

--- request body ---
{"handle":"qa-af0710dc4e08","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1876cbf3-706a-4983-ac5a-c115099ce4b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1876cbf3-706a-4983-ac5a-c115099ce4b2"}
```
