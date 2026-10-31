# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 488 | `qa-518c8e27-8d14-4120-b27b-d8835dfa4c18` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-4c1b197c-a56c-40d9-b557-9fc1451ff67a` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-9e2f49af-8ec2-4829-88a3-22f6f93c9de0` |
| 4 | `POST /v1/conversations` | 201 | 82 | `qa-6987a053-f73a-489e-aaed-ab4a41fe7f65` |
| 5 | `GET /v1/conversations/{id}` | 200 | 27 | `qa-e2eec4a4-96e5-4950-bc81-8e5c88dbaea9` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-c3df46eb-56e7-434e-a9d0-5a15e5ab017e` |
| 7 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-3ee7ac27-ca21-4819-80e9-138489a6032c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-744f7262-f690-48c3-b507-beb932a6749c` |
| 9 | `POST /v1/auth/token` | 401 | 24 | `qa-fc264cbd-b07f-4a87-bcef-023e2a7845c6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-233e3471-8595-4ded-87cc-d70225325f95` |
| 11 | `POST /v1/auth/token` | 401 | 43 | `qa-363da3bf-fc33-417c-aa5f-0c0447b338da` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-518c8e27-8d14-4120-b27b-d8835dfa4c18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-518c8e27-8d14-4120-b27b-d8835dfa4c18
Content-Type: application/json

--- request body ---
{"handle":"qa-79f0796f6877","displayName":"QA 79f0796f6877","password":"****","region":"in"}

--- response: 201 in 488 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-518c8e27-8d14-4120-b27b-d8835dfa4c18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-79f0796f6877
X-Served-Region: in
Content-Length: 181

{"id":"acc_8854efc7-a02c-482f-8c07-dc51820dddee","handle":"qa-79f0796f6877","displayName":"QA 79f0796f6877","region":"in","role":"user","createdAt":"2026-10-25T07:40:25.355714699Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4c1b197c-a56c-40d9-b557-9fc1451ff67a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c1b197c-a56c-40d9-b557-9fc1451ff67a
Content-Type: application/json

--- request body ---
{"handle":"qa-792d7d58ddc5","displayName":"QA 792d7d58ddc5","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c1b197c-a56c-40d9-b557-9fc1451ff67a
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
Location: /v1/accounts/qa-792d7d58ddc5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19dc3fb8-c9b9-494c-94de-e1547815bb3e","handle":"qa-792d7d58ddc5","displayName":"QA 792d7d58ddc5","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.977963829Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9e2f49af-8ec2-4829-88a3-22f6f93c9de0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e2f49af-8ec2-4829-88a3-22f6f93c9de0
Content-Type: application/json

--- request body ---
{"handle":"qa-79f0796f6877","password":"****"}

--- response: 200 in 60 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e2f49af-8ec2-4829-88a3-22f6f93c9de0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8854efc7-a02c-482f-8c07-dc51820dddee"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6987a053-f73a-489e-aaed-ab4a41fe7f65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6987a053-f73a-489e-aaed-ab4a41fe7f65
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-792d7d58ddc5","subject":"Across regions","message":"Namaste"}

--- response: 201 in 82 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6987a053-f73a-489e-aaed-ab4a41fe7f65
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
Location: /v1/conversations/cnv_28e0ac60-b942-4c71-af71-fe314c62a7c0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_28e0ac60-b942-4c71-af71-fe314c62a7c0","subject":"Across regions","status":"open","region":"eu","participants":["qa-79f0796f6877","qa-792d7d58ddc5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.198263764Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_28e0ac60-b942-4c71-af71-fe314c62a7c0
correlation: qa-e2eec4a4-96e5-4950-bc81-8e5c88dbaea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2eec4a4-96e5-4950-bc81-8e5c88dbaea9
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2eec4a4-96e5-4950-bc81-8e5c88dbaea9
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_28e0ac60-b942-4c71-af71-fe314c62a7c0","subject":"Across regions","status":"open","region":"eu","participants":["qa-79f0796f6877","qa-792d7d58ddc5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.198263764Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c3df46eb-56e7-434e-a9d0-5a15e5ab017e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3df46eb-56e7-434e-a9d0-5a15e5ab017e
Content-Type: application/json

--- request body ---
{"handle":"qa-792d7d58ddc5","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3df46eb-56e7-434e-a9d0-5a15e5ab017e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19dc3fb8-c9b9-494c-94de-e1547815bb3e"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_28e0ac60-b942-4c71-af71-fe314c62a7c0
correlation: qa-3ee7ac27-ca21-4819-80e9-138489a6032c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ee7ac27-ca21-4819-80e9-138489a6032c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ee7ac27-ca21-4819-80e9-138489a6032c
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_28e0ac60-b942-4c71-af71-fe314c62a7c0","subject":"Across regions","status":"open","region":"eu","participants":["qa-79f0796f6877","qa-792d7d58ddc5"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-25T07:40:26.198263764Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-744f7262-f690-48c3-b507-beb932a6749c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-744f7262-f690-48c3-b507-beb932a6749c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-744f7262-f690-48c3-b507-beb932a6749c
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-fc264cbd-b07f-4a87-bcef-023e2a7845c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc264cbd-b07f-4a87-bcef-023e2a7845c6
Content-Type: application/json

--- request body ---
{"handle":"qa-792d7d58ddc5","password":"****"}

--- response: 401 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc264cbd-b07f-4a87-bcef-023e2a7845c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc264cbd-b07f-4a87-bcef-023e2a7845c6"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-233e3471-8595-4ded-87cc-d70225325f95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-233e3471-8595-4ded-87cc-d70225325f95
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-233e3471-8595-4ded-87cc-d70225325f95
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-363da3bf-fc33-417c-aa5f-0c0447b338da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-363da3bf-fc33-417c-aa5f-0c0447b338da
Content-Type: application/json

--- request body ---
{"handle":"qa-79f0796f6877","password":"****"}

--- response: 401 in 43 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-363da3bf-fc33-417c-aa5f-0c0447b338da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-363da3bf-fc33-417c-aa5f-0c0447b338da"}
```
