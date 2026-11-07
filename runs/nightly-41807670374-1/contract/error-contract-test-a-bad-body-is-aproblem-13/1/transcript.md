# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-28052874-25ac-432f-a07c-e049b6468865` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-c9ce235a-bdb1-47a6-acc1-00eeaab4a9a1` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-ca332e1f-22c1-4983-85de-36ed7634d579` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-3c654e48-052b-4ac3-86dd-7e449e799052` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 14 | `qa-e4ef5dad-5901-400b-a54e-274451393940` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-bb9c15db-a0d0-4f43-b519-4987cc679abf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-7692037d-25f9-4ef4-8fc1-23fee407d7ad` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-b4870cf4-1850-4e34-9b67-dba5ba8a9d8e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-cbcc8e7b-ad16-4eaf-8a09-8eb278cbac02` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-be6a5c23-a707-4549-9fd0-c6d40b32f82a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-28052874-25ac-432f-a07c-e049b6468865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28052874-25ac-432f-a07c-e049b6468865
Content-Type: application/json

--- request body ---
{"handle":"qa-615c929a0979","displayName":"QA 615c929a0979","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-28052874-25ac-432f-a07c-e049b6468865
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Location: /v1/accounts/qa-615c929a0979
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56ac5643-fb31-475a-bd22-2f143546d1aa","handle":"qa-615c929a0979","displayName":"QA 615c929a0979","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.065511473Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c9ce235a-bdb1-47a6-acc1-00eeaab4a9a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9ce235a-bdb1-47a6-acc1-00eeaab4a9a1
Content-Type: application/json

--- request body ---
{"handle":"qa-1e6680f62cbf","displayName":"QA 1e6680f62cbf","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9ce235a-bdb1-47a6-acc1-00eeaab4a9a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Location: /v1/accounts/qa-1e6680f62cbf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_84238e66-7f1c-4429-8347-abd37c65eb94","handle":"qa-1e6680f62cbf","displayName":"QA 1e6680f62cbf","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.105581923Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ca332e1f-22c1-4983-85de-36ed7634d579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca332e1f-22c1-4983-85de-36ed7634d579
Content-Type: application/json

--- request body ---
{"handle":"qa-615c929a0979","password":"****"}

--- response: 200 in 46 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca332e1f-22c1-4983-85de-36ed7634d579
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56ac5643-fb31-475a-bd22-2f143546d1aa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3c654e48-052b-4ac3-86dd-7e449e799052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c654e48-052b-4ac3-86dd-7e449e799052
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1e6680f62cbf","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c654e48-052b-4ac3-86dd-7e449e799052
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
Location: /v1/conversations/cnv_3768eacb-75d5-48b3-a8b0-8cf687206a58
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3768eacb-75d5-48b3-a8b0-8cf687206a58","subject":"Error contract","status":"open","region":"eu","participants":["qa-615c929a0979","qa-1e6680f62cbf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.189943972Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3768eacb-75d5-48b3-a8b0-8cf687206a58/messages
correlation: qa-e4ef5dad-5901-400b-a54e-274451393940

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4ef5dad-5901-400b-a54e-274451393940
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4ef5dad-5901-400b-a54e-274451393940
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_3768eacb-75d5-48b3-a8b0-8cf687206a58/messages","correlationId":"qa-e4ef5dad-5901-400b-a54e-274451393940"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bb9c15db-a0d0-4f43-b519-4987cc679abf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb9c15db-a0d0-4f43-b519-4987cc679abf
Content-Type: application/json

--- request body ---
{"handle":"qa-1e6680f62cbf","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb9c15db-a0d0-4f43-b519-4987cc679abf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_84238e66-7f1c-4429-8347-abd37c65eb94"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7692037d-25f9-4ef4-8fc1-23fee407d7ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7692037d-25f9-4ef4-8fc1-23fee407d7ad
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7692037d-25f9-4ef4-8fc1-23fee407d7ad
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-b4870cf4-1850-4e34-9b67-dba5ba8a9d8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4870cf4-1850-4e34-9b67-dba5ba8a9d8e
Content-Type: application/json

--- request body ---
{"handle":"qa-1e6680f62cbf","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4870cf4-1850-4e34-9b67-dba5ba8a9d8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4870cf4-1850-4e34-9b67-dba5ba8a9d8e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cbcc8e7b-ad16-4eaf-8a09-8eb278cbac02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbcc8e7b-ad16-4eaf-8a09-8eb278cbac02
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cbcc8e7b-ad16-4eaf-8a09-8eb278cbac02
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-be6a5c23-a707-4549-9fd0-c6d40b32f82a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be6a5c23-a707-4549-9fd0-c6d40b32f82a
Content-Type: application/json

--- request body ---
{"handle":"qa-615c929a0979","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be6a5c23-a707-4549-9fd0-c6d40b32f82a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be6a5c23-a707-4549-9fd0-c6d40b32f82a"}
```
